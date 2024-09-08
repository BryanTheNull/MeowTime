/**
 * Author:  Bryan Vera
 * Created: 27-08-2024
 */

-- Crear base de datos --
CREATE DATABASE IF NOT EXISTS MeowTime;
USE MeowTime;

-- Crear Tabla de Cargos --
CREATE TABLE Cargos(
    ID_Cargo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL
);

-- Insertar 5 cargos para pruebas --	
INSERT INTO Cargos (Nombre) VALUES
('Administrador'),
('Gerente de Ventas'),
('Analista de Datos'), 
('Especialista en Marketing Digital'), 
('Gerente de Recursos Humanos');

-- Crear Tabla de Usuarios --
CREATE TABLE Usuarios(
    ID_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    ID_Cargo INT NOT NULL,
	PrimerNombre VARCHAR(50) NOT NULL,
	SegundoNombre VARCHAR(50),
	PrimerApellido VARCHAR(50) NOT NULL,
	SegundoApellido VARCHAR(50),
    Rut VARCHAR(12) UNIQUE NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Contraseña VARCHAR(60) NOT NULL,
    Fecha_Registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ID_Cargo) REFERENCES Cargos (ID_Cargo)
);

-- Insertar cuenta de administrador y usuarios para pruebas -- contraseña hasheada: MeowTime
INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, PrimerApellido , Rut, Email, Contraseña) 
VALUES ('1','Bryan', 'Vera', '21.568.036-3', 'meowTime@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Rut, Email, Contraseña) 
VALUES ('2','Martin', 'Andres', 'Lopez', 'Herrera', '11.222.333-4', 'martin@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, PrimerApellido , Rut, Email, Contraseña) 
VALUES ('3','Benjamin', 'Millaleo', '22.333.444-5', 'benja@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

-- Crear Tabla Asistencias --
CREATE TABLE Asistencias(
    ID_Asistencia INT AUTO_INCREMENT PRIMARY KEY,
    ID_Usuario INT NOT NULL,
    Fecha DATE NOT NULL,
    Entrada TIME NOT NULL,
    Salida TIME,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario)
);

-- Insertar entrada y salida para pruebas --
INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES('2','2024-09-01', '08:30:00');
UPDATE Asistencias SET Salida = '18:10:00' Where ID_Usuario = 2 AND Fecha = '2024-09-01';

INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES('2','2024-09-02', '08:00:00');
UPDATE Asistencias SET Salida = '17:00:00' Where ID_Usuario = 2 AND Fecha = '2024-09-02';

INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES('2','2024-09-03', '09:30:00');
UPDATE Asistencias SET Salida = '18:10:00' Where ID_Usuario = 2 AND Fecha = '2024-09-03';

INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES('2','2024-09-04', '07:50:00');
UPDATE Asistencias SET Salida = '17:55:00' Where ID_Usuario = 2 AND Fecha = '2024-09-04';

INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES('2','2024-09-05', '10:30:00');
UPDATE Asistencias SET Salida = '20:10:00' Where ID_Usuario = 2 AND Fecha = '2024-09-05';


SELECT * FROM CARGOS;
	DO SLEEP(5);
SELECT * FROM Usuarios;
	DO SLEEP(5);
SELECT * FROM Asistencias;
	DO SLEEP(5);


-- REPORTE DIARIO DE ASISTENCIA-- 
SELECT A.ID_Asistencia,
	   CONCAT(U.PrimerNombre, ' ' ,SegundoNombre) AS NombreCompleto,
       U.Rut,
       (SELECT Nombre FROM Cargos WHERE ID_Cargo = U.ID_Cargo) AS NombreCargo,
       A.Entrada,
       A.Salida
FROM Asistencias A 
JOIN Usuarios U ON A.ID_Usuario = U.ID_Usuario
WHERE A.Fecha = CURDATE();