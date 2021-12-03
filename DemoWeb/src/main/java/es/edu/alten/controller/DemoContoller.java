package es.edu.alten.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DemoWebApplication;

import es.edu.alten.model.Persona;
import es.edu.alten.repo.IPersonaRepo;

@Controller
public class DemoContoller extends DemoWebApplication {

	@Autowired
	private IPersonaRepo repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		
		Persona persona = new Persona(1, "Erika Castro");
		repo.save(persona);
		
		model.addAttribute("name", name);
		return "greeting";
	}

}
