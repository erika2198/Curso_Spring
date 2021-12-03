package es.edu.alten.practica0.modelo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.edu.alten.practica0.modelo.Auditoria;
import es.edu.alten.practica0.modelo.Jugada;
import es.edu.alten.practica0.modelo.Jugador;

class JugadorTest {
	
	ClassPathXmlApplicationContext context = null, context2 = null, context3 = null;
	Jugador jug1 = null, jug2 = null;
	Jugada jugada = null;
	Auditoria auditoria = null;

	@BeforeEach
	void setUp() throws Exception {
		
		context = new ClassPathXmlApplicationContext("META-INF/juego/jugador.xml");
		context2 = new ClassPathXmlApplicationContext("META-INF/juego/jugador2.xml");
		context3 = new ClassPathXmlApplicationContext("META-INF/juego/jugada.xml");
		
		jug1 = context.getBean(Jugador.class);
		jug2 = context2.getBean(Jugador.class);
		jugada = context3.getBean(Jugada.class);
		auditoria = context3.getBean(Auditoria.class);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		context = null;
		context2 = null;
		jug1 = null;
		jug2 = null;
		auditoria = null;
	}
	
	@Test
	void testAuditoriaGetCantidad() {
		jugada.getDescripcionDelResultado();
		jugada.getDescripcionDelResultado();
		jugada.getDescripcionDelResultado();
		assertEquals(3, auditoria.getCantidadJugadas());		
	}
	
	@Test
	void testGetBeanAttributesJugada() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		assertEquals(1				, jugada.getCodigo());
		assertEquals("2010-01-31"	, sdf.format(jugada.getFechaHora()));
		assertEquals("Erika"		, jugada.getJugador1().getNombre());
		assertEquals("style"		, jugada.getJugador2().getNickname());
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
		assertEquals("Harry", jug2.getNombre());
		assertEquals("style", jug2.getNickname());
		assertEquals("Spock", jug2.getJugadaElegida().getNombre());
	}
	

}
