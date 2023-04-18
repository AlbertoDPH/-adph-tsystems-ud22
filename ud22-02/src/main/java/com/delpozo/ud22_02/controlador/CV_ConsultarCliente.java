package com.delpozo.ud22_02.controlador;

import java.awt.event.*;
import com.delpozo.ud22_02.modelo.*;
import com.delpozo.ud22_02.vista.*;

/**
 * Controlamos todos lo eventos que se realizan en la V_ConsultarCliente
 * @author Alberto
 *
 */
public class CV_ConsultarCliente {

	private V_ConsultarCliente vistaConsulta;
	private ClienteDAO clienteDAO;
	private Cliente cliente;
	private String nombreDB = "ud22_ejer2";
	private String tablaDB = "cliente";

	/**
	 * Constructor encargado de poner a la escucha los botones Consulta y Cancelar
	 * @param vistaConsulta
	 * @param clienteDAO
	 */
	public CV_ConsultarCliente(V_ConsultarCliente vistaConsulta, ClienteDAO clienteDAO) {
		this.vistaConsulta = vistaConsulta;
		this.clienteDAO = clienteDAO;
		this.cliente = new Cliente();

		// Controlamos los eventos de los botones
		vistaConsulta.getBtnConsulta().addActionListener(btnConsulta);
		vistaConsulta.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Consulta los datos del cliente en la bbdd
	ActionListener btnConsulta = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Recoger el que le introducimos al ID
			int id = Integer.parseInt(vistaConsulta.getTxtId().getText());

			// Recoge el valor que devuelve la funcion consultar
			cliente = clienteDAO.consultar(nombreDB, tablaDB, id);

			// Obtenemos los datos del cliente
			vistaConsulta.getTxtNombre().setText(cliente.getNombre());
			vistaConsulta.getTxtApellido().setText(cliente.getApellido());
			vistaConsulta.getTxtDireccion().setText(cliente.getDireccion());
			vistaConsulta.getTxtDNI().setText("" + cliente.getDni());
			vistaConsulta.getTxtFecha().setText("" + cliente.getFecha());

		}
	};

	// Cerramos la ventana volviendo a la ventana pricipal
	ActionListener btnCancelar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			vistaConsulta.dispose();

		}

	};

	// Getters
	public V_ConsultarCliente getVistaCliente() {
		return vistaConsulta;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
