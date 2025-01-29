--Jaime Gavil�n Torrero
-- Turno de tarde DAW
--CURSO 2024/2025

USE jardineria;


--Ejercicio 01: Muestra un listado con la ciudad y el tel�fono de las oficinas de Espa�a.

SELECT ciudad, telefono
FROM oficina
WHERE pais='España';

--Ejercicio 02: Muestra un listado con el nombre, apellidos y puesto de aquellos empleados que 
--no sean representantes de ventas.

SELECT nombre, apellido1, apellido2, puesto
FROM empleado
WHERE puesto NOT LIKE 'Representante%';

--Ejercicio 03: Muestra un listado con el c�digo de pedido, c�digo de cliente, fecha esperada y fecha de entrega de los pedidos 
--cuya fecha de entrega ha sido al menos dos d�as antes de la fecha esperada. Investiga para ello la funci�n DATEDIFF de SQL Server.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
FROM pedido
WHERE DATEDIFF(DAY, fecha_entrega, fecha_esperada) >= 2;


--Ejercicio 04: Muestra un listado con todos los pedidos que fueron rechazados en 2009.

SELECT *
FROM pedido
WHERE estado = 'Rechazado' AND
fecha_pedido BETWEEN '2009-01-01' AND '2010-01-01';

--Ejercicio 05: Muestra un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades 
--en stock. El listado debería estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.

SELECT * 
FROM producto
WHERE gama LIKE 'Ornamentales'
AND cantidad_en_stock > 100
ORDER BY precio_venta DESC;

--Ejercicio 06: Muestra un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el 
--c�digo de empleado 11 o 30.

SELECT 
	cliente.nombre_cliente,
	cliente.ciudad,
	cliente.codigo_empleado_rep_ventas

FROM cliente
INNER JOIN empleado ON codigo_empleado = codigo_empleado_rep_ventas
WHERE ciudad ='Madrid' AND codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30;


--Ejercicio 07: Muestra un listado con el nombre de los clientes y el nombre completo de sus representantes junto con la ciudad de 
--la oficina a la que pertenece el representante.



------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
SELECT 
	cliente.nombre_cliente AS nombre_cliente,
	CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) AS nombre_completo_empleado,
	oficina.ciudad AS ciudad_oficina
FROM cliente
INNER JOIN empleado ON  codigo_empleado_rep_ventas = codigo_empleado 
INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;
------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------


--Ejercicio 08: Muestra un listado con el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.

SELECT 
	cliente.nombre_cliente,
	pedido.fecha_entrega,
	pedido.fecha_esperada
FROM cliente
INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
WHERE pedido.fecha_entrega > pedido.fecha_esperada;


--Ejercicio 09: Muestra la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT
	oficina.linea_direccion1,
	oficina.linea_direccion2,
	oficina.ciudad
FROM oficina
INNER JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina
INNER JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
WHERE oficina.ciudad = 'Madrid';


--Ejercicio 10: Muestra un listado con las diferentes gamas de producto que ha comprado cada cliente.


------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
SELECT 
	cliente.nombre_cliente AS nombre_cliente,
	producto.gama
FROM cliente
INNER JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente
INNER JOIN linea_pedido ON pedido.codigo_pedido = linea_pedido.codigo_pedido
INNER JOIN producto ON producto.codigo_producto = linea_pedido.codigo_producto
INNER JOIN gama_producto ON producto.gama = gama_producto.gama;
------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------


--Ejercicio 11: Muestra un listado con las oficinas donde trabajan los empleados que hayan sido los representantes 
--de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.


------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
SELECT 
	oficina.codigo_oficina AS codico_oficina,
	oficina.ciudad AS ciudad,
	oficina.pais AS pais

FROM oficina
INNER JOIN empleado ON empleado.codigo_oficina = oficina.codigo_oficina
INNER JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
INNER JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente
INNER JOIN linea_pedido ON pedido.codigo_pedido = linea_pedido.codigo_pedido
INNER JOIN producto ON producto.codigo_producto = linea_pedido.codigo_producto
INNER JOIN gama_producto ON producto.gama = gama_producto.gama
WHERE gama_producto.gama LIKE 'Frutales' ;

------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------


--Ejercicio 12: Muestra un listado que muestre solamente los empleados que no tienen un cliente asociado.


------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
SELECT DISTINCT *
FROM empleado
LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas;
------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------


--Ejercicio 13: Muestra un listado con el nombre de cada empleado, el nombre de su jefe y el nombre del jefe de su 
--jefe. Solo deberás mostrar 3 columnas, una con el nombre completo del empleado, otra con el nombre completo del jefe 
--y otra con el nombre completo del jefe del jefe.

------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
SELECT 
	empleado.nombre AS nombre_empleado,
	jefe.nombre AS nombre_jefe,
	jefejefe.nombre AS jefe_jefe
FROM empleado
INNER JOIN  empleado jefe ON empleado.codigo_empleado = jefe.codigo_empleado
INNER JOIN  empleado jefejefe ON jefe.codigo_empleado = jefejefe.codigo_empleado;
------------------------------------------------------------------------------------->Preguntar a Fran<------------------------------------------------
