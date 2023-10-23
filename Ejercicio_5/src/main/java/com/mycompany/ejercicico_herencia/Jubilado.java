/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicico_herencia;

/**
 *
 * @author 6002754
 */
public class Jubilado extends Persona{
    private double sueldo;
    private String ocupacion;
    private int edad;
    
    public Jubilado(double sueldo, String ocupacion, int edad, int id, String nombre, String dni, String domicilio, String telefono){
        super(id, nombre, dni, domicilio, telefono);
        this.sueldo = sueldo;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return super.toString() + this.sueldo + ", " + this.ocupacion + ", " + this.edad+".";
    }
}
