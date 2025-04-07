/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioguia1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author DANIEL
 */
public class EjercicioGuia1 extends JFrame {

    private JButton btnAceptar;
    private JCheckBox chkPerro;
    private JCheckBox chkGato;
    private JCheckBox chkRaton;
    private JLabel etiResultado;

    public EjercicioGuia1() {
        initComponents();
    }

    private void initComponents() {
        //Instanciacion de los componentes
        btnAceptar = new JButton("Aceptar");
        chkPerro = new JCheckBox("Perro");
        chkGato = new JCheckBox("Gato");
        chkRaton = new JCheckBox("Raton");
        etiResultado = new JLabel();
        //Agregamos un borde a la etiqueta
        etiResultado.setBorder(BorderFactory.createEtchedBorder());

        //Asociamos el evento al boton
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        //Configuracion del layout (usamos un FlowLayout para este ejemplo)
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(chkPerro);
        panel.add(chkGato);
        panel.add(chkRaton);
        panel.add(btnAceptar);
        panel.add(etiResultado);

        //Configuracion del JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String mensaje = "Animales elegidos: ";
        if (chkPerro.isSelected()) {
            mensaje = mensaje + "Perro ";
        }
        if (chkGato.isSelected()) {
            mensaje = mensaje + "Gato ";
        }
        if (chkRaton.isSelected()) {
            mensaje = mensaje + "Raton ";
        }
        etiResultado.setText(mensaje);
    }
    
    public static void main(String[] args) {
        //Inicia la aplicacion
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioGuia1().setVisible(true);
            }
        });
    }
}