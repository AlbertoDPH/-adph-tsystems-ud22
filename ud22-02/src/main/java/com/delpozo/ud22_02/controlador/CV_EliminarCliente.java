package com.delpozo.ud22_02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.delpozo.ud22_02.modelo.Cliente;
import com.delpozo.ud22_02.modelo.ClienteDAO;
import com.delpozo.ud22_02.vista.V_EliminarCliente;

/**
 * Controlamos todos lo eventos que se realizan en la V_EliminarCliente
 * 
 * @author Alberto
 *
 */
public class CV_EliminarCliente {

	private V_EliminarCliente vistaEliminar;
	private ClienteDAO clienteDAO;
	private Cliente cliente;

	/**
	 * Constructor encargado de poner a la escucha el boton Eliminar
	 * 
	 * @param vistaEliminar
	 * @param clienteDAO
	 * @param cliente
	 */
	public CV_EliminarCliente(V_EliminarCliente vistaEliminar, ClienteDAO clienteDAO, Cliente cliente) {
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
	public V_EliminarCliente getVistaEliminar() {
		return vistaEliminar;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
