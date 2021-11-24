package es.edu.alten.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaDeConexion {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		Statement stn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alten?serverTimezone=UTC", "root", "root");
			stn = con.createStatement();
			rs = stn.executeQuery("select alu_id, alu_nombre, alu_apellido from alumnos");

			while (rs.next()) {
				System.out.println("id=" + rs.getInt("alu_id"));
				System.out.println("nombre=" + rs.getString("alu_nombre"));
				System.out.println("apellido=" + rs.getString("alu_apellido"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stn.close();
			rs.close();
		}

	}

}
