/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author DANIEL
 */
public class Ejercicio10 extends JFrame {

    private JScrollBar desValor;
    private JLabel etiValor;

    public Ejercicio10() {
        initComponents();
        desValor.setValue(70);
    }

    private void initComponents() {
        desValor = new JScrollBar(JScrollBar.HORIZONTAL);
        etiValor = new JLabel("El valor es: " + desValor.getValue());
        desValor.setMinimum(50);
        desValor.setMaximum(150);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.setVisibleAmount(5);
        desValor.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent evt) {
                etiValor.setText("El valor es: " + desValor.getValue());
            }
        });
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(desValor);
        panel.add(etiValor);
        this.setTitle("Ejercicio10");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio10().setVisible(true));
    }
}