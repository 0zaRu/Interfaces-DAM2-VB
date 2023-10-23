/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicico_herencia;

/**
 *
 * @author 6002754
 */
public class Empleado extends Persona{
    private int codigo;
    private String cargo;
    private double sueldo;
    
    public Empleado(int codigo, String cargo, double sueldo, int id, String nombre, String dni, String domicilio, String telefono){
        super(id, nombre, dni, domicilio, telefono);
        this.codigo = codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return super.toString() + this.codigo + ", " + this.cargo + ", " + this.sueldo;
    }
}
