/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *
 * @author DANIEL
 */
public class Ejercicio9 extends JFrame {

    private JSpinner spiValor;
    private JLabel etiValor;

    public Ejercicio9() {
        initComponents();
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(2);
        nm.setValue(4);
        spiValor.setModel(nm);
    }

    private void initComponents() {
        spiValor = new JSpinner();
        etiValor = new JLabel("El valor es: " + spiValor.getValue().toString());
        spiValor.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                etiValor.setText("El valor es: " + spiValor.getValue().toString());
            }
        });
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(spiValor);
        panel.add(etiValor);
        this.setTitle("Ejercicio9");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio9().setVisible(true));
    }
}