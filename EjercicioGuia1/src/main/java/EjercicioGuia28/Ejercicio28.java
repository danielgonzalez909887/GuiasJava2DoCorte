/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia28;

/**
 *
 * @author DANIEL
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        Rectangulo suelo = new Rectangulo();
        suelo.setBase(30);
        suelo.setAltura(50);
        double area = suelo.getArea();
        double peri = suelo.getPerimetro();
        System.out.println(area);
        System.out.println(peri);
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        base = 0;
        altura = 0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }
}