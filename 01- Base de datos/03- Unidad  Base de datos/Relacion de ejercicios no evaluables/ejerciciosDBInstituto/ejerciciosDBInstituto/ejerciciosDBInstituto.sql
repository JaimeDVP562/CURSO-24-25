 USE instituto;

-- Ejercicio 01: Inserta un nuevo alumno llamado "Laura G�mez Garc�a", nacida el 15 de marzo de 2000, que
--no es repetidora y cuyo n�mero de tel�fono es 654987321. INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,tel�fono   ) VALUES 
                    ('Laura', 'G�mez','Garc�a','15-03-2000', 'no', '654987321');--SELECT * FROM alumno;--Ejercicio 02: Elimina de la tabla al alumno cuyo n�mero de tel�fono sea 692735409.

		DELETE FROM alumno 
		WHERE tel�fono ='692735409';

--Ejercicio 03: Cambia el estado de repetidor del alumno llamado "Irene Guti�rrez S�nchez" a "no".
				UPDATE alumno 		SET es_repetidor = 'no' 		WHERE nombre = 'Irene' 			AND apellido1 = 'Guti�rrez'			AND apellido2 = 'S�nchez';
	SELECT * FROM alumno WHERE nombre = 'Irene';

--Ejercicio 04: A�ade un alumno llamado "Carlos L�pez Mart�nez", nacido el 10 de mayo de 1997, que s� es
--repetidor y no tiene tel�fono.



--Ejercicio 05: Elimina de la tabla al alumno con el ID 3.

		DELETE FROM alumno 
		WHERE id='3';

SELECT * FROM alumno; 

--Ejercicio 06: Actualiza el n�mero de tel�fono del alumno llamado "Cristina Fern�ndez Ram�rez" a
--699123456.

				UPDATE alumno 		SET tel�fono = '699123456' 		WHERE nombre = 'Cristina' 			AND apellido1 = 'Fern�ndez'			AND apellido2 = 'Ram�rez';
	SELECT * FROM alumno WHERE nombre = 'Cristina';

--Ejercicio 07: Inserta un nuevo alumno llamado "Ra�l S�nchez Ruiz", nacido el 25 de diciembre de 1995, que
--no es repetidor y cuyo n�mero de tel�fono es 622345678.



 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,tel�fono   ) VALUES 
                    ('Ra�l', 'S�nchez','Ruiz','25-12-1995', 'no', '622345678');

	SELECT * FROM alumno WHERE nombre = 'Ra�l';

--Ejercicio 08: Elimina a todos los alumnos que no tienen n�mero de tel�fono asignado.

		DELETE FROM alumno
		WHERE tel�fono IS NULL;

	SELECT * FROM alumno;

--Ejercicio 09: Cambia el apellido paterno de todos los alumnos con apellido "S�nchez" a "Sancho".

SELECT * FROM alumno WHERE apellido1 = 'S�nchez';

		UPDATE alumno
		SET apellido1 ='Sancho'
		WHERE apellido1 = 'S�nchez';

SELECT * FROM alumno WHERE apellido1 = 'S�nchez';
SELECT * FROM alumno WHERE apellido1 = 'Sancho';

--Ejercicio 10: Inserta un alumno llamado "Ana Torres Garc�a", nacida el 30 de noviembre de 1999, que s� es
--repetidora y cuyo n�mero de tel�fono es 687654321.


 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,tel�fono   ) VALUES 
                    ('Ana', 'Torres','Garc�a','30-11-1999', 's�', '687654321');

	SELECT * FROM alumno WHERE nombre = 'Ana';


--Ejercicio 11: Elimina a los alumnos cuyo estado de repetidor sea "s�".

SELECT * FROM alumno WHERE es_repetidor ='s�';
DELETE FROM alumno WHERE es_repetidor ='s�';


--Ejercicio 12: Cambia el nombre del alumno con el ID 10 a "David".

	SELECT * FROM alumno WHERE id = '10';

			UPDATE alumno
			SET nombre ='David'
			WHERE id = '10';

	SELECT * FROM alumno WHERE nombre = 'David';


--Ejercicio 13: Inserta un alumno llamado "Marta P�rez L�pez", nacida el 20 de agosto de 1993, que no es
--repetidora y cuyo tel�fono es 634567890.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,tel�fono   ) VALUES 
                    ('Marta', 'P�rez','L�pez','20-08-1993', 'no', '634567890');

	SELECT * FROM alumno WHERE nombre = 'Marta';


--Ejercicio 14: Elimina a los alumnos nacidos antes del 1 de enero de 1990.


	SELECT * FROM alumno WHERE fecha_nacimiento ='01-01-1990';

	DELETE FROM alumno WHERE fecha_nacimiento < '01-01-1990';



--Ejercicio 15: Establece el n�mero de tel�fono "600000000" a todos los alumnos que no tengan n�mero de
--tel�fono asignado.
	SELECT * FROM alumno; 

			UPDATE alumno
			SET tel�fono ='600000000'
			WHERE tel�fono IS NULL;

--Ejercicio 16: Inserta un alumno llamado "Javier Rodr�guez Garc�a", nacido el 5 de enero de 1992, que no es
--repetidor y no tiene tel�fono.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor   ) VALUES 
                    ('Javier', 'Rodr�guez','Garc�a','5-01-1992', 'no');

	SELECT * FROM alumno WHERE nombre = 'Javier';

--Ejercicio 17: Elimina a los alumnos cuyo nombre sea "Antonio".

			DELETE  FROM alumno 
			WHERE nombre = 'Antonio';

	SELECT * FROM alumno WHERE nombre = 'Antonio';

--Ejercicio 18: Cambia el estado de repetidor de todos los alumnos nacidos despu�s del 1 de enero de 1995 a"s�".
	SELECT * FROM alumno; 

			UPDATE alumno
			SET es_repetidor ='s�'
			WHERE fecha_nacimiento > '01-01-1995';


--Ejercicio 19: Inserta un alumno llamado "Sof�a Mart�nez Ruiz", nacida el 10 de octubre de 1998, que s� es
--repetidora y cuyo tel�fono es 609876543.

 INSERT INTO alumno (nombre, apellido1, apellido2,fecha_nacimiento,es_repetidor,tel�fono    ) VALUES 
                    ('Sof�a', 'Mart�nez','Ruiz','10-10-1998', 's�', '609876543');
	SELECT * FROM alumno WHERE nombre = 'Sof�a';


--Ejercicio 20: Elimina a todos los alumnos que tienen el apellido materno "Ortega".

			DELETE FROM alumno
			WHERE apellido2 ='Ortega';

	SELECT * FROM alumno WHERE apellido2 ='Ortega';
