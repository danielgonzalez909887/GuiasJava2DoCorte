/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia2;

/**
 *
 * @author DANIEL
 */

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

    // Componentes de la interfaz
    private JButton btnAceptar;
    private JLabel etiResultado;
    private JRadioButton optRojo, optVerde, optAzul;
    private JPanel panelColores;
    private ButtonGroup grupoColores;

    public Ejercicio2() {
        initComponents();
    }

    private void initComponents() {
        btnAceptar = new JButton("Aceptar");
        etiResultado = new JLabel();
        
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        etiResultado.setPreferredSize(new Dimension(200, 30));

        optRojo = new JRadioButton("Rojo");
        optVerde = new JRadioButton("Verde");
        optAzul = new JRadioButton("Azul");

        optRojo.setSelected(true);

        grupoColores = new ButtonGroup();
        grupoColores.add(optRojo);
        grupoColores.add(optVerde);
        grupoColores.add(optAzul);

        panelColores = new JPanel(new FlowLayout());
        panelColores.setBorder(BorderFactory.createTitledBorder("colores"));
        panelColores.add(optRojo);
        panelColores.add(optVerde);
        panelColores.add(optAzul);

        JPanel panelPrincipal = new JPanel(new FlowLayout());
        panelPrincipal.add(panelColores);
        panelPrincipal.add(btnAceptar);
        panelPrincipal.add(etiResultado);

        btnAceptar.addActionListener((ActionEvent evt) -> btnAceptarActionPerformed(evt));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panelPrincipal);
        this.pack();
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    private void btnAceptarActionPerformed(ActionEvent evt) {
        String mensaje = "Color elegido: ";
        if (optRojo.isSelected()) {
            mensaje += "Rojo";
        } else if (optVerde.isSelected()) {
            mensaje += "Verde";
        } else if (optAzul.isSelected()) {
            mensaje += "Azul";
        }
        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio2().setVisible(true);
        });
    }
}