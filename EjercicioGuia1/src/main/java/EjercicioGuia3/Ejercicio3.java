/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author DANIEL
 */
public class Ejercicio3 extends JFrame {

    private JButton btnAceptar;
    private JLabel etiResultado;
    private JList<String> lstColores;

    public Ejercicio3() {
        initComponents();
    }

    private void initComponents() {
        btnAceptar = new JButton("Aceptar");
        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        etiResultado.setPreferredSize(new Dimension(250, 30));

        String[] colores = {"Rojo", "Verde", "Azul"};
        lstColores = new JList<>(colores);
        lstColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstColores.setVisibleRowCount(3);
        JScrollPane scrollPane = new JScrollPane(lstColores);

        btnAceptar.addActionListener((ActionEvent evt) -> {
            btnAceptarActionPerformed(evt);
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(scrollPane);
        panel.add(btnAceptar);
        panel.add(etiResultado);

        this.setTitle("Ejercicio 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); // Centrar ventana
    }

    private void btnAceptarActionPerformed(ActionEvent evt) {
        String mensaje;

        if (lstColores.getSelectedValue() != null) {
            mensaje = "El color seleccionado es: " + lstColores.getSelectedValue().toString();
        } else {
            mensaje = "No se ha seleccionado ningún color.";
        }

        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio3().setVisible(true);
        });
    }
}