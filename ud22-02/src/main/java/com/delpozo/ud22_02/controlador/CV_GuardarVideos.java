package com.delpozo.ud22_02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.delpozo.ud22_02.modelo.Video;
import com.delpozo.ud22_02.modelo.VideoDAO;
import com.delpozo.ud22_02.vista.V_GuardarVideos;

/**
 * Controlamos todos lo eventos que se realizan en la V_GuardarCliente
 * 
 * @author Alberto
 *
 */
public class CV_GuardarVideos {

	private V_GuardarVideos vistaGuardar;
	private VideoDAO videoDAO;
	private Video video;

	/**
	 * Constructor encargado de poner a la escucha los botones Consulta y Cancelar
	 * 
	 * @param vistaGuardar
	 * @param videoDAO
	 */
	public CV_GuardarVideos(V_GuardarVideos vistaGuardar, VideoDAO videoDAO) {
		this.vistaGuardar = vistaGuardar;
		this.videoDAO = videoDAO;
		this.video = new Video();

		// Listener del boton Guardar
		vistaGuardar.getBtnGuardar().addActionListener(btnGuardar);
		vistaGuardar.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Guarda los datos del video en la bbdd
	ActionListener btnGuardar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Obtenemos los datos del video
			video.setTitulo(vistaGuardar.getTxtTitulo().getText());
			video.setDirector(vistaGuardar.getTxtDirector().getText());
			
			// Guardamos los datos del video
			videoDAO.guardar(video);

			// Cerrar la ventana despues de guardar los cambios
			vistaGuardar.dispose();
		}
	};

	// Cerramos la ventana volviendo a la ventana pricipal
	ActionListener btnCancelar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			vistaGuardar.dispose();

		}

	};

	// Getters
	public V_GuardarVideos getVistaVideos() {
		return vistaGuardar;
	}

	public VideoDAO getVideoDAO() {
		return videoDAO;
	}

	public Video getVideo() {
		return video;
	}

}
