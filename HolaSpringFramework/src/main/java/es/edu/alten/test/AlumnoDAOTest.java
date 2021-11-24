package es.edu.alten.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import es.edu.alten.modelo.Alumno;
import es.edu.alten.modelo.dao.AlumnoDAO;
import es.edu.alten.util.ConnectionManager;

class AlumnoDAOTest {

	Alumno aluNuevo = null;
	AlumnoDAO aluDao = null;
	Alumno aluModificar = null;
	Alumno aluEliminar = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// voy a armar un lote de pruebas que tenga
		// 1 alumno para eliminar en la base de datos
		// 1- alumno para modificar
		// 1- alumno para leer.
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// elimino todos lose testeo
		// ojo con el que se modifi
		// y tambien el que se agrego.

		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConnection();
		Statement stm = con.createStatement();

		stm.execute("delete from alumnos where alu_nombre ='Gabriel_test'");

		ConnectionManager.desconectar();
	}

	@BeforeEach
	void setUp() throws Exception {
		aluNuevo = new Alumno(0, "Gabriel_test", "Casas_test", "Estudios_test", "Repo_test");
		aluModificar = new Alumno(15, "Mateo", "Lopez", "Estudios_test", "Repo_test");
		aluEliminar = new Alumno(33, "Mateo", "Lopez", "Estudios_test", "Repo_test");
		aluDao = new AlumnoDAO();

	}

	@AfterEach
	void tearDown() throws Exception {
		aluNuevo = null;
		aluDao = null;
		aluModificar = null;
		aluEliminar = null;
	}

	@Test
	void testAgregar() {
		try {
			aluDao.agregar(aluNuevo);
			// la unica forma de sber que andu

			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm
					.executeQuery("select alu_nombre, alu_apellido from alumnos where alu_nombre ='Gabriel_test'");

			assertTrue(rs.next());

			ConnectionManager.desconectar();

		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);

		}
	}

	@Test
	void testModificar() {

		try {
			aluDao.modificar(aluEliminar);

			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select alu_nombre, alu_apellido from alumnos where alu_nombre ='Mateo'");

			assertTrue(rs.next());

			ConnectionManager.desconectar();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);

		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

	@Test
	void testEliminar() {

		try {
			aluDao.eliminar(aluEliminar);

			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select alu_nombre, alu_apellido from alumnos where alu_nombre ='Mateo'");

			assertTrue(rs.next());

			ConnectionManager.desconectar();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);

		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	@Test
	void testLeer() {

		try {
			aluDao.leer(aluEliminar);

			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm
					.executeQuery("select alu_id, alu_nombre, alu_apellido, alu_conocimientos, alu_git from alumnos");

			assertTrue(rs.next());

			ConnectionManager.desconectar();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);

		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}

	}

}
