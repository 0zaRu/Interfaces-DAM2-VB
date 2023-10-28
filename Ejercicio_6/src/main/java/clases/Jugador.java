/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arube
 */
public class Jugador extends Personal{
    private String posicion;
    private double sueldo;
    private String fechaNacimiento;
    private double plusPartidoGanado;
    private int numeroGoles;
    private double plusPorGol;

    public Jugador(String posicion, double sueldo, String fechaNacimiento, double plusPartidoGanado, int numeroGoles, double plusPorGol, String nombre, String dni, String direccion, int partidosGanados) {
        super(nombre, dni, direccion, partidosGanados);
        this.posicion = posicion;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.plusPartidoGanado = plusPartidoGanado;
        this.numeroGoles = numeroGoles;
        this.plusPorGol = plusPorGol;
    }

    public double getSueldoFinal(){
        return sueldo + (getPartidosGanados()*plusPartidoGanado) + (numeroGoles * plusPorGol);
    }
    
    public String getPosicion() {
        return posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPlusPartidoGanado() {
        return plusPartidoGanado;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public double getPlusPorGol() {
        return plusPorGol;
    }

    @Override
    public String toString() {
        return " || Jugador: " + "Posición: " + posicion + ", Sueldo: " + sueldo + ", Fecha de nacimiento: " + fechaNacimiento + ", Plus por Partido Ganado: " + plusPartidoGanado + ", Número de Goles:" + numeroGoles + ", Plus por Gol:" + plusPorGol;
    }
}
