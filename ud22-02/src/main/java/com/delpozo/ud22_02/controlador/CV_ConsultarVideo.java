package com.delpozo.ud22_02.controlador;

import java.awt.event.*;
import com.delpozo.ud22_02.modelo.*;
import com.delpozo.ud22_02.vista.*;

/**
 * Controlamos todos lo eventos que se realizan en la V_ConsultarVideo
 * @author Alberto
 *
 */
public class CV_ConsultarVideo {

	private V_ConsultarVideo vistaConsultaVi;
	private VideoDAO videoDAO;
	private Video video;
	private String nombreDB = "ud22_ejer2";
	private String tablaDB = "videos";

	/**
	 * Constructor encargado de poner a la escucha los botones Consulta y Cancelar
	 * @param vistaConsultaVi
	 * @param clienteDAO
	 */
	public CV_ConsultarVideo(V_ConsultarVideo vistaConsultaVi, VideoDAO videoDAO) {
		this.vistaConsultaVi = vistaConsultaVi;
		this.videoDAO = videoDAO;
		this.video = new Video();

		// Controlamos los eventos de los botones
		vistaConsultaVi.getBtnConsulta().addActionListener(btnConsulta);
		vistaConsultaVi.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Consulta los datos del video en la bbdd
	ActionListener btnConsulta = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Recoger el que le introducimos al ID
			int id = Integer.parseInt(vistaConsultaVi.getTxtId().getText());

			// Recoge el valor que devuelve la funcion consultar
			video = videoDAO.consultar(nombreDB, tablaDB, id);

			// Obtenemos los datos del video
			vistaConsultaVi.getTxtNombre().setText(video.getTitulo());
			vistaConsultaVi.getTxtDirector().setText(video.getDirector());
			

		}
	};

	// Cerramos la ventana volviendo a la ventana pricipal
	ActionListener btnCancelar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			vistaConsultaVi.dispose();

		}

	};

	// Getters
	public V_ConsultarVideo getVistaConsultaVi() {
		return vistaConsultaVi;
	}

	public void setVistaConsultaVi(V_ConsultarVideo vistaConsultaVi) {
		this.vistaConsultaVi = vistaConsultaVi;
	}

	public VideoDAO getVideoDAO() {
		return videoDAO;
	}

	public void setVideoDAO(VideoDAO videoDAO) {
		this.videoDAO = videoDAO;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
