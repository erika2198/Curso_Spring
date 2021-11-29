package es.edu.alten.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.edu.alten.modelo.Alumno;
import es.edu.alten.modelo.Model;
import es.edu.alten.util.ConnectionManager;

public class AlumnoDAO implements DAO {

	private final String GET_ALL_QUERY = "SELECT alu_id, alu_nombre, alu_apellido, alu_conocimientos, alu_git FROM alumnos";
	private final String INSERT_QUERY = "INSERT INTO alumnos(alu_nombre, alu_apellido, alu_conocimientos, alu_git) VALUES(?,?,?,?)";
	private final String DELETE_QUERY = "DELETE FROM alumnos WHERE alu_id=?";
	private final String UPDATE_QUERY = "UPDATE alumnos SET alu_nombre=?, alu_apellido=? WHERE alu_id=?";

	@Override
	public void agregar(Model pModel) throws ClassNotFoundException, SQLException {

		ConnectionManager.conectar();
		Connection conn = ConnectionManager.getConnection();

		Alumno alumno = (Alumno) pModel;

		PreparedStatement stm = conn.prepareStatement(INSERT_QUERY);
		stm.setString(1, alumno.getNombre());
		stm.setString(2, alumno.getApellido());
		stm.setString(3, alumno.getEstudios());
		stm.setString(4, alumno.getLinkArepositorio());
		stm.execute();

	}

	@Override
	public void modificar(Model pModel) throws ClassNotFoundException, SQLException {

		ConnectionManager.conectar();
		Connection conn = ConnectionManager.getConnection();

		Alumno alumno = (Alumno) pModel;

		PreparedStatement stm = conn.prepareStatement(UPDATE_QUERY);
		stm.setString(1, alumno.getNombre());
		stm.setString(2, alumno.getApellido());
		stm.setInt(3, alumno.getCodigo());

		stm.executeUpdate();

	}

	@Override
	public void eliminar(Model pModel) throws ClassNotFoundException, SQLException {

		ConnectionManager.conectar();
		Connection conn = ConnectionManager.getConnection();

		Alumno alumno = (Alumno) pModel;

		PreparedStatement stm = conn.prepareStatement(DELETE_QUERY);
		stm.setInt(1, alumno.getCodigo());

		stm.executeUpdate();

	}

	@Override
	public List<Model> leer(Model pModel) throws ClassNotFoundException, SQLException {

		List<Model> lista = new ArrayList<Model>();
		ConnectionManager.conectar();
		Connection conn = ConnectionManager.getConnection();
		StringBuilder sql = new StringBuilder(GET_ALL_QUERY);

		Alumno alumno = (Alumno) pModel;
		if (alumno.getCodigo() > 0) {
			sql.append(" where alu_id=?");
		}

		PreparedStatement stm = conn.prepareStatement(sql.toString());

		if (alumno.getCodigo() > 0) {
			stm.setInt(1, alumno.getCodigo());
		}

		ResultSet rs = stm.executeQuery();

		while (rs.next()) {
			alumno = new Alumno();
			alumno.setCodigo(rs.getInt("alu_id"));
			alumno.setNombre(rs.getString("alu_nombre"));
			alumno.setApellido(rs.getString("alu_apellido"));
			alumno.setEstudios(rs.getString("alu_conocimientos"));
			alumno.setLinkArepositorio(rs.getString("alu_git"));
			lista.add(alumno);
		}
		return lista;
	}

}
