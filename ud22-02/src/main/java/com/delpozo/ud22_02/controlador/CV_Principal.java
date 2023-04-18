package com.delpozo.ud22_02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.delpozo.ud22_02.modelo.*;
import com.delpozo.ud22_02.vista.*;

public class CV_Principal {

	private ClienteDAO clienteDAO;
	private VideoDAO videoDAO;
	private V_GuardarCliente vGuardarCli;
	private V_EliminarCliente vEliminar;
	private V_ConsultarCliente vConsultar;
	private V_ActualizarCliente vActualizar;
	private V_GuardarVideos vGuardarVideo;
	private V_ConsultarVideo vConsultarVi;
	private V_ActualizarVideo vActualizarVi;
	private V_EliminarVideo vEliminarVi;
	private Cliente cliente;
	private Video video;

	/**
	 * Constructor encargado de poner a la escucha los botones Guardar, Consultar,
	 * Actualizar y Eliminar
	 * 
	 * @param vistaP
	 * @param clienteDAO
	 */
	public CV_Principal(V_Principal vistaP, ClienteDAO clienteDAO, VideoDAO videoDAO) {
		this.clienteDAO = clienteDAO;
		this.videoDAO = videoDAO;

		// Listeners de los botones cliente
		vistaP.getBtnGuardarClie().addActionListener(btnGuardarCli);
		vistaP.getBtnConsultaCli().addActionListener(btnConsultarCli);
		vistaP.getBtnActualizarCli().addActionListener(btnActualizarCli);
		vistaP.getBtnEliminarCli().addActionListener(btnEliminarCli);

		// Listeners de los botones videos
		vistaP.getBtnGuardarVideo().addActionListener(btnGuardarVideo);
		vistaP.getBtnConsultaVideo().addActionListener(btnConsultarVideo);
		vistaP.getBtnActualizarVideo().addActionListener(btnActualizarVi);
		vistaP.getBtnEliminarVideo().addActionListener(btnEliminarVideo);
	}

	//############ Metodos Botones Cliente ###############################  
	
	// Hace que se abra la vista guardar cliente
	ActionListener btnGuardarCli = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vGuardarCli al pulsar el boton Guardar
			vGuardarCli = new V_GuardarCliente();
			// se crea el obejto cVistaCliente con los parametros vGuardarCli y clientedDAO
			// al pulsar el boton Guardar
			CV_GuardarCliente cVistaCliente = new CV_GuardarCliente(vGuardarCli, clienteDAO);
			// Se hace visible la vista Guardar
			vGuardarCli.setVisible(true);
		}
	};

	// Hace que se abra la vista consulta
	ActionListener btnConsultarCli = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vConsultar al pulsar el boton Consultar
			vConsultar = new V_ConsultarCliente();
			// se crea el obejto cVistaCliente con los parametros vConsultar y clientedDAO
			// al pulsar el boton Consultar
			CV_ConsultarCliente cVistaCliente = new CV_ConsultarCliente(vConsultar, clienteDAO);
			// Se hace visible al vista Consultat
			vConsultar.setVisible(true);

		}
	};

	// Hace que se abra vista actualizar
	ActionListener btnActualizarCli = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vActualizar al pulsar el boton Actualizar
			vActualizar = new V_ActualizarCliente();
			// se crea el obejto cVistaCliente con los parametros vActualizar y clientedDAO
			// al pulsar el boton Actualizar
			CV_ActualizarCliente cVistaCliente = new CV_ActualizarCliente(vActualizar, clienteDAO);
			// Se hace visible la vista Actualizar
			vActualizar.setVisible(true);

		}
	};

	// Hace que se abra la vista eliminar
	ActionListener btnEliminarCli = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto cEliminar al pulsar el boton Eliminar
			vEliminar = new V_EliminarCliente();
			// se crea el objeto cliente
			cliente = new Cliente();
			// se crea el onjeto cVistaElimnar con los parametros vElimianr, clienteDAO y
			// cliente
			CV_EliminarCliente cVistaEliminar = new CV_EliminarCliente(vEliminar, clienteDAO, cliente);
			// Se hace visible la vista Eliminar
			vEliminar.setVisible(true);
		}
	};
	
	//############ Metodos Botones Video ###############################  

	// Hace que se abra la vista guardar videos
	ActionListener btnGuardarVideo = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vGuardarVideo al pulsar el boton Guardar
			vGuardarVideo = new V_GuardarVideos();
			// se crea el objeto cVistaVideos con los parametros vGuardarVideo y videodDAO
			// al pulsar el boton Guardar
			CV_GuardarVideos cVistaVideos = new CV_GuardarVideos(vGuardarVideo, videoDAO);
			// Se hace visible la vista Guardar
			vGuardarVideo.setVisible(true);
		}
	};

	// Hace que se abra la vista consulta
	ActionListener btnConsultarVideo = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vConsultarVi al pulsar el boton Consultar
			vConsultarVi = new V_ConsultarVideo();
			// se crea el obejto vConsultarVi con los parametros vConsultarVi y videodDAO
			// al pulsar el boton Consultar
			CV_ConsultarVideo cVistaVideo = new CV_ConsultarVideo(vConsultarVi, videoDAO);
			// Se hace visible al vista Consultat
			vConsultarVi.setVisible(true);

		}
	};
	
	// Hace que se abra vista actualizar
		ActionListener btnActualizarVi = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// se crea el objeto vActualizar al pulsar el boton Actualizar
				vActualizarVi = new V_ActualizarVideo();
				// se crea el obejto cVistaCliente con los parametros vActualizar y clientedDAO
				// al pulsar el boton Actualizar
				CV_ActualizarVideo cVistaVideo = new CV_ActualizarVideo(vActualizarVi, videoDAO);
				// Se hace visible la vista Actualizar
				vActualizarVi.setVisible(true);

			}
		};

		// Hace que se abra la vista eliminar
		ActionListener btnEliminarVideo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// se crea el objeto cEliminar al pulsar el boton Eliminar
				vEliminarVi = new V_EliminarVideo();
				// se crea el objeto cliente
				video = new Video();
				// se crea el onjeto cVistaElimnar con los parametros vEliminar, VideoDAO y
				// video
				CV_EliminarVideo cVistaEliminar = new CV_EliminarVideo(vEliminarVi, videoDAO, video);
				// Se hace visible la vista Eliminar
				vEliminarVi.setVisible(true);
			}
		};

}
