package com.delpozo.ud22_02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.delpozo.ud22_02.modelo.Cliente;
import com.delpozo.ud22_02.modelo.ClienteDAO;
import com.delpozo.ud22_02.modelo.Video;
import com.delpozo.ud22_02.modelo.VideoDAO;
import com.delpozo.ud22_02.vista.V_EliminarCliente;
import com.delpozo.ud22_02.vista.V_EliminarVideo;

/**
 * Controlamos todos lo eventos que se realizan en la V_EliminarCliente
 * 
 * @author Alberto
 *
 */
public class CV_EliminarVideo {

	private V_EliminarVideo vistaEliminar;
	private VideoDAO videoDAO;
	private Video video;

	/**
	 * Constructor encargado de poner a la escucha el boton Eliminar
	 * 
	 * @param vistaEliminar
	 * @param videoDAO
	 * @param video
	 */
	public CV_EliminarVideo(V_EliminarVideo vistaEliminar, VideoDAO videoDAO, Video video) {
		this.vistaEliminar = vistaEliminar;
		this.videoDAO = videoDAO;
		this.video = video;

		// Asignar listener al botón Eliminar
		vistaEliminar.getBtnEliminar().addActionListener(btnEliminar);
	}

	ActionListener btnEliminar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Ejecutamos la funcion eliminar desde ClienteDAO y le pasamos el id parseado
			// recogido en el campo JTextField ID
			videoDAO.eliminar(Integer.parseInt(vistaEliminar.getTxtId().getText()));
			vistaEliminar.dispose();

			JOptionPane.showMessageDialog(null, "Registro borrado de la bbdd");
		}
	};

	// Getters
	public V_EliminarVideo getVistaEliminar() {
		return vistaEliminar;
	}

	public VideoDAO getVideoDAO() {
		return videoDAO;
	}

	public Video getVideo() {
		return video;
	}

}
