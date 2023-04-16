package com.delpozo.ud22_01.vista;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Clase que construye la Vista principal
 * @author Alberto
 *
 */
public class VistaPrincipal extends JFrame {

	// Variables globales de clase
	private JPanel contentPane;
	private JButton btnGuardar;
	private JButton btnActualizar;
	private JButton btnConsulta;
	private JButton btnEliminar;

	/**
	 * Contructor
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 300);
		setTitle("Principal");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Menú Principal");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(132, 40, 129, 23);
		contentPane.add(lblMenu);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(79, 99, 104, 23);
		contentPane.add(btnGuardar);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(79, 150, 104, 23);
		contentPane.add(btnActualizar);

		btnConsulta = new JButton("Consultar");
		btnConsulta.setBounds(210, 99, 89, 23);
		contentPane.add(btnConsulta);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(210, 150, 89, 23);
		contentPane.add(btnEliminar);

	}

	// Getters
	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public JButton getBtnConsultar() {
		return btnConsulta;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}
}
