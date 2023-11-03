/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_7;

/**
 *
 * @author arube
 */
class Empleado extends Proyecto{
    private String nombre;
    private double precioHoraTrabajo;

    public Empleado(String nombre, double precioHoraTrabajo, String codigo, String descripcion, double numeroHoras) {
        super(codigo, descripcion, numeroHoras);
        this.nombre = nombre;
        this.precioHoraTrabajo = precioHoraTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioHoraTrabajo() {
        return precioHoraTrabajo;
    }

    public double getSueldoFinal() {
        return precioHoraTrabajo * this.getNumeroHoras();
    }
}
