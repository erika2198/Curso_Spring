package es.edu.alten.practica0.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.alten.practica0.modelo.Papel;
import es.edu.alten.practica0.modelo.Piedra;
import es.edu.alten.practica0.modelo.PiedraPapelTijeraFactory;
import es.edu.alten.practica0.modelo.Tijera;

class PiedraPapelTijeraFactoryTest {

	// 1- lote pruebas
	PiedraPapelTijeraFactory piedra;
	PiedraPapelTijeraFactory papel;
	PiedraPapelTijeraFactory tijera;

	@BeforeEach
	void setUp() throws Exception {

		// Se ejecuta antes de cada método
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {

		// se ejecuta después de cada prueba
		piedra = null;
		papel = null;
		tijera = null;
	}

	@Test
	void testGetInstancePiedra() {
		assertEquals("piedra",
				PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA).getNombre().toLowerCase());
	}

	@Test
	void testGetInstancePapel() {
		assertEquals("papel",
				PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL).getNombre().toLowerCase());
	}

	@Test
	void testGetInstanceTijera() {
		assertEquals("tijera",
				PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA).getNombre().toLowerCase());
	}

	@Test
	void testCompararPiedraPierdeConPapel() {
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("piedra perdió con papel", piedra.getDescripcionResultado().toLowerCase());
	}

	@Test
	void testCompararPiedraGanaATijera() {
		// TODO para mis queridos alumnos testCompararPiedraGanaATijera
		assertEquals(1, piedra.comparar(tijera));
		assertEquals("piedra ganó a tijera", piedra.getDescripcionResultado().toLowerCase());
	}

	@Test
	void testCompararPiedraEmpataConPiedra() {
		// TODO para mis queridos alumnos CompararPiedraEmpataConPiedra, agregar el
		// texto del empate en todos loados
		assertEquals(0, piedra.comparar(piedra));
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado().toLowerCase());
	}

	@Test
	void testCompararPapelGanaConPiedra() {
		// TODO para mis queridos alumnos testCompararPapelGanaConPiedra
		assertEquals(1, papel.comparar(piedra));
		assertEquals("papel ganó a piedra", papel.getDescripcionResultado().toLowerCase());

	}

	@Test
	void testCompararPapelPierdeConTijera() {
		// TODO para mis queridos alumnos testCompararPapelPierdeConTijera
		assertEquals(-1, papel.comparar(tijera));
		assertEquals("papel perdió con tijera", papel.getDescripcionResultado().toLowerCase());

	}

	@Test
	void testCompararPapelEmpataConPapel() {
		// TODO para mis queridos alumnos testCompararPapelEmpataConPapel
		assertEquals(0, papel.comparar(papel));
		assertEquals("papel empata con papel", papel.getDescripcionResultado().toLowerCase());

	}

	@Test
	void testCompararTijeraGanaAPapel() {
		// TODO para mis queridos alumnos testCompararTijeraGanaAPapel()
		assertEquals(1, tijera.comparar(papel));
		assertEquals("tijera ganó a papel", tijera.getDescripcionResultado().toLowerCase());

	}

	@Test
	void testCompararTijeraPierdeConPiedra() {
		// TODO para mis queridos alumnos testCompararTijeraPierdeConPiedra
		assertEquals(-1, tijera.comparar(piedra));
		assertEquals("tijera perdió con piedra", tijera.getDescripcionResultado().toLowerCase());

	}

	@Test
	void testCompararTijeraEmpataConTijera() {
		// TODO para mis queridos alumnos testCompararTijeraEmpataConTiera
		assertEquals(0, tijera.comparar(tijera));
		assertEquals("tijera empata con tijera", tijera.getDescripcionResultado().toLowerCase());

	}
}
