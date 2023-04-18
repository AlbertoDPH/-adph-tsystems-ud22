package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class V_ActualizarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtDNI;
	private JTextField txtFecha;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JTextField textID;

	/**
	 * Constructor
	 */
	public V_ActualizarCliente() {
		setTitle("Actualizar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setBounds(122, 74, 187, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(122, 105, 187, 20);
		contentPane.add(txtApellido);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(122, 136, 216, 20);
		contentPane.add(txtDireccion);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(122, 167, 126, 20);
		contentPane.add(txtDNI);

		txtFecha = new JTextField();
		txtFecha.setToolTipText("");
		txtFecha.setColumns(10);
		txtFecha.setBounds(122, 198, 126, 20);
		contentPane.add(txtFecha);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(55, 80, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(55, 111, 51, 14);
		contentPane.add(lblApellido);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(55, 142, 57, 14);
		contentPane.add(lblDireccion);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(55, 173, 51, 14);
		contentPane.add(lblDni);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(55, 204, 51, 14);
		contentPane.add(lblFecha);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(79, 252, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(257, 252, 89, 23);
		contentPane.add(btnCancelar);
		
		textID = new JTextField();
		textID.setColumns(10);
		textID.setBounds(122, 43, 187, 20);
		contentPane.add(textID);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(55, 46, 51, 14);
		contentPane.add(lblId);

	}

	// Getters y Setters
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}
	
}
