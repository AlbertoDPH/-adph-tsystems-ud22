package com.delpozo.ud22_02.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * Clase que construye la Vista principal
 * 
 * @author Alberto
 *
 */
public class V_Principal extends JFrame {

	// Variables globales de clase
	private JPanel contentPane;
	private JButton btnGuardarClie, btnGuardarVideo;
	private JButton btnActualizarCli, btnActualizarVideo;
	private JButton btnConsultaCli, btnConsultaVideo;
	private JButton btnEliminarCli, btnEliminarVideo;
	private JButton btnPresVideo;
	private JLabel lblCliente;

	/**
	 * Contructor
	 */
	public V_Principal() {
		setBackground(SystemColor.textHighlight);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);
		// Tamaño del JFrame
		setSize(400, 430);
		setResizable(false);
		setTitle("Principal");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Menú Principal");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(133, 28, 129, 23);
		contentPane.add(lblMenu);

		btnGuardarClie = new JButton("Guardar");
		btnGuardarClie.setBounds(57, 121, 104, 23);
		contentPane.add(btnGuardarClie);

		btnActualizarCli = new JButton("Actualizar");
		btnActualizarCli.setBounds(57, 221, 104, 23);
		contentPane.add(btnActualizarCli);

		btnConsultaCli = new JButton("Consultar");
		btnConsultaCli.setBounds(57, 172, 104, 23);
		contentPane.add(btnConsultaCli);

		btnEliminarCli = new JButton("Eliminar");
		btnEliminarCli.setBounds(57, 277, 104, 23);
		contentPane.add(btnEliminarCli);

		lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setBounds(57, 80, 104, 14);
		contentPane.add(lblCliente);

		JLabel lblVideos = new JLabel("Videos");
		lblVideos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVideos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVideos.setBounds(213, 80, 104, 14);
		contentPane.add(lblVideos);

		btnGuardarVideo = new JButton("Guardar");
		btnGuardarVideo.setBounds(213, 121, 104, 23);
		contentPane.add(btnGuardarVideo);

		btnConsultaVideo = new JButton("Consultar");
		btnConsultaVideo.setBounds(213, 172, 104, 23);
		contentPane.add(btnConsultaVideo);

		btnActualizarVideo = new JButton("Actualizar");
		btnActualizarVideo.setBounds(213, 221, 104, 23);
		contentPane.add(btnActualizarVideo);

		btnEliminarVideo = new JButton("Eliminar");
		btnEliminarVideo.setBounds(213, 277, 104, 23);
		contentPane.add(btnEliminarVideo);

		btnPresVideo = new JButton("Prestar Video");
		btnPresVideo.setBounds(133, 334, 114, 23);
		contentPane.add(btnPresVideo);

	}

	public JButton getBtnGuardarClie() {
		return btnGuardarClie;
	}

	public JButton getBtnGuardarVideo() {
		return btnGuardarVideo;
	}

	public JButton getBtnActualizarCli() {
		return btnActualizarCli;
	}

	public JButton getBtnActualizarVideo() {
		return btnActualizarVideo;
	}

	public JButton getBtnConsultaCli() {
		return btnConsultaCli;
	}

	public JButton getBtnConsultaVideo() {
		return btnConsultaVideo;
	}

	public JButton getBtnEliminarCli() {
		return btnEliminarCli;
	}

	public JButton getBtnEliminarVideo() {
		return btnEliminarVideo;
	}

	public JButton getBtnPresVideo() {
		return btnPresVideo;
	}

	public JLabel getLblCliente() {
		return lblCliente;
	}

	

}
