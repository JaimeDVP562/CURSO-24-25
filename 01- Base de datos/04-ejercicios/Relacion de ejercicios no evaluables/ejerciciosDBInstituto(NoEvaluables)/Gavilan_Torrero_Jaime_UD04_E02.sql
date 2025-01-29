--Jaime Gavilan Torrero
--CURSO: 2024/2025 
-- 1 DAW tarde

USE instituto;

--Ej01
SELECT * FROM alumno
WHERE id = 1;


--Ej02
SELECT * FROM alumno
WHERE teléfono = 692735409;

--Ej03
SELECT * FROM alumno
WHERE es_repetidor='sí';

--Ej04
SELECT * FROM alumno
WHERE es_repetidor='no';

--Ej05
SELECT * FROM alumno
WHERE fecha_nacimiento < '1993-01-01';

--Ej06
SELECT * FROM alumno
WHERE fecha_nacimiento > '1994-01-01';

--Ej07
SELECT * FROM alumno
WHERE fecha_nacimiento > '1994-01-01' AND es_repetidor = 'no';

--Ej08
SELECT * FROM alumno
WHERE fecha_nacimiento BETWEEN '1998-01-01' AND '1998-12-31';

--Ej09
SELECT * FROM alumno
WHERE fecha_nacimiento < '1998-01-01' 
	OR fecha_nacimiento >'1998-12-31';

--Ej010
SELECT * FROM alumno
WHERE fecha_nacimiento 
BETWEEN '1998-01-01' AND '1998-05-31';

--Ej11

SELECT nombre, REVERSE(nombre)  AS nombre_Invertido FROM alumno;

--Ej12

SELECT CONCAT (nombre, ' ', apellido1,' ', apellido2) AS Nombre_Completo, 
REVERSE(CONCAT (nombre, ' ', apellido1,' ', apellido2)) 
AS NombreCompletoInvertido FROM alumno;

--Ej13

SELECT UPPER(CONCAT (nombre, ' ', apellido1,' ', apellido2)) AS Nombre_Completo_Con_Mayusculas, 
REVERSE (CONCAT (nombre, ' ', apellido1,' ', apellido2))
AS NombreCompletoInvertido_Con_Mayusculas FROM alumno;

--Ej14
SELECT CONCAT(nombre, ' ', apellido1,' ', apellido2) AS Nombre_Completo, 
LEN (CONCAT (nombre, ' ', apellido1,' ', apellido2)) 
AS Numero_Caracteres FROM alumno;

--Ej15
SELECT CONCAT(nombre, ' ', apellido1,' ', apellido2) AS Nombre_Completo, 
LOWER(CONCAT (nombre, '.', apellido1,'@ies.org'))
AS Correo_Electronico FROM alumno;

--Ej16

SELECT CONCAT(nombre, ' ', apellido1,' ', apellido2) AS Nombre_Completo, 
LOWER(CONCAT (nombre, '.', apellido1,'@ies.org')) AS Correo_Electronico,
REVERSE (CONCAT (+LEFT (fecha_nacimiento,4),apellido1)) AS Contraseña
FROM alumno;


--Ej17

SELECT fecha_nacimiento AS Fecha_Completa, 
 DAY (fecha_nacimiento) AS Dia,
 MONTH (fecha_nacimiento) AS Dia,
 YEAR (fecha_nacimiento) AS Dia
FROM alumno;

--Ej18

SELECT fecha_nacimiento AS Fecha_Completa, 
 DATENAME(WEEKDAY, (fecha_nacimiento))AS Dia,
 DATENAME (MONTH, (fecha_nacimiento)) AS Dia
FROM alumno;

--Ej19

SELECT fecha_nacimiento AS Fecha_Completa, 
DATEDIFF(DAY, fecha_nacimiento, GETDATE())
FROM alumno;

