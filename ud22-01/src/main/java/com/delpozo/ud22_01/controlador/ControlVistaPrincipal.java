package com.delpozo.ud22_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.delpozo.ud22_01.modelo.*;
import com.delpozo.ud22_01.vista.*;

public class ControlVistaPrincipal {

	private ClienteDAO clienteDAO;
	private VistaGuardar vGuardar;
	private VistaEliminar vEliminar;
	private VistaConsultar vConsultar;
	private VistaActualizar vActualizar;
	private Cliente cliente;

	/**
	 * Constructor encargado de poner a la escucha los botones Guardar, Consultar,
	 * Actualizar y Eliminar
	 * 
	 * @param vistaP
	 * @param clienteDAO
	 */
	public ControlVistaPrincipal(VistaPrincipal vistaP, ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;

		// Listeners de los botones
		vistaP.getBtnGuardar().addActionListener(btnGuardar);
		vistaP.getBtnConsultar().addActionListener(btnConsultar);
		vistaP.getBtnActualizar().addActionListener(btnActualizar);
		vistaP.getBtnEliminar().addActionListener(btnEliminar);
	}

	// Hace que se abra la vista guardar
	ActionListener btnGuardar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vGuardar al pulsar el boton Guardar
			vGuardar = new VistaGuardar();
			// se crea el obejto cVistaCliente con los parametros vGuardar y clientedDAO
			// al pulsar el boton Guardar
			ContolVistaGuardar cVistaCliente = new ContolVistaGuardar(vGuardar, clienteDAO);
			// Se hace visible la vista Guardar
			vGuardar.setVisible(true);
		}
	};

	// Hace que se abra vista actualizar
	ActionListener btnActualizar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vActualizar al pulsar el boton Actualizar
			vActualizar = new VistaActualizar();
			// se crea el obejto cVistaCliente con los parametros vActualizar y clientedDAO
			// al pulsar el boton Actualizar
			ContolVistaActualizar cVistaCliente = new ContolVistaActualizar(vActualizar, clienteDAO);
			// Se hace visible la vista Actualizar
			vActualizar.setVisible(true);

		}
	};

	// Hace que se abra la vista consulta
	ActionListener btnConsultar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto vConsultar al pulsar el boton Consultar
			vConsultar = new VistaConsultar();
			// se crea el obejto cVistaCliente con los parametros vConsultar y clientedDAO
			// al pulsar el boton Consultar
			ContolVistaConsultar cVistaCliente = new ContolVistaConsultar(vConsultar, clienteDAO);
			// Se hace visible al vista Consultat
			vConsultar.setVisible(true);

		}
	};

	// Hace que se abra la vista eliminar
	ActionListener btnEliminar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// se crea el objeto cEliminar al pulsar el boton Eliminar
			vEliminar = new VistaEliminar();
			// se crea el objeto cliente
			cliente = new Cliente();
			// se crea el onjeto cVistaElimnar con los parametros vElimianr, clienteDAO y
			// cliente
			ControlVistaEliminar cVistaEliminar = new ControlVistaEliminar(vEliminar, clienteDAO, cliente);
			// Se hace visible la vista Eliminar
			vEliminar.setVisible(true);
		}
	};

}
