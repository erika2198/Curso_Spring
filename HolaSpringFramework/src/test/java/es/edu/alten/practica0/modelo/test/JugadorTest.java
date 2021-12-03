package es.edu.alten.practica0.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.edu.alten.practica0.modelo.Jugador;

class JugadorTest {
	
	ClassPathXmlApplicationContext context = null;
	ClassPathXmlApplicationContext context2 = null;
	Jugador jug1 = null, jug2 = null;

	@BeforeEach
	void setUp() throws Exception {
		
		context = new ClassPathXmlApplicationContext("META_INF/juego/jugador.xml");
		context = new ClassPathXmlApplicationContext("META_INF/juego/jugador2.xml");
		jug1 = context.getBean(Jugador.class);
		jug2 = context2.getBean(Jugador.class);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		context = null;
		context2 = null;
		jug1 = null;
		jug2 = null;
	}

	@Test
	void testGetBeanAttributes() {
		
		assertEquals(1, jug1.getCodigo());
		assertEquals("Erika", jug1.getNombre());
		assertEquals("eri", jug1.getNickname());
		assertEquals("piedra", jug1.getJugadaElegida().getNombre());
	}
	
	@Test
	void testGetBeanAttributes2() {
		
		assertEquals(2, jug2.getCodigo());
		assertEquals("compu", jug2.getNombre());
		assertEquals("pc", jug2.getNickname());
		assertEquals("spock", jug2.getJugadaElegida().getNombre());
	}
	

}
