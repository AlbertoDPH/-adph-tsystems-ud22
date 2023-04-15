package com.delpozo.UD22_MVC.controlador;

import java.awt.event.*;
import java.sql.Date;
import java.time.LocalDate;
import com.delpozo.UD22_MVC.modelo.*;
import com.delpozo.UD22_MVC.vista.*;

/**
 * Controlamos todos lo eventos que se realizan en la VistaActualizar
 * @author Alberto
 *
 */
public class ContolVistaActualizar {

	private VistaActualizar vistaActua;
	private ClienteDAO clienteDAO;
	private Cliente cliente;

	/**
	 * Constructor encargado de poner a la escucha los botones Actualizar y Cancelar
	 * @param vistaActua
	 * @param clienteDAO
	 */
	public ContolVistaActualizar(VistaActualizar vistaActua, ClienteDAO clienteDAO) {
		this.vistaActua = vistaActua;
		this.clienteDAO = clienteDAO;
		this.cliente = new Cliente();

		// Controlamos los eventos de los botones
		vistaActua.getBtnGuardar().addActionListener(btnActualizar);
		vistaActua.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Actuliza los datos del cliente en la bbdd
	ActionListener btnActualizar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Obtenemos los datos del cliente
			cliente.setId(Integer.parseInt(vistaActua.getTxtId().getText()));
			cliente.setNombre(vistaActua.getTxtNombre().getText());
			cliente.setApellido(vistaActua.getTxtApellido().getText());
			cliente.setDireccion(vistaActua.getTxtDireccion().getText());
			cliente.setDni(Integer.parseInt(vistaActua.getTxtDNI().getText()));

			// Obtenemos la fecha del campo fecha
			String fechaTexto = vistaActua.getTxtFecha().getText();
			// Convierte la fechaTexto a un objeto LocalDate
			LocalDate fecha = LocalDate.parse(fechaTexto);
			// Covertir LocalDate a Date
			Date fechaDate = java.sql.Date.valueOf(fecha);
			// Asignamos al fecha la objeto cliente
			cliente.setFecha(fechaDate);

			// Guardamos los datos del cliente
			clienteDAO.actualizar(cliente);

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
	public VistaActualizar getVistaCliente() {
		return vistaActua;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
