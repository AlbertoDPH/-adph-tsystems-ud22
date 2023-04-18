package com.delpozo.ud22_02;

import com.delpozo.ud22_02.controlador.CV_Principal;
import com.delpozo.ud22_02.modelo.ClienteDAO;
import com.delpozo.ud22_02.modelo.VideoDAO;
import com.delpozo.ud22_02.vista.V_Principal;

import javax.swing.*;

public class MainApp {
	public static void main(String[] args) {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			VideoDAO videoDAO = new VideoDAO();

			// Crear la ventana principal
			V_Principal vistaPrincipal = new V_Principal();

			// Crear el controlador de la ventana principal
			CV_Principal controlVistaPrincipal = new CV_Principal(vistaPrincipal, clienteDAO, videoDAO);

			vistaPrincipal.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
