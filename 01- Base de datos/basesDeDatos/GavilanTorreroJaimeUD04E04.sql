--Ejercicio 01: Muestra un listado con los jugadores que tienen una altura mayor a la media.

SELECT *
FROM jugador 
WHERE altura >
	(SELECT 
	AVG(altura)
	FROM jugador)
ORDER BY altura
;

--Ejercicio 02: Muestra un listado con los jugadores que han jugado en los partidos de la temporada '98/99' contra los Raptors.

	SELECT * 
	FROM partido
	WHERE temporada = '98/99'



		SELECT *
		FROM equipo
		WHERE nombre LIKE 'Raptors';