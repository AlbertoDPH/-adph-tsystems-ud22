package com.delpozo.ud22_02.controlador;

import java.awt.event.*;
import java.sql.Date;
import java.time.LocalDate;
import com.delpozo.ud22_02.modelo.*;
import com.delpozo.ud22_02.vista.*;

/**
 * Controlamos todos lo eventos que se realizan en la V_ActualizarCliente
 * @author Alberto
 *
 */
public class CV_ActualizarVideo {

	private V_ActualizarVideo vistaActua;
	private VideoDAO videoDAO;
	private Video video;

	/**
	 * Constructor encargado de poner a la escucha los botones Actualizar y Cancelar
	 * @param vistaActua
	 * @param clienteDAO
	 */
	public CV_ActualizarVideo(V_ActualizarVideo vistaActua, VideoDAO videoDAO) {
		this.vistaActua = vistaActua;
		this.videoDAO = videoDAO;
		this.video= new Video();

		// Controlamos los eventos de los botones
		vistaActua.getBtnGuardar().addActionListener(btnActualizar);
		vistaActua.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Actuliza los datos del video en la bbdd
	ActionListener btnActualizar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Obtenemos los datos del video
			video.setTitulo(vistaActua.getTxtTitulo().getText());
			video.setDirector(vistaActua.getTxtDirector().getText());

			// Cerrar la ventana despues de guardar los cambios
			vistaActua.dispose();
		}
	};

	// Cerramos la ventana volviendo a la ventana pricipal
	ActionListener btnCancelar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			vistaActua.dispose();

		}

	};

	// Getters
	public V_ActualizarVideo getVistaVideo() {
		return vistaActua;
	}

	public VideoDAO getVideoDAO() {
		return videoDAO;
	}

	public Video getVideo() {
		return video;
	}

}
