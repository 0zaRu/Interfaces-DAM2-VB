Create DATABASE if not EXISTS bibliotecaarp;
use bibliotecaarp;

-- Crear la tabla de autores con campos adicionales
CREATE TABLE autores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    nacionalidad VARCHAR(50),
    fecha_nacimiento DATE
);

-- Insertar algunos datos de prueba en la tabla de autores
INSERT INTO autores (nombre, nacionalidad, fecha_nacimiento) VALUES
('J.K. Rowling', 'Británica', '1965-07-31'),
('George Orwell', 'Británica', '1903-06-25'),
('Stephen King', 'Estadounidense', '1947-09-21'),
('Brandon Sanderson', 'Estadounidense', '1975-12-19');

-- Crear la tabla de libros con campo adicional
CREATE TABLE libros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    autor_id INT,
    año_publicacion INT,
    FOREIGN KEY (autor_id) REFERENCES autores(id)
);

-- Insertar algunos datos de prueba en la tabla de libros
INSERT INTO libros (titulo, autor_id, año_publicacion) VALUES
('Harry Potter y la Piedra Filosofal', 1, 1997),
('1984', 2, 1949),
('El Resplandor', 3, 1977),
('El Camino de los Reyes', 4, 2010);
