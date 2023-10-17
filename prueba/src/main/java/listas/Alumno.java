/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author 6002754
 */
public class Alumno {
    String nombre;
    String apellidos;
    String curso;
    
    public Alumno(String nombre, String apellidos, String numCurso){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = "curso "+numCurso;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellidos + " " + this.curso;
    }
}
