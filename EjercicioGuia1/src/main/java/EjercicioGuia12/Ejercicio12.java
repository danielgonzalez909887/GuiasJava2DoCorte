/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia12;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author DANIEL
 */
public class Ejercicio12 extends JFrame {

    private JToolBar barraHerramientas;
    private JButton btnUno;
    private JButton btnDos;
    private JButton btnTres;
    private JButton btnCuatro;

    public Ejercicio12() {
        initComponents();
    }

    private void initComponents() {
        JMenuBar barraMenus = new JMenuBar();
        setJMenuBar(barraMenus);

        barraHerramientas = new JToolBar();
        btnUno = new JButton("Uno");
        btnDos = new JButton("Dos");
        btnTres = new JButton("Tres");
        btnCuatro = new JButton("Cuatro");

        barraHerramientas.add(btnUno);
        barraHerramientas.add(btnDos);
        barraHerramientas.add(btnTres);
        barraHerramientas.add(btnCuatro);

        add(barraHerramientas, java.awt.BorderLayout.NORTH);

        btnUno.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Activaste el botón uno");
        });

        setTitle("Ejercicio 12");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio12().setVisible(true));
    }
}