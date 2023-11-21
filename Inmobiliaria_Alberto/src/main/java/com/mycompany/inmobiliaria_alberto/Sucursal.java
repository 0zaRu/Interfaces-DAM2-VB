/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmobiliaria_alberto;

/**
 *
 * @author 6002754
 */
public class Sucursal {
    private String nombre;
    private String razonSocial;
    private String nif;
    private double comision;

    public Sucursal(String nombre, String razonSocial, String nif, double comision) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.nif = nif;
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", razonSocial=" + razonSocial + ", nif=" + nif + ", comision=" + comision + '}';
    }
    
    
}
