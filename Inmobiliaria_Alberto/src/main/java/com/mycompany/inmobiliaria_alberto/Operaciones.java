/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmobiliaria_alberto;

/**
 *
 * @author 6002754
 */
public class Operaciones extends Sucursal{
    
    private String tipo;
    private String descripcion;
    private String empleado;
    private String propietario;
    private String inquilino;
    private String fecha;
    private double precio;
    private double descuento;

    public Operaciones(String tipo, String descripcion, String empleado, String propietario, String inquilino, String fecha, double precio, double descuento, String nombre, String razonSocial, String nif, double comision) {
        super(nombre, razonSocial, nif, comision);
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.empleado = empleado;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.fecha = fecha;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal(){
        return precio + getComision() - descuento;
    }
    
    public String filaToList() {
        return getNombre() +" "+ getRazonSocial() +" "+ getNif() +" "+ tipo +" "+ propietario +" "+ 
                inquilino +" "+ fecha +" "+ precio +" "+ getComision() +" "+ descuento +" "+ getPrecioFinal();           
    }

    @Override
    public String toString() {
        return "Operaciones{" + "tipo=" + tipo + ", descripcion=" + descripcion + 
                ", empleado=" + empleado + ", propietario=" + propietario + ", inquilino=" + 
                inquilino + ", fecha=" + fecha + ", precio=" + precio + ", descuento=" + descuento + '}';
    }
    
    
    
    
}
