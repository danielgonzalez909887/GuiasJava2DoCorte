/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia14;

import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio14 extends JFrame {
    private JMenuBar barraMenus;
    private JMenu menuArchivo;
    private JMenuItem menuAbrir;
    private JMenuItem menuSalir;
    private JSeparator separador;
    private JFileChooser elegirFichero;

    public Ejercicio14() {
        initComponents();
    }

    private void initComponents() {
        barraMenus = new JMenuBar();
        menuArchivo = new JMenu("Archivo");
        menuAbrir = new JMenuItem("Abrir");
        separador = new JSeparator();
        menuSalir = new JMenuItem("Salir");
        elegirFichero = new JFileChooser();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicio14");
        setSize(400, 300);
        setLocationRelativeTo(null);

        menuAbrir.addActionListener(this::menuAbrirActionPerformed);
        menuSalir.addActionListener(e -> System.exit(0));

        menuArchivo.add(menuAbrir);
        menuArchivo.add(separador);
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);
        setJMenuBar(barraMenus);
    }

    private void menuAbrirActionPerformed(ActionEvent evt) {
        int resp;
        resp = elegirFichero.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, elegirFichero.getSelectedFile().toString());
        } else if (resp == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio14().setVisible(true));
    }
}