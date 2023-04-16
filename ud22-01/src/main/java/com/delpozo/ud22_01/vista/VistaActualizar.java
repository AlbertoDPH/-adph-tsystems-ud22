package com.delpozo.ud22_01.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VistaActualizar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtDNI;
	private JTextField txtFecha;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JTextField txtId;
	private JLabel lblId;

	public VistaActualizar() {
		setTitle("Actualizar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setBounds(136, 42, 187, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(136, 73, 187, 20);
		contentPane.add(txtApellido);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(136, 104, 206, 20);
		contentPane.add(txtDireccion);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(136, 135, 126, 20);
		contentPane.add(txtDNI);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(136, 166, 126, 20);
		contentPane.add(txtFecha);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 45, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(69, 76, 51, 14);
		contentPane.add(lblApellido);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(69, 107, 51, 14);
		contentPane.add(lblDireccion);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(69, 138, 51, 14);
		contentPane.add(lblDni);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(69, 169, 51, 14);
		contentPane.add(lblFecha);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(95, 215, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(273, 215, 89, 23);
		contentPane.add(btnCancelar);

		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(136, 11, 106, 20);
		contentPane.add(txtId);

		lblId = new JLabel("ID");
		lblId.setBounds(69, 14, 51, 14);
		contentPane.add(lblId);

	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
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

}
