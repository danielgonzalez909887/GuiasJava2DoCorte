/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio16 extends JFrame {
    int coches;
    private JButton btnEntro;
    private JButton btnSalio;
    private JButton btnReiniciar;
    private JLabel etiCoches;
    private JLabel lblTitulo;

    public Ejercicio16() {
        initComponents();
        coches = 0;
        etiCoches.setText("0");
    }

    private void initComponents() {
        btnEntro = new JButton("Entró un coche");
        btnSalio = new JButton("Salió un coche");
        btnReiniciar = new JButton("Reiniciar");
        etiCoches = new JLabel();
        etiCoches.setBorder(BorderFactory.createEtchedBorder());
        lblTitulo = new JLabel("Coches en el Parking");

        btnEntro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coches = coches + 1;
                etiCoches.setText("" + coches);
            }
        });
        btnSalio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (coches > 0) {
                    coches = coches - 1;
                    etiCoches.setText("" + coches);
                }
            }
        });
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coches = 0;
                etiCoches.setText("0");
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(lblTitulo);
        panel.add(etiCoches);
        panel.add(btnEntro);
        panel.add(btnSalio);
        panel.add(btnReiniciar);

        add(panel);
        setTitle("Ejercicio16");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio16().setVisible(true);
            }
        });
    }
}