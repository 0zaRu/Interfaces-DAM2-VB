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
    private double plusFijo = -1;

    public Mantenedor(double sueldo, boolean fijo, double plusFijo, String nombre, String dni, String direccion, String telefono) {
        super(nombre, dni, direccion, telefono);
        this.sueldo = sueldo;
        
        if((this.fijo = fijo))
            this.plusFijo = plusFijo;
        
    }

    @Override
    public double getSueldoFinal() {
        
        if(fijo)
            return getSueldo();
        else
            return getSueldo() + getPlusFijo();
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public boolean isFijo() {
        return fijo;
    }
    
    public double getPlusFijo() {
        return plusFijo;
    }

    @Override
    public String toString() {
        //return super.toString() + "\n|| Mantenedor: " + "Sueldo: " + sueldo + ", Fijo: " + fijo + "\n||Sueldo final del mantenedor: "+ getSueldoFinal() + "\n\n";
        return "Mantenedor: "+getNombre()+" | DNI: "+getDni()+" | Sueldo final: "+getSueldoFinal();
    }
}
