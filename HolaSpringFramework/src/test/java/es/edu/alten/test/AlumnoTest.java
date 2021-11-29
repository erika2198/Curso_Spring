package es.edu.alten.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.alten.modelo.Alumno;

class AlumnoTest {

	Alumno alumnoVacio = null;
	Alumno alumnoGabriel = null;

	@BeforeEach
	void setUp() throws Exception {
		alumnoVacio = new Alumno();
		alumnoGabriel = new Alumno(1, "Gabriel", "Casas", "Ing en Electronica en proceso",
				"http://gitlab/gcasas19727CursoJava.git");
	}

	@AfterEach
	void tearDown() throws Exception {
		alumnoVacio = null;
		alumnoGabriel = null;
	}

	void testEqualsObject_TRUE() {
		assertTrue(alumnoGabriel.equals(new Alumno(1, "Gabriel", "Casas", null, null)));
	}

	@Test
	void testEqualsObject_FALSE() {
		assertFalse(alumnoVacio.equals(alumnoGabriel));
	}

	@Test
	void testIsEmpty_TRUE() {
		assertTrue(alumnoVacio.isEmpty());
	}

	@Test
	void testIsEmpty_FALSE() {
		assertFalse(alumnoGabriel.isEmpty());
	}

}
