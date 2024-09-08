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

SELECT ID_Usuario, ID_Cargo, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Rut,  Email, Fecha_Registro FROM Usuarios WHERE Email='MeowTime@gmail.com';

-- Insertar cuenta de administrador y usuario para pruebas -- contraseña hasheada: MeowTime
INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, PrimerApellido , Rut, Email, Contraseña) 
VALUES ('1','Bryan', 'Vera', '21.568.036-3', 'meowTime@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Rut, Email, Contraseña) 
VALUES ('2','Martin', 'Andres', 'Lopez', 'Herrera', '11.222.333-4', 'martin@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, PrimerApellido , Rut, Email, Contraseña) 
VALUES ('3','Bryan', 'Vera', '22.333.444-5', 'bryan@gmail.com', '$2a$10$aVdbAnbnoWjbnnSA2VHE9.Z1s7gz/aAnXAScZ7GeqBmsfgkWGQGIO');

-- Crear Tabla Asistencias --
CREATE TABLE Asistencias(
    ID_Asistencia INT AUTO_INCREMENT PRIMARY KEY,
    ID_Usuario INT NOT NULL,
    Fecha DATE NOT NULL,
    Entrada TIME NOT NULL,
    Salida TIME,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario)
);


SELECT * FROM CARGOS;
SELECT * FROM Usuarios;
SELECT * FROM Asistencias;