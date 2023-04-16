package com.delpozo.ud22_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.delpozo.ud22_01.modelo.Cliente;
import com.delpozo.ud22_01.modelo.ClienteDAO;
import com.delpozo.ud22_01.vista.VistaEliminar;

/**
 * Controlamos todos lo eventos que se realizan en la VistaEliminar
 * 
 * @author Alberto
 *
 */
public class ControlVistaEliminar {

	private VistaEliminar vistaEliminar;
	private ClienteDAO clienteDAO;
	private Cliente cliente;

	/**
	 * Constructor encargado de poner a la escucha el boton Eliminar
	 * 
	 * @param vistaEliminar
	 * @param clienteDAO
	 * @param cliente
	 */
	public ControlVistaEliminar(VistaEliminar vistaEliminar, ClienteDAO clienteDAO, Cliente cliente) {
		this.vistaEliminar = vistaEliminar;
		this.clienteDAO = clienteDAO;
		this.cliente = cliente;

		// Asignar listener al botón Eliminar
		vistaEliminar.getBtnEliminar().addActionListener(btnEliminar);
	}

	ActionListener btnEliminar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			// Ejecutamos la funcion eliminar desde ClienteDAO y le pasamos el id parseado
			// recogido en el campo JTextField ID
			clienteDAO.eliminar(Integer.parseInt(vistaEliminar.getTxtId().getText()));
			vistaEliminar.dispose();

			JOptionPane.showMessageDialog(null, "Registro borrado de la bbdd");
		}
	};

	// Getters
	public VistaEliminar getVistaEliminar() {
		return vistaEliminar;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
