package clases;

public class Personal {
    private String nombre;
    private String dni;
    private String direccion;
    private int partidosGanados;
    
    public Personal(String nombre, String dni, String direccion, int partidosGanados) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.partidosGanados = partidosGanados;
    }
    
    public Personal(String nombre, String dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.partidosGanados = -1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }    

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }
    
    @Override
    public String toString() {
        
        String devolver = "Personal: " + "Nombre: " + nombre + ", DNI: " + dni + ", Dirección: " + direccion;
        
        if(partidosGanados != -1)
            return devolver + ", Partidos Ganados: " + partidosGanados + " ";
        
        else
            return devolver;
    }
    
    
}
