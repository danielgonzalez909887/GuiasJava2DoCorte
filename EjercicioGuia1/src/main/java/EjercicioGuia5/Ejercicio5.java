/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author DANIEL
 */
public class Ejercicio5 extends JFrame {

    private JButton btnCurso1, btnCurso2;
    private JLabel etiResultado;
    private JList<String> lstNombres;

    public Ejercicio5() {
        initComponents();
    }

    private void initComponents() {
        btnCurso1 = new JButton("Curso 1");
        btnCurso2 = new JButton("Curso 2");
        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        etiResultado.setPreferredSize(new Dimension(250, 30));
        lstNombres = new JList<>();

        JScrollPane scrollPane = new JScrollPane(lstNombres);
        scrollPane.setPreferredSize(new Dimension(150, 100));

        btnCurso1.addActionListener((ActionEvent evt) -> btnCurso1ActionPerformed(evt));
        btnCurso2.addActionListener((ActionEvent evt) -> btnCurso2ActionPerformed(evt));

        lstNombres.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && lstNombres.getSelectedValue() != null) {
                    String mensaje = "Nombre seleccionado: " + lstNombres.getSelectedValue().toString();
                    etiResultado.setText(mensaje);
                }
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(btnCurso1);
        panel.add(btnCurso2);
        panel.add(scrollPane);
        panel.add(etiResultado);

        this.setTitle("Ejercicio 5");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void btnCurso1ActionPerformed(ActionEvent evt) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.addElement("Juan");
        modelo.addElement("María");
        modelo.addElement("Luis");
        lstNombres.setModel(modelo);
    }

    private void btnCurso2ActionPerformed(ActionEvent evt) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.addElement("Ana");
        modelo.addElement("Marta");
        modelo.addElement("Jose");
        lstNombres.setModel(modelo);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio5().setVisible(true);
        });
    }
}