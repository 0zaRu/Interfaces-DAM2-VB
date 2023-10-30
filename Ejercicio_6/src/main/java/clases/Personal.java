package clases;

public abstract class Personal {
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private int partidosGanados;
    
    public Personal(String nombre, String dni, String direccion, String telefono, int partidosGanados) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.partidosGanados = partidosGanados;
    }
    
    public Personal(String nombre, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.partidosGanados = -1;
    }
    
    public abstract double getSueldoFinal();
    
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
        
        String devolver = "Personal: " + "Nombre: " + nombre + ", DNI: " + dni + ", Dirección: " + direccion + ", Teléfono: " + telefono;
        
        if(partidosGanados != -1)
            return devolver + ", Partidos Ganados: " + partidosGanados + " ";
        
        else
            return devolver;
    }
}
