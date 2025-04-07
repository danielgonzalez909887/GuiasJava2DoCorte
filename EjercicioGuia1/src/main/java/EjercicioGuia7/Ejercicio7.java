/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author DANIEL
 */
public class Ejercicio7 extends JFrame {

    private JLabel lblPrecioBase;
    private JTextField txtPrecioBase;
    private JButton btnCalcular;
    private JLabel etiTotal;
    private JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    private JLabel etiPrecioInstalacion, etiPrecioFormacion, etiPrecioAlimentacionBD;

    public Ejercicio7() {
        initComponents();
    }

    private void initComponents() {
        lblPrecioBase = new JLabel("Precio Base");
        txtPrecioBase = new JTextField(10);
        btnCalcular = new JButton("Calcular");
        etiTotal = new JLabel();
        etiTotal.setBorder(BorderFactory.createEtchedBorder());
        etiTotal.setFont(new Font("Arial", Font.BOLD, 16));
        tbtnInstalacion = new JToggleButton("Instalación");
        tbtnFormacion = new JToggleButton("Formación");
        tbtnAlimentacionBD = new JToggleButton("Alimentación BD");
        etiPrecioInstalacion = new JLabel("40");
        etiPrecioFormacion = new JLabel("200");
        etiPrecioAlimentacionBD = new JLabel("200");
        
        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
        panel.add(lblPrecioBase);
        panel.add(txtPrecioBase);
        panel.add(btnCalcular);
        panel.add(new JLabel(""));
        panel.add(tbtnInstalacion);
        panel.add(etiPrecioInstalacion);
        panel.add(tbtnFormacion);
        panel.add(etiPrecioFormacion);
        panel.add(tbtnAlimentacionBD);
        panel.add(etiPrecioAlimentacionBD);
        panel.add(new JLabel("Total:"));
        panel.add(etiTotal);
        
        btnCalcular.addActionListener((ActionEvent evt) -> {
            double precio_base = Double.parseDouble(txtPrecioBase.getText());
            double precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
            double precio_for = Double.parseDouble(etiPrecioFormacion.getText());
            double precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
            double precio_total = precio_base;
            if(tbtnInstalacion.isSelected()){
                precio_total += precio_instal;
            }
            if(tbtnFormacion.isSelected()){
                precio_total += precio_for;
            }
            if(tbtnAlimentacionBD.isSelected()){
                precio_total += precio_ali;
            }
            etiTotal.setText(precio_total + " €");
        });
        
        this.setTitle("Ejercicio 7");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Ejercicio7().setVisible(true));
    }
}