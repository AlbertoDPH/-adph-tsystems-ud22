package com.delpozo.ud22_01.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Clase que construye la Vista guardar
 * 
 * @author Alberto
 *
 */
public class VistaGuardar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtDNI;
	private JTextField txtFecha;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Constructor
	 */
	public VistaGuardar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 300);
		setTitle("Guardar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setBounds(137, 28, 187, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(137, 59, 187, 20);
		contentPane.add(txtApellido);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(137, 90, 216, 20);
		contentPane.add(txtDireccion);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(137, 121, 126, 20);
		contentPane.add(txtDNI);

		txtFecha = new JTextField();
		txtFecha.setToolTipText("");
		txtFecha.setColumns(10);
		txtFecha.setBounds(137, 152, 126, 20);
		contentPane.add(txtFecha);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(70, 34, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(70, 65, 51, 14);
		contentPane.add(lblApellido);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(70, 96, 57, 14);
		contentPane.add(lblDireccion);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(70, 127, 51, 14);
		contentPane.add(lblDni);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(70, 158, 51, 14);
		contentPane.add(lblFecha);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(94, 206, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(272, 206, 89, 23);
		contentPane.add(btnCancelar);

	}

	// Getters
	public JTextField getTxtNombre() {
		return txtNombre;
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

}
