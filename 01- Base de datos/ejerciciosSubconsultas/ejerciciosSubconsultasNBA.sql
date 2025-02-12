USE NBA
--Muestra un listado con los jugadores que tienen una altura mayor a la media. 
--Total de filas recuperadas: 224.

--EJ01
SELECT * 
FROM jugador
WHERE altura > (
	SELECT AVG(altura)
	FROM jugador
)


--EJ02
--Muestra un listado con los jugadores que han jugado en los partidos de la
--temporada '98/99' contra los Raptors. Total de filas recuperadas: 84.
SELECT jugador.nombre
FROM jugador
INNER JOIN estadistica ON jugador.codigo = estadistica.jugador
WHERE estadistica.temporada ='98/99'

	AND jugador.nombre_equipo IN(
		SELECT equipo_local
		FROM partido
		WHERE partido.equipo_visitante ='Raptors'
	) OR jugador.nombre_equipo IN
	(
		SELECT equipo_visitante
		FROM partido
		WHERE partido.equipo_local ='Raptors'	
	)

--EJ03

SELECT nombre
FROM jugador
WHERE codigo IN (
	SELECT jugador
	FROM estadistica
	WHERE puntos_por_partido < 15 
	AND temporada ='06/07'
)

--EJ04

SELECT nombre
FROM jugador
WHERE (nombre_equipo IN (
	SELECT nombre
	FROM equipo
	WHERE conferencia = 'East'
)) AND (codigo IN (
	SELECT jugador
	FROM estadistica
	WHERE puntos_por_partido > 20
	AND temporada = '07/08'
))	


--EJ05
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE tapones_por_partido > 0.8
	AND temporada ='05/06'
)

--EJ06
SELECT jugador.nombre
FROM jugador
WHERE altura > (
	SELECT AVG(altura)
	FROM jugador
	WHERE nombre_equipo ='Timberwolves'
)


--EJ07
SELECT equipo.nombre
FROM equipo
WHERE nombre LIKE 'C%' 
AND equipo.nombre IN (
	SELECT jugador.nombre_equipo
	FROM jugador
	WHERE peso > 250
)

--EJ08
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
		SELECT estadistica.jugador
		FROM estadistica
		WHERE temporada='06/07'
		AND puntos_por_partido > (
			SELECT AVG(puntos_por_partido)
			FROM estadistica
			WHERE temporada='06/07'
		)
)

--EJ09
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE temporada = '07/08'
	AND rebotes_por_partido >= 1
)

--EJ10
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido > 10
	AND temporada = '04/05'
	)

--EJ11
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE asistencias_por_partido < 3
	AND temporada = '03/04'
)

--EJ12
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE temporada = '07/08'
	AND puntos_por_partido >(
		SELECT AVG(puntos_por_partido)
		FROM estadistica
		WHERE temporada = '07/08'	
	)
)

--EJ13--------------------------------------->preguntar a fran<--------------NO SALEN LOS MISMOS RESULTADOS 
SELECT *
FROM jugador
WHERE jugador.nombre_equipo IN (
	SELECT equipo.nombre
	FROM equipo
	WHERE conferencia= 'East'
	AND equipo.nombre IN (
		SELECT partido.equipo_visitante
		FROM partido
		WHERE equipo_visitante = equipo.nombre
	)
) AND jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido >= 10
)
ORDER BY jugador.codigo

--EJ14--------------------------------------->preguntar a fran<--------------NO SALEN LOS MISMOS RESULTADOS 

SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE temporada ='07/08'
	AND puntos_por_partido > (
		SELECT AVG(estadistica.puntos_por_partido)
		FROM estadistica
		WHERE temporada ='07/08'
		)
) 


--EJ15
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE asistencias_por_partido < 5 
	AND temporada = '05/06'
)


--EJ16
SELECT jugador.nombre
FROM jugador
WHERE jugador.codigo IN (
	SELECT estadistica.jugador
	FROM estadistica
	WHERE puntos_por_partido > (
			SELECT AVG(puntos_por_partido)
			FROM estadistica
			WHERE estadistica.jugador IN (
				SELECT jugador.codigo
				FROM jugador
				WHERE nombre_equipo ='RaptorS')
	)
)ORDER BY jugador.nombre