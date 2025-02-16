USE jardineria

--01

SELECT oficina.ciudad, oficina.telefono 
FROM oficina
WHERE oficina.pais LIKE 'Espa�a'

--02

SELECT 
	empleado.nombre AS nombre,
	empleado.apellido1 AS apellido1,
	empleado.apellido2 AS apellido2,
	empleado.puesto AS puesto
FROM empleado
WHERE empleado.puesto NOT LIKE 'Representante'

--03
SELECT 
	pedido.codigo_pedido AS CODIGO_PEDIDO,
	pedido.codigo_cliente AS CODIGO_CLIENTE,
	pedido.fecha_esperada AS FECHA_ESPERADA,
	pedido.fecha_entrega AS FECHA_ENTREGA
FROM pedido
WHERE DATEDIFF(DAY, fecha_entrega, fecha_esperada)>=2

--04
SELECT 
	pedido.codigo_pedido AS CODIGO_PEDIDO,
	pedido.codigo_cliente AS CODIGO_CLIENTE,
	pedido.fecha_pedido AS FECHA_PEDIDO,
	pedido.estado as ESTADO
FROM pedido
WHERE pedido.estado LIKE 'Rechazado'

--05
SELECT 
	producto.codigo_producto AS CODIGO_PRODUCTO,
	producto.nombre AS NOMBRE_PRODUCTO,
	producto.gama AS GAMA,
	producto.cantidad_en_stock AS CANTIDAD_STOCK,
	producto.precio_venta
FROM producto
INNER JOIN gama_producto ON gama_producto.gama = producto.gama
WHERE producto.gama = 'Ornamentales'
	AND producto.cantidad_en_stock > 100
ORDER BY producto.precio_venta

--06
SELECT 
	cliente.codigo_cliente AS CODIGO_CLIENTE,
	cliente.nombre_cliente AS NOMBRE_CLIENTE,
	cliente.ciudad AS CIUDAD,
	cliente.codigo_empleado_rep_ventas AS CODIGO_REPRE_VENTAS
		
FROM cliente
WHERE ciudad = 'Madrid' 
	AND cliente.codigo_empleado_rep_ventas = 11
	OR cliente.codigo_empleado_rep_ventas = 30 

--07
SELECT 
	cliente.nombre_cliente AS NOMBRE_CLIENTE,
	CONCAT(empleado.nombre,' ', empleado.apellido1, ' ',empleado.apellido2) AS NOMBRE_COMPLETO_EMPLEADO,
	oficina.ciudad AS CIUDAD_EMPLEADO

FROM cliente
INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina


--08
SELECT 
	cliente.nombre_cliente AS NOMBRE_CLIENTE,
	pedido.fecha_entrega AS FECHA_ENTREGA,
	pedido.fecha_esperada AS FECHA_ESPERADA
FROM cliente
INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
WHERE pedido.fecha_entrega > pedido.fecha_esperada

--09
SELECT 
	oficina.linea_direccion1 AS DIRECCION1_OFICINA,
	oficina.linea_direccion2 AS DIRECCION2_OFICINA,
	oficina.ciudad AS CIUDAD
FROM oficina
INNER JOIN empleado ON empleado.codigo_oficina = oficina.codigo_oficina 
INNER JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
WHERE cliente.ciudad = 'Fuenlabrada'

--10

SELECT DISTINCT
	cliente.nombre_cliente AS NOMBRE_CLIENTE,
	producto.gama AS GAMA
FROM cliente
INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
INNER JOIN linea_pedido ON pedido.codigo_pedido = linea_pedido.codigo_pedido
INNER JOIN producto ON linea_pedido.codigo_producto = producto.codigo_producto
ORDER BY producto.gama

--11

SELECT DISTINCT
	oficina.codigo_oficina AS CODIGO_OFICINA,
	oficina.ciudad AS CIUDAD,
	oficina.ciudad AS PAIS_CIUDAD
FROM oficina
	INNER JOIN empleado ON empleado.codigo_oficina = oficina.codigo_oficina 
	INNER JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
	INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
	INNER JOIN linea_pedido ON pedido.codigo_pedido = linea_pedido.codigo_pedido
	INNER JOIN producto ON linea_pedido.codigo_producto = producto.codigo_producto
WHERE producto.gama = 'Frutales'

--12
SELECT *
FROM empleado 
	LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
WHERE cliente.codigo_empleado_rep_ventas IS NULL


--13 

SELECT *
FROM empleado
INNER JOIN empleado jefe ON empleado.codigo_empleado = jefe.codigo_jefe
INNER JOIN empleado jefeJefe ON jefe.codigo_jefe = jefeJefe.codigo_empleado