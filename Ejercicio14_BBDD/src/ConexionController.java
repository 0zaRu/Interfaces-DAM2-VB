import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arube
 */

public class ConexionController {
    private Connection conexion;

    public ConexionController(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void cargarLibrosEnTabla(JTable jTable) {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0); 

        String consulta = "SELECT id, titulo, año_publicacion FROM libros";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int añoPublicacion = rs.getInt("año_publicacion");
                
                modelo.addRow(new Object[]{id, titulo, añoPublicacion});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cargarAutoresEnTabla(JTable jTable) {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        String consulta = "SELECT id, nombre, nacionalidad, fecha_nacimiento FROM autores";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");
                String fechaNacimiento = rs.getDate("fecha_nacimiento").toString();

                // Agregar una fila al modelo del JTable
                modelo.addRow(new Object[]{id, nombre, nacionalidad, fechaNacimiento});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public String[] obtenerDatosLibroYAutor(int idLibro) {
        String[] datosLibroYAutor = new String[7];

        String consulta = "SELECT l.id AS id_libro, l.titulo AS titulo_libro, l.año_publicacion, " +
                          "a.id AS id_autor, a.nombre AS nombre_autor, a.nacionalidad, a.fecha_nacimiento " +
                          "FROM libros l " +
                          "JOIN autores a ON l.autor_id = a.id " +
                          "WHERE l.id = ?";
        
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setInt(1, idLibro);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                
                datosLibroYAutor[0] = String.valueOf(rs.getInt("id_libro"));
                datosLibroYAutor[1] = rs.getString("titulo_libro");
                datosLibroYAutor[2] = String.valueOf(rs.getInt("año_publicacion"));

                datosLibroYAutor[3] = String.valueOf(rs.getInt("id_autor"));
                datosLibroYAutor[4] = rs.getString("nombre_autor");
                datosLibroYAutor[5] = rs.getString("nacionalidad");
                datosLibroYAutor[6] = rs.getDate("fecha_nacimiento").toString();
            }
            
            
            if(datosLibroYAutor[0] == null){
                consulta = "SELECT l.id AS id_libro, l.titulo AS titulo_libro, l.año_publicacion " +
                          "FROM libros l " +
                          "WHERE l.id = ?";
        
                PreparedStatement pstmt2 = conexion.prepareStatement(consulta);
                pstmt2.setInt(1, idLibro);
                rs = pstmt2.executeQuery();

                if (rs.next()) {

                    datosLibroYAutor[0] = String.valueOf(rs.getInt("id_libro"));
                    datosLibroYAutor[1] = rs.getString("titulo_libro");
                    datosLibroYAutor[2] = String.valueOf(rs.getInt("año_publicacion"));

                }
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return datosLibroYAutor;
    }
    
    public void borrarLibroPorId(int idLibro) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas borrar este libro?", "Confirmación de Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            String consulta = "DELETE FROM libros WHERE id = ?";
            try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
                pstmt.setInt(1, idLibro);
                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "El libro ha sido borrado exitosamente.", "Borrado Exitoso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún libro con el ID especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void borrarAutorPorId(int idAutor) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas borrar este autor? Esto también desasignará al autor de todos los libros que lo tienen como autor.", "Confirmación de Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                String consultaDesasignar = "UPDATE libros SET autor_id = NULL WHERE autor_id = ?";
                PreparedStatement pstmtDesasignar = conexion.prepareStatement(consultaDesasignar);
                pstmtDesasignar.setInt(1, idAutor);
                pstmtDesasignar.executeUpdate();

                String consultaBorrar = "DELETE FROM autores WHERE id = ?";
                PreparedStatement pstmtBorrar = conexion.prepareStatement(consultaBorrar);
                pstmtBorrar.setInt(1, idAutor);
                int filasAfectadas = pstmtBorrar.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "El autor ha sido borrado exitosamente.", "Borrado Exitoso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún autor con el ID especificado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void crearLibro() {
        try {
            String titulo = "", autor = "";
            int añoPublicacion = 0;
            
            try{
                titulo = JOptionPane.showInputDialog(null, "Introduce el título del libro:");
                añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de publicación:"));
                autor = JOptionPane.showInputDialog(null, "Introduce el ID del autor del libro:");
            }catch(Exception e){
                
            }
            // Crear sentencia SQL para insertar el libro
            String sql = "";
            
            if(autor.isBlank() || autor == null)
                sql = "INSERT INTO libros (titulo, año_publicacion) VALUES (?, ?)";
            else
                sql = "INSERT INTO libros (titulo, año_publicacion, autor_id) VALUES (?, ?, ?)";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, titulo);
            statement.setInt(2, añoPublicacion);
            
            if(!autor.isBlank()) 
                statement.setString(3, autor);

            // Ejecutar la inserción
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Libro añadido exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al añadir el libro.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo al recibir los datos. Si no sabes que autores meter, tienes la tabla carga en la ventana anterior", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void crearAutor() {
        try {
            String nombre = "", nacionalidad = "";
            LocalDate fechaNacimiento = null;

            try {
                nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del autor:");
                nacionalidad = JOptionPane.showInputDialog(null, "Introduce la nacionalidad del autor:");
                String fechaNacimientoStr = JOptionPane.showInputDialog(null, "Introduce la fecha de nacimiento del autor (formato: yyyy-MM-dd):");
                fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
            } catch (Exception e) {
            }

            String sql = "INSERT INTO autores (nombre, nacionalidad, fecha_nacimiento) VALUES (?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, nombre);
            statement.setString(2, nacionalidad);
            statement.setDate(3, Date.valueOf(fechaNacimiento));

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Autor añadido exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al añadir el autor.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo al recibir los datos. Verifica el formato de la fecha (yyyy-MM-dd).", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarLibro(int idLibro) {
        try {
            String sqlSelect = "SELECT * FROM libros WHERE id = ?";
            PreparedStatement selectStatement = conexion.prepareStatement(sqlSelect);
            selectStatement.setInt(1, idLibro);
            ResultSet libroResult = selectStatement.executeQuery();

            if (libroResult.next()) {
                String tituloActual = libroResult.getString("titulo");
                int añoActual = libroResult.getInt("año_publicacion");

                System.out.println("Información actual del libro (ID " + idLibro + "):");
                System.out.println("Título: " + tituloActual);
                System.out.println("Año de publicación: " + añoActual);

                String nuevoTitulo = JOptionPane.showInputDialog(null, "Introduce el nuevo título del libro:");
                int nuevoAño = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nuevo año de publicación:"));

                String sqlUpdate = "UPDATE libros SET titulo = ?, año_publicacion = ? WHERE id = ?";
                PreparedStatement updateStatement = conexion.prepareStatement(sqlUpdate);
                updateStatement.setString(1, nuevoTitulo);
                updateStatement.setInt(2, nuevoAño);
                updateStatement.setInt(3, idLibro);

                int filasAfectadas = updateStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Libro actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el libro.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con el ID proporcionado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la solicitud.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarAutor(int idAutor) {
        try {
            String sqlSelect = "SELECT * FROM autores WHERE id = ?";
            PreparedStatement selectStatement = conexion.prepareStatement(sqlSelect);
            selectStatement.setInt(1, idAutor);
            ResultSet autorResult = selectStatement.executeQuery();

            if (autorResult.next()) {
                String nombreActual = autorResult.getString("nombre");
                String nacionalidadActual = autorResult.getString("nacionalidad");

                System.out.println("Información actual del autor (ID " + idAutor + "):");
                System.out.println("Nombre: " + nombreActual);
                System.out.println("Nacionalidad: " + nacionalidadActual);

                String nuevoNombre = JOptionPane.showInputDialog(null, "Introduce el nuevo nombre del autor:");
                String nuevaNacionalidad = JOptionPane.showInputDialog(null, "Introduce la nueva nacionalidad del autor:");

                String sqlUpdate = "UPDATE autores SET nombre = ?, nacionalidad = ? WHERE id = ?";
                PreparedStatement updateStatement = conexion.prepareStatement(sqlUpdate);
                updateStatement.setString(1, nuevoNombre);
                updateStatement.setString(2, nuevaNacionalidad);
                updateStatement.setInt(3, idAutor);

                int filasAfectadas = updateStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Autor actualizado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el autor.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un autor con el ID proporcionado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la solicitud.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reestablecerBaseDeDatos() {
        try (Statement stmt = conexion.createStatement()) {
            stmt.executeUpdate("DROP TABLE IF EXISTS libros");
            stmt.executeUpdate("DROP TABLE IF EXISTS autores");

            stmt.executeUpdate("CREATE TABLE autores ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "nombre VARCHAR(100) NOT NULL,"
                    + "nacionalidad VARCHAR(50),"
                    + "fecha_nacimiento DATE"
                    + ")");

            stmt.executeUpdate("INSERT INTO autores (nombre, nacionalidad, fecha_nacimiento) VALUES "
                    + "('J.K. Rowling', 'Británica', '1965-07-31'),"
                    + "('George Orwell', 'Británica', '1903-06-25'),"
                    + "('Stephen King', 'Estadounidense', '1947-09-21'),"
                    + "('Brandon Sanderson', 'Estadounidense', '1975-12-19')");

            stmt.executeUpdate("CREATE TABLE libros ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "titulo VARCHAR(100) NOT NULL,"
                    + "autor_id INT,"
                    + "año_publicacion INT,"
                    + "FOREIGN KEY (autor_id) REFERENCES autores(id)"
                    + ")");

            stmt.executeUpdate("INSERT INTO libros (titulo, autor_id, año_publicacion) VALUES "
                    + "('Harry Potter y la Piedra Filosofal', 1, 1997),"
                    + "('1984', 2, 1949),"
                    + "('El Resplandor', 3, 1977),"
                    + "('El Camino de los Reyes', 4, 2010)");

            JOptionPane.showMessageDialog(null, "Base de datos restablecida correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error restableciendo la base de datos");
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
}