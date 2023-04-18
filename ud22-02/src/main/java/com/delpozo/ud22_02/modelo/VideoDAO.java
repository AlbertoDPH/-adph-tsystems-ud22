package com.delpozo.ud22_02.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Clase encargada de hacer contruir todas las peticiones a la BBDD
 * 
 * @author Alberto
 *
 */
public class VideoDAO {

	// Declaramos objeto de tipo Conexion
	private Conexion conexion;
	// Declaramos objeto de tipo Video
	private Video video;

	// Creamos una conexion con el constructor
	public VideoDAO() {
		conexion = new Conexion();

	}

	// Guardamos los datos del video en la bbdd
	public void guardar(Video video) {
		ClienteDAO clienteDAO = new ClienteDAO();
		// Guardamos la query
		String sql = "INSERT INTO videos (titulo, director,cli_id) VALUES (?, ?, ?)";
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
			// video
			stmt.setString(1, video.getTitulo());
			stmt.setString(2, video.getDirector());

			// Lo usaremos cuando el video se le asigne a algun cliente
			if (video.getCli_id() > 0) {
				stmt.setInt(3, video.getCli_id());
			} else {
				stmt.setNull(3, java.sql.Types.INTEGER);
			}

			// Ejecutamos al consulta
			stmt.executeUpdate();

		} catch (SQLException e) {
			// Controla excepciones de errores en la bbdd
			e.printStackTrace();

		}

	}

	// Actualizamos los datos del video en la bbdd
	public void actualizar(Video video) {
		// Guardamos la consulta
		String sql = "UPDATE videos SET titulo=?, director=?, cli_id=? WHERE id=?";
		try {
			// preparamos la conexion y le pasamos al consulta 'sql'
			PreparedStatement stmt = conexion.getConexion().prepareStatement(sql);
			// se guardan los valores en los parametros de la consulta que se obtienen del
			// video
			stmt.setString(1, video.getTitulo());
			stmt.setString(2, video.getDirector());
			stmt.setInt(3, video.getCli_id());
			stmt.setInt(4, video.getId());
			
			 // Ejecutamos al consulta
//	        int filasAfectadas = stmt.executeUpdate();
//	        System.out.println("Filas afectadas: " + filasAfectadas);

			// Ejecutamos al consulta
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Recogemos la consulta de la bbdd
	public Video consultar(String db, String table, int id) {

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

				// Guardamos la informacion del ResultSet en un obejto video
				video = new Video(resultSet.getInt("id"), resultSet.getString("titulo"),
						resultSet.getString("director"), resultSet.getInt("cli_id"));

				// Si el id video = al que estamos buscando, deja de buscar en el resto de
				// ResultSet
				if (id == video.getId()) {
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error en la entrada de datos");
		}
		// Devuelve le objeto video
		return video;
	}

	// Eliminamos el registro de la bbdd
	public void eliminar(int id) {
		String sql = "DELETE FROM videos WHERE id=?";
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
