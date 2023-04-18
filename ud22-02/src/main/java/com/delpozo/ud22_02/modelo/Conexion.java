package com.delpozo.ud22_02.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Conexion
public class Conexion {

	private final String url = "jdbc:mysql://192.168.1.153:3306/ud22_ejer2";
	private final String user = "remote";
	private final String password = "Aa802000**";
	
	Connection connection = null;

	public Connection getConexion() {
		try {
			// Cargar el driver de MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establecer la conexión con la base de datos
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
