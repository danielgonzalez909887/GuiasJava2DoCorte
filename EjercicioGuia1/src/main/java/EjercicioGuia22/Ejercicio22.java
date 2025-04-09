/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia22;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio22 extends JFrame {

    private JLabel etiNum1;
    private JLabel etiNum2;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSumar;
    private JButton btnRestar;

    public Ejercicio22() {
        initComponents();
        CreacionVentana();
    }

    private void initComponents() {
        etiNum1 = new JLabel();
        etiNum2 = new JLabel();
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        btnSumar = new JButton();
        btnRestar = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiNum1.setText("Número 1:");
        etiNum1.setBounds(10, 10, 100, 20);
        getContentPane().add(etiNum1);

        etiNum2.setText("Número 2:");
        etiNum2.setBounds(10, 60, 100, 20);
        getContentPane().add(etiNum2);

        txtNum1.setText("0");
        txtNum1.setBounds(110, 10, 100, 20);
        getContentPane().add(txtNum1);

        txtNum2.setText("0");
        txtNum2.setBounds(110, 60, 100, 20);
        getContentPane().add(txtNum2);

        btnSumar.setText("Sumar");
        btnSumar.setBounds(10, 120, 100, 20);
        getContentPane().add(btnSumar);

        btnRestar.setText("Restar");
        btnRestar.setBounds(150, 120, 100, 20);
        getContentPane().add(btnRestar);
    }

    public void CreacionVentana() {
        setTitle("Programa Operaciones");
        setSize(500, 300);
        setLocation(100, 100);

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
    }

    public void btnSumarActionPerformed(ActionEvent evt) {
        double a = Double.parseDouble(txtNum1.getText());
        double b = Double.parseDouble(txtNum2.getText());
        double s = a + b;
        JOptionPane.showMessageDialog(null, "La suma es " + s);
    }

    public void btnRestarActionPerformed(ActionEvent evt) {
        double a = Double.parseDouble(txtNum1.getText());
        double b = Double.parseDouble(txtNum2.getText());
        double r = a - b;
        JOptionPane.showMessageDialog(null, "La resta es " + r);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio22().setVisible(true);
        });
    }
}