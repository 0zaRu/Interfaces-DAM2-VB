/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arube
 */
public class Entrenador extends Personal{
    private double sueldo;
    private double plusPartidoGanado;

    public Entrenador(double sueldo, double plusPartidoGanado, String nombre, String dni, String direccion, int partidosGanados) {
        super(nombre, dni, direccion, partidosGanados);
        this.sueldo = sueldo;
        this.plusPartidoGanado = plusPartidoGanado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getPlusPartidoGanado() {
        return plusPartidoGanado;
    }

    @Override
    public String toString() {
        return super.toString() + " || Entrenador: " + "Sueldo: " + sueldo + ", Plus por Partido Ganado: " + plusPartidoGanado;
    }
}