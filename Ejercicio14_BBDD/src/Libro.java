/**
 *
 * @author arube
 */
public class Libro {
    private int id;
    private String titulo;
    private int autorId;
    private int añoPublicacion;

    public Libro(int id, String titulo, int autorId, int añoPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autorId = autorId;
        this.añoPublicacion = añoPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}