package com.delpozo.ud22_01;

import com.delpozo.ud22_01.controlador.ControlVistaPrincipal;
import com.delpozo.ud22_01.modelo.ClienteDAO;
import com.delpozo.ud22_01.vista.VistaPrincipal;

import javax.swing.*;

public class MainApp {
	public static void main(String[] args) {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();

			// Crear la ventana principal
			VistaPrincipal vistaPrincipal = new VistaPrincipal();

			// Crear el controlador de la ventana principal
			ControlVistaPrincipal controlVistaPrincipal = new ControlVistaPrincipal(vistaPrincipal, clienteDAO);

			vistaPrincipal.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
