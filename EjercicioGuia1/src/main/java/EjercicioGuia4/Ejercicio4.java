/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia4;

/**
 *
 * @author DANIEL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4 extends JFrame {

    private JComboBox<String> cboColores;
    private JLabel etiResultado;

    public Ejercicio4() {
        initComponents();
    }

    private void initComponents() {
        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        etiResultado.setPreferredSize(new Dimension(250, 30));

        String[] colores = {"Rojo", "Verde", "Azul"};
        cboColores = new JComboBox<>(colores);

        cboColores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                cboColoresActionPerformed(evt);
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(cboColores);
        panel.add(etiResultado);

        this.setTitle("Ejercicio 4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void cboColoresActionPerformed(ActionEvent evt) {
        String mensaje = "El color elegido es ";
        mensaje = mensaje + cboColores.getSelectedItem().toString();
        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio4().setVisible(true);
        });
    }
}