/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author DANIEL
 */
public class Ejercicio6 extends JFrame {

    private JComboBox<String> cboNumeros;
    private JButton btnPares, btnImpares;
    private JLabel etiResultado;

    public Ejercicio6() {
        initComponents();
    }

    private void initComponents() {
        cboNumeros = new JComboBox<>();
        btnPares = new JButton("Pares");
        btnImpares = new JButton("Impares");
        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        etiResultado.setPreferredSize(new Dimension(250, 30));

        btnPares.addActionListener((ActionEvent evt) -> {
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
            for (int i = 0; i < 10; i += 2) {
                modelo.addElement(String.valueOf(i));
            }
            cboNumeros.setModel(modelo);
        });

        btnImpares.addActionListener((ActionEvent evt) -> {
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
            for (int i = 1; i < 10; i += 2) {
                modelo.addElement(String.valueOf(i));
            }
            cboNumeros.setModel(modelo);
        });

        cboNumeros.addActionListener((ActionEvent evt) -> {
            if(cboNumeros.getSelectedItem() != null) {
                etiResultado.setText("N° " + cboNumeros.getSelectedItem().toString());
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(cboNumeros);
        panel.add(btnPares);
        panel.add(btnImpares);
        panel.add(etiResultado);

        this.setTitle("Ejercicio 6");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Ejercicio6().setVisible(true));
    }
}