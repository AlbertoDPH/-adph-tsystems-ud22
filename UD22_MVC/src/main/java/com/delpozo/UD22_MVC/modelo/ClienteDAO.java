package com.delpozo.UD22_MVC.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase encargada de hacer contruir todas las peticiones a la BBDD
 * 
 * @author Alberto
 *
 */
public class ClienteDAO {

	// Declaramos objeto de tipo Conexion
	private Conexion conexion;
	// Declaramos objeto de tipo Cliente
	private Cliente cliente;

	// Creamos una conexion con el constructor
	public ClienteDAO() {
		conexion = new Conexion();

	}

	// Guardamos los datos del cliente en la bbdd
	public void guardar(Cliente cliente) {
		// Guardamos la query
		String sql = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?)";
		// Creamos un objeto PreparedStatement
		PreparedStatement stmt = null;
		// Declaramos un objeto Conecction y lo iniciamos en null
		Connection conn = null;
		try {
			// obtenemos la conexion con la bbdd
			conn = conexion.getConexion();
			// se prepara la conexion y le pasamos la query 'sql'
			stmt = conn.prepareStatement(sql);

			// se guardan los valores en los parametros de la consulta que se obtienen del
			// cliente
			stmt.setString(1, cliente.getNombre());
			stmt.setString(2, cliente.getApellido());
			stmt.setString(3, cliente.getDireccion());
			stmt.setInt(4, cliente.getDni());

			// obtenemos la fecha desde el cliente
			Date fecha = cliente.getFecha();
			// Convertir java.util.Date a java.sql.Date
			java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
			// guardamos el valor de la fecha en los parametros de la consulta obtenidos del
			// cliente
			stmt.setDate(5, fechaSql);

			// Ejecutamos al consulta
			stmt.executeUpdate();

		} catch (SQLException e) {
			// Controla excepciones de errores en la bbdd
			e.printStackTrace();

		}
	}

	// Actualizamos los datos del cliente en la bbdd
	public void actualizar(Cliente cliente) {
		// Guardamos la consulta
		String sql = "UPDATE cliente SET id=?, nombre=?, apellido=?, direccion=?, dni=?, fecha=? WHERE id=?";
		try {
			// preparamos la conexion y le pasamos al consulta 'sql'
			PreparedStatement stmt = conexion.getConexion().prepareStatement(sql);
			// se guardan los valores en los parametros de la consulta que se obtienen del
			// cliente
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getNombre());
			stmt.setString(3, cliente.getApellido());
			stmt.setString(4, cliente.getDireccion());
			stmt.setInt(5, cliente.getDni());

			// obtenemos la fecha desde el cliente
			Date fecha = cliente.getFecha();
			// Convertir java.util.Date a java.sql.Date
			java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
			stmt.setDate(6, fechaSql);

			stmt.setInt(7, cliente.getId());
			// Ejecutamos al consulta
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Recogemos la consulta de la bbdd
	public Cliente consultar(String db, String table, int id) {

		try {
			// guardamos en una variable la bbdd que vamos a usar
			String queryDB = "USE " + db + ";";
			// preparamos la conexion
			Statement stmt = conexion.getConexion().createStatement();
			// Ejecutamos al consulta y le pasamos la bddd que usaremos
			stmt.executeUpdate(queryDB);

			// guardamos la query
			String sql = "SELECT * FROM " + table;
			// preparamos la conexion
			Statement st = conexion.getConexion().createStatement();

			// Objeto de tipo ResulSet que usaremos para guardar los datos de la bbdd
			ResultSet resultSet;
			resultSet = stmt.executeQuery(sql);

			// Recorremos el ResultSet
			while (resultSet.next()) {

				// Guardamos la informacion del ResultSet en un obejto cliente
				cliente = new Cliente(resultSet.getInt("id"), resultSet.getString("nombre"),
						resultSet.getString("apellido"), resultSet.getString("direccion"), resultSet.getInt("dni"),
						resultSet.getDate("fecha"));

				// Si el id cliente = al que estamos buscando, deja de buscar en el resto de
				// ResultSet
				if (id == cliente.getId()) {
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error en la entrada de datos");
		}
		// Devuelve le objeto cliente
		return cliente;
	}

	// Eliminamos el registro de la bbdd
	public void eliminar(int id) {
		String sql = "DELETE FROM cliente WHERE id=?";
		try {

			PreparedStatement stmt = conexion.getConexion().prepareStatement(sql);
			// Le pasamos al objeto PreparedStatement el valor del la columna y su columna
			// (1,id)
			stmt.setInt(1, id);
			// Ejecutamos la consulta
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al borrar el registro");
		}
	}
}
