package com.delpozo.ud22_02.vista;

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
public class V_GuardarVideos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtDirector;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Constructor
	 */
	public V_GuardarVideos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 250);
		setResizable(false);
		setTitle("Videos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(137, 49, 187, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(137, 80, 187, 20);
		contentPane.add(txtDirector);

		JLabel lblNombre = new JLabel("Titulo");
		lblNombre.setBounds(70, 55, 51, 14);
		contentPane.add(lblNombre);

		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(70, 86, 51, 14);
		contentPane.add(lblDirector);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(70, 139, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(248, 139, 89, 23);
		contentPane.add(btnCancelar);

	}

	// Getters

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

}
