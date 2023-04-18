package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Clase que construye la Vista consultar
 *
 */
public class V_ConsultarVideo extends JFrame {

	private JPanel contentPane;
	public JLabel txtNombre;
	private JLabel txtDirector;
	private JButton btnConsulta;
	private JTextField txtId;
	private JLabel lblId;
	private JButton btnCancelar;

	/**
	 * Constructor
	 */
	public V_ConsultarVideo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 205);
		setTitle("Consultar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		txtNombre = new JLabel();
		txtNombre.setBounds(164, 39, 187, 20);
		contentPane.add(txtNombre);

		txtDirector = new JLabel();
		txtDirector.setBounds(164, 70, 187, 20);
		contentPane.add(txtDirector);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 45, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(69, 76, 51, 14);
		contentPane.add(lblDirector);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(69, 118, 89, 23);
		contentPane.add(btnConsulta);

		txtId = new JTextField();
		txtId.setBounds(164, 11, 106, 20);
		contentPane.add(txtId);

		lblId = new JLabel("ID");
		lblId.setBounds(69, 14, 51, 14);
		contentPane.add(lblId);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(234, 118, 89, 23);
		contentPane.add(btnCancelar);

	}

	// Getters


	public JButton getBtnConsulta() {
		return btnConsulta;
	}

	public JLabel getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JLabel txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JLabel getTxtDirector() {
		return txtDirector;
	}

	public void setTxtDirector(JLabel txtDirector) {
		this.txtDirector = txtDirector;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

}
