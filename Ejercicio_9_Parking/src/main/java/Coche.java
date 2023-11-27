
import java.io.Serializable;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arube
 */
public class Coche implements Serializable{
    private String matricula;
    private String nombreConductor;
    private int nEntradas;
    private Date horaEntrada;

    public Coche(){
        
    }
    
    public Coche(String matricula, String nombreConductor, int nEntradas, Date horaEntrada) {
        this.matricula = matricula;
        this.nombreConductor = nombreConductor;
        this.nEntradas = nEntradas;
        this.horaEntrada = horaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnEntradas() {
        return nEntradas;
    }

    public void setnEntradas(int nEntradas) {
        this.nEntradas = nEntradas;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        String devolver = "Matricula: " + matricula + ", Dueño: " + nombreConductor + ", NºEntradas: " + nEntradas;
        if(horaEntrada != null)  devolver += ", horaEntrada=" + horaEntrada;
        
        return devolver;
    }
    
}
