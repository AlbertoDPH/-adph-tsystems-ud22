package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Clase que construye la Vista eliminar
 * 
 * @author Alberto
 *
 */
public class V_EliminarVideo extends JFrame {

	private JPanel contentPane;
	private JButton btnEliminar;
	private JTextField txtId;
	private JLabel lblId;

	/**
	 * Constructor
	 */
	public V_EliminarVideo() {
		setTitle("Eliminar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(146, 78, 89, 23);
		contentPane.add(btnEliminar);

		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(178, 27, 106, 20);
		contentPane.add(txtId);

		lblId = new JLabel("ID");
		lblId.setBounds(111, 30, 51, 14);
		contentPane.add(lblId);

	}

	// Getters
	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JTextField getTxtId() {
		return txtId;
	}

}
