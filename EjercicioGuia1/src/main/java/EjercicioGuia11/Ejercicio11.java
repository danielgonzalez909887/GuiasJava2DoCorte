/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author DANIEL
 */
public class Ejercicio11 extends JFrame {

    public Ejercicio11() {
        initComponents();
    }

    private void initComponents() {
        JMenuBar barraMenus = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edición");
        JMenu menuInsertar = new JMenu("Insertar");

        JMenuItem menuItemAbrir = new JMenuItem("Abrir");
        JMenuItem menuItemGuardar = new JMenuItem("Guardar");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(new JSeparator());
        menuArchivo.add(menuItemSalir);

        JMenu menuColores = new JMenu("Colores");
        JMenuItem menuItemRojo = new JMenuItem("Rojo");
        JMenuItem menuItemVerde = new JMenuItem("Verde");
        JMenuItem menuItemAzul = new JMenuItem("Azul");

        menuColores.add(menuItemRojo);
        menuColores.add(menuItemVerde);
        menuColores.add(menuItemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuArchivo);
        barraMenus.add(menuEdicion);
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        menuItemRojo.addActionListener((ActionEvent evt) -> {
            this.getContentPane().setBackground(Color.RED);
        });
        menuItemVerde.addActionListener((ActionEvent evt) -> {
            this.getContentPane().setBackground(Color.GREEN);
        });
        menuItemAzul.addActionListener((ActionEvent evt) -> {
            this.getContentPane().setBackground(Color.BLUE);
        });

        setTitle("Ejercicio 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio11().setVisible(true));
    }
}