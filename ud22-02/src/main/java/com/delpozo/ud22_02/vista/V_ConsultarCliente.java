package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Clase que construye la vista V_ConsultarCliente
 *
 */
public class V_ConsultarCliente extends JFrame {

	private JPanel contentPane;
	public JLabel txtNombre;
	private JLabel txtApellido;
	private JLabel txtDireccion;
	private JLabel txtDNI;
	private JLabel txtFecha;
	private JButton btnConsulta;
	private JTextField txtId;
	private JLabel lblId;
	private JButton btnCancelar;

	/**
	 * Constructor
	 */
	public V_ConsultarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 300);
		setTitle("Consultar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		txtNombre = new JLabel();
		txtNombre.setBounds(164, 39, 187, 20);
		contentPane.add(txtNombre);

		txtApellido = new JLabel();
		txtApellido.setBounds(164, 70, 187, 20);
		contentPane.add(txtApellido);

		txtDireccion = new JLabel();
		txtDireccion.setBounds(164, 101, 193, 20);
		contentPane.add(txtDireccion);

		txtDNI = new JLabel();
		txtDNI.setBounds(164, 132, 126, 20);
		contentPane.add(txtDNI);

		txtFecha = new JLabel();
		txtFecha.setBounds(164, 163, 126, 20);
		contentPane.add(txtFecha);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 45, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(69, 76, 51, 14);
		contentPane.add(lblApellido);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(69, 107, 62, 14);
		contentPane.add(lblDireccion);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(69, 138, 51, 14);
		contentPane.add(lblDni);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(69, 169, 51, 14);
		contentPane.add(lblFecha);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(69, 227, 89, 23);
		contentPane.add(btnConsulta);

		txtId = new JTextField();
		txtId.setBounds(164, 11, 106, 20);
		contentPane.add(txtId);

		lblId = new JLabel("ID");
		lblId.setBounds(69, 14, 51, 14);
		contentPane.add(lblId);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(234, 227, 89, 23);
		contentPane.add(btnCancelar);

	}

	// Getters y Setters
	public JTextField getTxtId() {
		return txtId;
	}

	public JLabel getTxtNombre() {
		return txtNombre;
	}

	public JLabel getTxtApellido() {
		return txtApellido;
	}

	public JLabel getTxtDireccion() {
		return txtDireccion;
	}

	public JLabel getTxtDNI() {
		return txtDNI;
	}

	public JLabel getTxtFecha() {
		return txtFecha;
	}

	public JButton getBtnConsulta() {
		return btnConsulta;
	}

	public void setBtnConsulta(JButton btnConsulta) {
		this.btnConsulta = btnConsulta;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

}
