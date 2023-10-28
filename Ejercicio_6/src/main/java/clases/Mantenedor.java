/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arube
 */
public class Mantenedor extends Personal{
    private double sueldo;
    private boolean fijo;

    public Mantenedor(double sueldo, boolean fijo, String nombre, String dni, String direccion) {
        super(nombre, dni, direccion);
        this.sueldo = sueldo;
        this.fijo = fijo;
        
        //TE FALTA TRABAJARTE EL FIJO, QUELOS STADOS DEPENDIENTES DE BOOLEAN NO GENEREN PROBLEMAS Y LOS PLUSPARTIDOGANADO
    }

    public double getPlusPartidoGanado() {
        return 12;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public boolean isFijo() {
        return fijo;
    }

    @Override
    public String toString() {
        return super.toString() + " || Mantenedor: " + "Sueldo: " + sueldo + ", Fijo: " + fijo;
    }
}
