package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Clase que construye la vista V_ActualizarVideo
 *
 */
public class V_ActualizarVideo extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtDirector;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JTextField txtId;
	private JLabel lblId;

	/**
	 * Constructor
	 */
	public V_ActualizarVideo() {
		setTitle("Actualizar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(136, 42, 187, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(136, 73, 187, 20);
		contentPane.add(txtDirector);

		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(69, 45, 51, 14);
		contentPane.add(lblTitulo);

		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(69, 76, 51, 14);
		contentPane.add(lblDirector);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(69, 116, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(247, 116, 89, 23);
		contentPane.add(btnCancelar);

		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(136, 11, 106, 20);
		contentPane.add(txtId);

		lblId = new JLabel("ID");
		lblId.setBounds(69, 14, 51, 14);
		contentPane.add(lblId);

	}

	// Getters y Setters

	public JTextField getTxtTitulo() {
		return txtTitulo;
	}

	public void setTxtTitulo(JTextField txtTitulo) {
		this.txtTitulo = txtTitulo;
	}

	public JTextField getTxtDirector() {
		return txtDirector;
	}

	public void setTxtDirector(JTextField txtDirector) {
		this.txtDirector = txtDirector;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JLabel getLblId() {
		return lblId;
	}

	public void setLblId(JLabel lblId) {
		this.lblId = lblId;
	}

}
