/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author 6002754
 */
public class Alumno extends Centro{
    
    private String nombre;
    private String curso;
    
    public Alumno(String nombre, String curso, String denominacion, String ciudad){
        super(denominacion, ciudad);
        this.nombre = nombre;
        this.curso = curso;
    }
}
