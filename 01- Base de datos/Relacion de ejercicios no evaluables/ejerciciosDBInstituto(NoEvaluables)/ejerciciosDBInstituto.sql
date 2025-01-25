 USE instituto;

-- Ejercicio 01: Inserta un nuevo alumno llamado "Laura Gómez García", nacida el 15 de marzo de 2000, que
--no es repetidora y cuyo número de teléfono es 654987321. INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,teléfono   ) VALUES 
                    ('Laura', 'Gómez','García','15-03-2000', 'no', '654987321');--SELECT * FROM alumno;--Ejercicio 02: Elimina de la tabla al alumno cuyo número de teléfono sea 692735409.

		DELETE FROM alumno 
		WHERE teléfono ='692735409';

--Ejercicio 03: Cambia el estado de repetidor del alumno llamado "Irene Gutiérrez Sánchez" a "no".
				UPDATE alumno 		SET es_repetidor = 'no' 		WHERE nombre = 'Irene' 			AND apellido1 = 'Gutiérrez'			AND apellido2 = 'Sánchez';
	SELECT * FROM alumno WHERE nombre = 'Irene';

--Ejercicio 04: Añade un alumno llamado "Carlos López Martínez", nacido el 10 de mayo de 1997, que sí es
--repetidor y no tiene teléfono.



--Ejercicio 05: Elimina de la tabla al alumno con el ID 3.

		DELETE FROM alumno 
		WHERE id='3';

SELECT * FROM alumno; 

--Ejercicio 06: Actualiza el número de teléfono del alumno llamado "Cristina Fernández Ramírez" a
--699123456.

				UPDATE alumno 		SET teléfono = '699123456' 		WHERE nombre = 'Cristina' 			AND apellido1 = 'Fernández'			AND apellido2 = 'Ramírez';
	SELECT * FROM alumno WHERE nombre = 'Cristina';

--Ejercicio 07: Inserta un nuevo alumno llamado "Raúl Sánchez Ruiz", nacido el 25 de diciembre de 1995, que
--no es repetidor y cuyo número de teléfono es 622345678.



 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,teléfono   ) VALUES 
                    ('Raúl', 'Sánchez','Ruiz','25-12-1995', 'no', '622345678');

	SELECT * FROM alumno WHERE nombre = 'Raúl';

--Ejercicio 08: Elimina a todos los alumnos que no tienen número de teléfono asignado.

		DELETE FROM alumno
		WHERE teléfono IS NULL;

	SELECT * FROM alumno;

--Ejercicio 09: Cambia el apellido paterno de todos los alumnos con apellido "Sánchez" a "Sancho".

SELECT * FROM alumno WHERE apellido1 = 'Sánchez';

		UPDATE alumno
		SET apellido1 ='Sancho'
		WHERE apellido1 = 'Sánchez';

SELECT * FROM alumno WHERE apellido1 = 'Sánchez';
SELECT * FROM alumno WHERE apellido1 = 'Sancho';

--Ejercicio 10: Inserta un alumno llamado "Ana Torres García", nacida el 30 de noviembre de 1999, que sí es
--repetidora y cuyo número de teléfono es 687654321.


 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,teléfono   ) VALUES 
                    ('Ana', 'Torres','García','30-11-1999', 'sí', '687654321');

	SELECT * FROM alumno WHERE nombre = 'Ana';


--Ejercicio 11: Elimina a los alumnos cuyo estado de repetidor sea "sí".

SELECT * FROM alumno WHERE es_repetidor ='sí';
DELETE FROM alumno WHERE es_repetidor ='sí';


--Ejercicio 12: Cambia el nombre del alumno con el ID 10 a "David".

	SELECT * FROM alumno WHERE id = '10';

			UPDATE alumno
			SET nombre ='David'
			WHERE id = '10';

	SELECT * FROM alumno WHERE nombre = 'David';


--Ejercicio 13: Inserta un alumno llamado "Marta Pérez López", nacida el 20 de agosto de 1993, que no es
--repetidora y cuyo teléfono es 634567890.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,teléfono   ) VALUES 
                    ('Marta', 'Pérez','López','20-08-1993', 'no', '634567890');

	SELECT * FROM alumno WHERE nombre = 'Marta';


--Ejercicio 14: Elimina a los alumnos nacidos antes del 1 de enero de 1990.


	SELECT * FROM alumno WHERE fecha_nacimiento ='01-01-1990';

	DELETE FROM alumno WHERE fecha_nacimiento < '01-01-1990';



--Ejercicio 15: Establece el número de teléfono "600000000" a todos los alumnos que no tengan número de
--teléfono asignado.
	SELECT * FROM alumno; 

			UPDATE alumno
			SET teléfono ='600000000'
			WHERE teléfono IS NULL;

--Ejercicio 16: Inserta un alumno llamado "Javier Rodríguez García", nacido el 5 de enero de 1992, que no es
--repetidor y no tiene teléfono.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor   ) VALUES 
                    ('Javier', 'Rodríguez','García','5-01-1992', 'no');

	SELECT * FROM alumno WHERE nombre = 'Javier';

--Ejercicio 17: Elimina a los alumnos cuyo nombre sea "Antonio".

			DELETE  FROM alumno 
			WHERE nombre = 'Antonio';

	SELECT * FROM alumno WHERE nombre = 'Antonio';

--Ejercicio 18: Cambia el estado de repetidor de todos los alumnos nacidos después del 1 de enero de 1995 a"sí".
	SELECT * FROM alumno; 

			UPDATE alumno
			SET es_repetidor ='sí'
			WHERE fecha_nacimiento > '01-01-1995';


--Ejercicio 19: Inserta un alumno llamado "Sofía Martínez Ruiz", nacida el 10 de octubre de 1998, que sí es
--repetidora y cuyo teléfono es 609876543.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,teléfono    ) VALUES 
                    ('Sofía', 'Martínez','Ruiz','10-10-1998', 'sí', '609876543');
	SELECT * FROM alumno WHERE nombre = 'Sofía';


--Ejercicio 20: Elimina a todos los alumnos que tienen el apellido materno "Ortega".

			DELETE FROM alumno
			WHERE apellido2 ='Ortega';

	SELECT * FROM alumno WHERE apellido2 ='Ortega';
