/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arube
 */
public class Directivo extends Personal{
    
    private String cargo;
    private double sueldo;
    private boolean activo;

    public Directivo(String cargo, double sueldo, boolean activo, String nombre, String dni, String direccion, String telefono) {
        super(nombre, dni, direccion, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
    }    
    
    @Override
    public double getSueldoFinal() {
        return getSueldo();
    }
    
    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isActivo() {
        return activo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n|| Directivo: " + "Cargo: " + cargo + ", Sueldo: " + sueldo + ", Activo: " + activo + "\n||Sueldo final del directivo: "+ getSueldoFinal() + "\n\n";
    }
}
