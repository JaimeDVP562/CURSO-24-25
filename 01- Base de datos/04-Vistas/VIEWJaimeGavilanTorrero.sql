--Jaime Gavilan Torrero

use nba

--Ejercicio 01: Crea una vista que muestre cuántos partidos ha ganado cada equipo como local.

CREATE VIEW EquipoLocalGana AS
	SELECT
		equipo.nombre AS equipo,
		COUNT(partido.puntos_local) AS victorias_local
	FROM equipo
	INNER JOIN partido ON equipo.nombre = partido.equipo_local
	WHERE partido.puntos_local > partido.puntos_visitante
	GROUP BY equipo.nombre, partido.equipo_local
	;

SELECT * FROM EquipoLocalGana;

--Ejercicio 02: Crea una vista que muestre la altura promedio (redondeada a 2 decimales) de los jugadores por equipo.

CREATE VIEW alturaMedia AS
	SELECT nombre_equipo, ROUND(AVG(altura),2) AS altura_promedio
	FROM jugador
	GROUP BY nombre_equipo
	;

SELECT * FROM alturaMedia;


--Ejercicio 03: Crea una vista que muestre el total de puntos combinados (habiendo jugado como local y como visitante) de cada equipo por temporada.

CREATE VIEW puntosCombinadosLocalVisitante AS
	SELECT equipo_local, temporada, SUM( puntos_visitante + puntos_local)AS total_puntos_temporada
	FROM partido
	GROUP BY equipo_local, temporada
	;

SELECT * FROM puntosCombinadosLocalVisitante;

--Ejercicio 04: Crea una vista que muestre los nombres de los equipos y el número de jugadores en cada equipo, solo para equipos con más de 10 jugadores.

CREATE VIEW totalJugadores AS
	SELECT 
		nombre_equipo AS nombre, 
		COUNT(codigo) AS cantidad_jugadores
	FROM jugador
	GROUP BY nombre_equipo
	HAVING COUNT(codigo) > 10
	;

SELECT * FROM totalJugadores;

--Ejercicio 05: Crea una vista que muestre los jugadores y el nombre de su equipo, de los jugadores que tengan un promedio de asistencias mayor a 5. 
--El promedio de asistencias deberá estar redondeado a 2 decimales.

--EJERCICIO 05
CREATE VIEW asistenciasMayoraCinco AS
	SELECT 
		nombre AS nombre_jugador,
		nombre_equipo, 
		ROUND(AVG(estadistica.asistencias_por_partido), 2) AS promedio_asistencias
	FROM jugador
	INNER JOIN estadistica ON jugador.codigo = estadistica.jugador
	GROUP BY nombre, nombre_equipo
	HAVING ROUND(AVG(estadistica.asistencias_por_partido), 2) > 5
	;

SELECT * FROM asistenciasMayoraCinco;