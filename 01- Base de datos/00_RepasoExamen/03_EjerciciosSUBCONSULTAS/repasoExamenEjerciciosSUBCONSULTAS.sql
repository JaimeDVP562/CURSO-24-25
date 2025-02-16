USE NBA

--01
SELECT *
FROM jugador
WHERE jugador.altura > (
	SELECT AVG(jugador.altura)
	FROM jugador
)


--02
SELECT jugador.nombre
FROM jugador
WHERE jugador.nombre_equipo IN(
	SELECT equipo.nombre
	FROM equipo
	WHERE equipo.nombre IN (
		SELECT partido.equipo_local
		FROM partido
		WHERE temporada = '98/99'
		AND (partido.equipo_visitante = 'Raptors' 
		OR partido.equipo_local = 'Raptors')
	)
)

--03
SELECT * 
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido <= 15
	AND temporada = '06/07'
)

--04
SELECT *
FROM jugador
WHERE jugador.nombre_equipo IN (
	SELECT equipo.nombre
	FROM equipo
	WHERE conferencia = 'East'
)
AND jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido > 20
	AND temporada = '07/08' 
)

--05
SELECT *
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE tapones_por_partido > 0.8
	AND temporada = '05/06' 
)

--06
SELECT *
FROM jugador
WHERE  jugador.altura > (
	SELECT AVG(jugador.altura)
	FROM jugador
	WHERE jugador.nombre_equipo = 'Timberwolves'
)

--07
SELECT EQUIPO.nombre
FROM equipo
WHERE equipo.nombre LIKE 'C%'
AND equipo.nombre IN (
	SELECT jugador.nombre_equipo
	FROM jugador
	WHERE jugador.peso > 250
)

--08
SELECT *
FROM jugador
WHERE jugador.codigo IN(
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido > (
		SELECT AVG(estadistica.puntos_por_partido)
		FROM estadistica
		WHERE temporada = '06/07'
	) AND temporada = '06/07'
)


