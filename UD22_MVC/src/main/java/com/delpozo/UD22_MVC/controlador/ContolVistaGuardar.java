package com.delpozo.UD22_MVC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

import com.delpozo.UD22_MVC.modelo.Cliente;
import com.delpozo.UD22_MVC.modelo.ClienteDAO;
import com.delpozo.UD22_MVC.vista.VistaGuardar;

/**
 * Controlamos todos lo eventos que se realizan en la VistaGuardar
 * 
 * @author Alberto
 *
 */
public class ContolVistaGuardar {

	private VistaGuardar vistaGuardar;
	private ClienteDAO clienteDAO;
	private Cliente cliente;

	/**
	 * Constructor encargado de poner a la escucha los botones Consulta y Cancelar
	 * 
	 * @param vistaGuardar
	 * @param clienteDAO
	 */
	public ContolVistaGuardar(VistaGuardar vistaGuardar, ClienteDAO clienteDAO) {
		this.vistaGuardar = vistaGuardar;
		this.clienteDAO = clienteDAO;
		this.cliente = new Cliente();

		// Listener del boton Guardar
		vistaGuardar.getBtnGuardar().addActionListener(btnGuardar);
		vistaGuardar.getBtnCancelar().addActionListener(btnCancelar);

	}

	// Guarda los datos del cliente en la bbdd
	ActionListener btnGuardar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Obtenemos los datos del cliente
			cliente.setNombre(vistaGuardar.getTxtNombre().getText());
			cliente.setApellido(vistaGuardar.getTxtApellido().getText());
			cliente.setDireccion(vistaGuardar.getTxtDireccion().getText());
			cliente.setDni(Integer.parseInt(vistaGuardar.getTxtDNI().getText()));

			try {
				// Obtenemos la fecha del campo fecha
				String fechaTexto = vistaGuardar.getTxtFecha().getText();
				// Convierte la fechaTexto a un objeto LocalDate
				LocalDate fecha = LocalDate.parse(fechaTexto);
				// Covertir LocalDate a Date
				Date fechaDate = java.sql.Date.valueOf(fecha);
				// Asignamos al fecha la objeto cliente
				cliente.setFecha(fechaDate);

			} 
			//Controlamos si la fecha introducida no es correcta
			catch (DateTimeParseException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Formato fecha incorrecta\n" + "debe ser: aaaa-mm-dd");
			}

			// Guardamos los datos del cliente
			clienteDAO.guardar(cliente);

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
	public VistaGuardar getVistaCliente() {
		return vistaGuardar;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
