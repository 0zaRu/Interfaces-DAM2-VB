/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicico_herencia;

/**
 *
 * @author 6002754
 */
public class Persona {
    private int id;
    private String nombre;
    private String dni;
    private String domicilio;
    private String telefono;
    
    public Persona(int id, String nombre, String dni, String domicilio, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        String devolver = "";
        devolver += this.id + ", " + this.nombre + ", " + this.dni + ", " + this.domicilio + ", " + this.telefono + " || ";
        
        return devolver;
    }
}
