/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_7;

/**
 *
 * @author arube
 */
abstract class Proyecto {
    private String codigo;
    private String descripcion;
    private double numeroHoras;

    public Proyecto(String codigo, String descripcion, double numeroHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.numeroHoras = numeroHoras;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public abstract double getSueldoFinal();

}
