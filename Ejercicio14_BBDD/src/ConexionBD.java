import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author arube
 */
public class ConexionBD {
    private static ConexionBD instancia = null;
    private Connection conexion;

    private String url;
    private int puerto;
    private String nombreBD;
    private String usuario;
    private String contraseña;

    private ConexionBD() {
        cargarConfiguracion();
    }

    public static ConexionBD obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    private void cargarConfiguracion() {
        Properties propiedades = new Properties();
        InputStream entrada = null;

        try {
            entrada = new FileInputStream("config.properties");
            propiedades.load(entrada);

            url = propiedades.getProperty("db.url");
            puerto = Integer.parseInt(propiedades.getProperty("db.port"));
            nombreBD = propiedades.getProperty("db.database");
            usuario = propiedades.getProperty("db.username");
            contraseña = propiedades.getProperty("db.password");
        } catch (IOException ex) {
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public Connection obtenerConexion() {
        if (conexion == null) {
            try {
                String urlCompleta = url + ":" + puerto + "/" + nombreBD;
                conexion = DriverManager.getConnection(urlCompleta, usuario, contraseña);
            } catch (SQLException e) {
                
            }
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
            }
        }
    }
}
