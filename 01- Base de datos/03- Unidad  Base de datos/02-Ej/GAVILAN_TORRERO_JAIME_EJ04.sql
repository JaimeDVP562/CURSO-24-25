CREATE DATABASE pruebas2;

USE pruebas2;

--Alumno: Jaime Gavilán Torrero
--C.F.G.S. Desarrollo de aplicaciones Web
--Módulo Profesional: Base de datos 
--Curso Académico: 2024/2025

--Ejercicio 01: Crear un usuario "bibliotecario1" con un login y una contraseña.
CREATE LOGIN bibliotecario
WITH PASSWORD ='1234';

CREATE USER bibliotecario1
FOR LOGIN bibliotecario;


--Ejercicio 02: Crear un usuario "lector1" sin login.
CREATE USER lector1
WITHOUT LOGIN;

--Ejercicio 03: Modificar el nombre del usuario "bibliotecario1" a "gestorBiblioteca".

ALTER USER bibliotecario1
WITH NAME = gestorBiblioteca;


--Ejercicio 04: Asignar permisos de SELECT y UPDATE sobre la tabla libro al usuario "gestorBiblioteca".

CREATE TABLE libro(
codLibro NVARCHAR(25),
CONSTRAINT pk_libro_codLibro PRIMARY KEY (codLibro)
);

GRANT SELECT, UPDATE 
ON libro
TO gestorBiblioteca;

--Ejercicio 05: Denegar permisos de DELETE sobre la tabla libro al usuario "gestorBiblioteca".

REVOKE DELETE 
ON libro
TO gestorBiblioteca;

--Ejercicio 06: Asignar permisos de SELECT sobre la tabla prestamo al usuario "lector1".

CREATE TABLE prestamo(
codPrestamo NVARCHAR(25),
CONSTRAINT pk_prestamo_codPrestamo PRIMARY KEY (codPrestamo)
);

GRANT SELECT
ON prestamo
TO lector1;

--Ejercicio 07: Crear un nuevo usuario "bibliotecario2" con login y contraseña, pero denegarle permisos de UPDATE sobre la tabla libro.
CREATE USER bibliotecario2
WITHOUT LOGIN;


CREATE LOGIN bibliotecarioDos
WITH PASSWORD ='1234';

CREATE USER bibliotecario2
FOR LOGIN bibliotecarioDos;

REVOKE UPDATE
ON libro
TO bibliotecario2;


--Ejercicio 08: Asignar al usuario "gestorBiblioteca" permisos para insertar, modificar y borrar datos de la tabla prestamo y hacer que pueda conceder esos permisos a otros usuarios.
GRANT INSERT, UPDATE, DELETE 
ON prestamo
TO gestorBiblioteca
WITH GRANT OPTION;


--Ejercicio 09: Asignar todos los permisos sobre la tabla usuario al usuario "gestorBiblioteca".
CREATE TABLE usuario(
	dni INT,

	CONSTRAINT pk_usuario_dni PRIMARY KEY (dni)
);

GRANT ALL
ON usuario 
TO gestorBiblioteca;


--Ejercicio 10: Eliminar el permiso de SELECT sobre la tabla prestamo del usuario "lector1".

REVOKE SELECT 
ON prestamo
TO lector1;


--Ejercicio 11: Renombrar al usuario "bibliotecario2" a "asistenteBiblioteca" y cambiar su login.


ALTER USER bibliotecario2
WITH NAME = asistenteBiblioteca;

ALTER USER bibliotecario2
WITH LOGIN= paco;


--Ejercicio 12: Crear un nuevo usuario "revisorLibros" que pueda realizar operaciones de consulta y actualización solo sobre la tabla libro.

CREATE LOGIN revisorLibros
WITH PASSWORD ='1234';

CREATE USER revisorLibros
FOR LOGIN revisorLibros;

GRANT SELECT, UPDATE
ON libro
TO revisorLibros;


--Ejercicio 13: Eliminar al usuario "lector1" y el login asociado.
CREATE LOGIN lector1
WITH PASSWORD ='1234';

DROP USER lector1;

DROP LOGIN lector1;

--Ejercicio 14: Eliminar todos los permisos del usuario "asistenteBiblioteca" sobre la tabla libro.

REVOKE ALL
ON libro
TO asistenteBiblioteca;