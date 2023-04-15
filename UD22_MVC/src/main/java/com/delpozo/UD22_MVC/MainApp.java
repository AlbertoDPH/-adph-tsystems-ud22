package com.delpozo.UD22_MVC;

import com.delpozo.UD22_MVC.controlador.ControlVistaPrincipal;
import com.delpozo.UD22_MVC.modelo.ClienteDAO;
import com.delpozo.UD22_MVC.vista.VistaPrincipal;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();

            // Crear la ventana principal
            VistaPrincipal vistaPrincipal = new VistaPrincipal();

            // Crear el controlador de la ventana principal
            ControlVistaPrincipal controlVistaPrincipal = new ControlVistaPrincipal(vistaPrincipal, clienteDAO);

            // Hacer que la ventana principal sea visible
//            SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
                    vistaPrincipal.setVisible(true);
//                }
//            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


