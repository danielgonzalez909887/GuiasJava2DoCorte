/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia27;

import javax.swing.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio27 extends JFrame {

    private JLabel etiTexto;

    public Ejercicio27() {
        initComponents();
        aplicarMetodos();
    }

    private void initComponents() {
        etiTexto = new JLabel("Texto inicial");
        etiTexto.setOpaque(true);
        etiTexto.setBounds(10, 20, 100, 20);
        getContentPane().setLayout(null);
        getContentPane().add(etiTexto);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    private void aplicarMetodos() {
        // Cambiar posición y tamaño
        etiTexto.setBounds(50, 50, 150, 30);

        // Obtener el texto actual
        String textoActual = etiTexto.getText();

        // Modificar el texto
        etiTexto.setText(textoActual + " (modificado)");

        // Forzar repintado
        etiTexto.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio27().setVisible(true));
    }
}