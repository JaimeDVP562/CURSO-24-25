use cientificos

--Ejercicio 01: Crear una vista que muestre el DNI y el nombre de los científicos.
CREATE VIEW datos_Cientificos AS
SELECT 
	cientifico.dni,
	cientifico.nombre As nombre
FROM cientifico

SELECT * 
FROM datos_Cientificos

--Ejercicio 02: Crear una vista que muestre los proyectos con más de 100 horas.

CREATE VIEW proyecto100horas AS
SELECT *
FROM proyecto
WHERE proyecto.horas > 100

SELECT *
FROM proyecto100horas

--Ejercicio 03: Crear una vista que muestre los 3 proyectos con menos horas dedicadas.

CREATE VIEW horasMasBajas AS
SELECT TOP 3*
FROM proyecto
ORDER BY proyecto.horas

SELECT *
FROM horasMasBajas


--Ejercicio 04: Crear una vista que muestre el DNI y el nombre de los científicos cuyo nombre contiene la letra 'e'
CREATE VIEW CIENTIFICOS AS
SELECT 
	cientifico.dni AS DNI,
	cientifico.nombre AS NOMBRE
FROM cientifico
WHERE cientifico.nombre LIKE '%e%';

SELECT *
FROM CIENTIFICOS

--Ejercicio 05: Crear una vista que muestre el nombre de cada científico y el nombre de los proyectos en los que está asignado.

CREATE VIEW CIENTIFICO2 AS
SELECT 	
	cientifico.nombre AS nombre_Cientifico,
	proyecto.nombre AS nombre_proyecto

FROM cientifico
INNER JOIN asignadoa ON asignadoa.cientifico = cientifico.dni
INNER JOIN proyecto ON asignadoa.proyecto = proyecto.codigo


SELECT *
FROM CIENTIFICO2


--Ejercicio 06: Crear una vista que muestre los 5 proyectos con más científicos asignados, ordenados de mayor a menor.



SELECT 
	proyecto.nombre
FROM proyecto
WHERE proyecto.codigo IN (
	SELECT asignadoa.proyecto
	FROM asignadoa
	WHERE asignadoa.cientifico IN (
		SELECT cientifico.dni
		FROM cientifico
	)
)



