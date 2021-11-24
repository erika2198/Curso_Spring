package es.domain.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.edu.alten.modelo.Alumno;
import es.edu.alten.modelo.dao.AlumnoDAO;
import es.edu.alten.modelo.dao.DAO;
import es.edu.alten.practica0.modelo.*;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String goIndex(Model model) {
		return "Index";
	}

	@RequestMapping("/")
	public String getPresentacion() {
		return "Presentacion";
	}

	@RequestMapping("/listado")
	public String goListado(Model model) throws ClassNotFoundException, SQLException {

		List<es.edu.alten.modelo.Model> alumnos= null;
		DAO aluDao = new AlumnoDAO();
		alumnos= aluDao.leer();
		
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("titulo", "Lista de alumnos");
		
		return "Listado";
	}

	@RequestMapping("/juego")
	public String goListadoPiedra(String nombre, Model model) {

		List<PiedraPapelTijeraFactory> opciones = new ArrayList<PiedraPapelTijeraFactory>();
		for (int i = 1; i < 6; i++)
			opciones.add(PiedraPapelTijeraFactory.getInstance(i));

		model.addAttribute("opciones", opciones);
		model.addAttribute("nombre", "Juego Piedra, Papel, Tijera, Lagarto o Spock");

		return "PiedraPapelTijera";

	}

	@RequestMapping(value = "/resolverJuego")
	public String goResultado(@RequestParam(required = false) Integer selOpcion, Model model) {

		// Genera numero aleatorios entre 1 y 5
		PiedraPapelTijeraFactory eligeComputadora = PiedraPapelTijeraFactory.getInstance((int) (Math.random() * 5 + 1));
		PiedraPapelTijeraFactory eligeJugador = PiedraPapelTijeraFactory.getInstance(selOpcion.intValue());

		eligeJugador.comparar(eligeComputadora);

		model.addAttribute("jugador", eligeJugador);
		model.addAttribute("computadora", eligeComputadora);
		model.addAttribute("resultado", eligeJugador.getDescripcionResultado());

		return "MostrarResultado";
	}

}