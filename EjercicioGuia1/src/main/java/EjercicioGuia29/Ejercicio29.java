/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioGuia29;

/**
 *
 * @author DANIEL
 */
public class Ejercicio29 {
    private int aforo;
    private int ocupadas;
    private String pelicula;
    private double entrada;

    public Ejercicio29() {
        aforo = 100;
        ocupadas = 0;
        pelicula = "";
        entrada = 5.0;
    }

    public void setAforo(int a) { aforo = a; }
    public void setOcupadas(int o) { ocupadas = o; }
    public void setLibres(int lib) { ocupadas = aforo - lib; }
    public void setPelicula(String p) { pelicula = p; }
    public void setEntrada(double e) { entrada = e; }

    public int getAforo() { return aforo; }
    public int getOcupadas() { return ocupadas; }
    public int getLibres() { return aforo - ocupadas; }
    public double getPorcentaje() { return (double)ocupadas / aforo * 100.0; }
    public double getIngresos() { return ocupadas * entrada; }
    public String getPelicula() { return pelicula; }
    public double getEntrada() { return entrada; }

    public void Vaciar() {
        ocupadas = 0;
        pelicula = "";
    }

    public void entraUno() {
        ocupadas++;
    }
}