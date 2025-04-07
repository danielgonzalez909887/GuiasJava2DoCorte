/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio8 extends JFrame {

    private JSlider slDeslizador;
    private JLabel etiValor;

    public Ejercicio8() {
        initComponents();
    }

    private void initComponents() {
        slDeslizador = new JSlider();
        etiValor = new JLabel("El valor es: 0");

        slDeslizador.setMinimum(0);
        slDeslizador.setMaximum(100);
        slDeslizador.setValue(0);
        slDeslizador.setMajorTickSpacing(20);
        slDeslizador.setMinorTickSpacing(10);
        slDeslizador.setPaintTicks(true);
        slDeslizador.setPaintLabels(true);
        slDeslizador.setSnapToTicks(true);

        slDeslizador.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                etiValor.setText("El valor es: " + slDeslizador.getValue());
            }
        });

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(slDeslizador, BorderLayout.CENTER);
        panel.add(etiValor, BorderLayout.SOUTH);

        this.setTitle("Ejercicio8");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio8().setVisible(true));
    }
}