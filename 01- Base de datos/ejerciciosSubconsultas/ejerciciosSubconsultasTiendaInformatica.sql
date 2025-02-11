use tienda_informatica
----------------------------------------------->EJERCICIOS DB TIENDA INFORMATICA
--Ej01
SELECT * 
FROM producto
WHERE cod_fabricante IN (
	SELECT codigo
	FROM fabricante
	WHERE nombre='Sony');


--Ej02

SELECT  TOP 1*
FROM producto
WHERE cod_fabricante IN (
	SELECT codigo
	FROM fabricante
	WHERE nombre = 'Samsung'
)
ORDER BY precio DESC;

--EJ03
SELECT TOP 1 nombre 
FROM producto 
WHERE  cod_fabricante IN (
	SELECT codigo 
	FROM fabricante
	WHERE nombre = 'Hewlett-Packard'
)
ORDER BY precio DESC;


--Ej04
SELECT TOP 1 nombre 
FROM producto 
WHERE  cod_fabricante IN (
	SELECT codigo 
	FROM fabricante
	WHERE nombre = 'LG'
)
ORDER BY precio ASC;

--EJ05--> Precio máximo de un producto
SELECT * 
FROM producto
WHERE precio >=(
	SELECT MAX(precio) 
	FROM producto 
	WHERE  cod_fabricante IN (
		SELECT codigo 
		FROM fabricante
		WHERE nombre = 'Asus'
	)
)
ORDER BY precio;

--EJ06
--preguntar a fran------------------------------------------------------------------------<>
SELECT * 
FROM producto
WHERE precio >(
	SELECT AVG(precio)
	FROM producto
	WHERE cod_fabricante IN (
		SELECT codigo
		FROM fabricante
		WHERE nombre='Asus')
		)

--EJ07

SELECT *
FROM producto
WHERE precio >= ALL (
	SELECT precio
	FROM producto
)

--EJ08

SELECT *
FROM producto
WHERE precio <= ALL (
	SELECT precio
	FROM producto
)






