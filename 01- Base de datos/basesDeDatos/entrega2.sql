--Jaime Gavilán Torrero
-- Turno de tarde DAW
--CURSO 2024/2025

USE jardineria;


--Ejercicio 01: Muestra un listado con la ciudad y el teléfono de las oficinas de España.

SELECT ciudad, telefono
FROM oficina
WHERE pais='España';

--Ejercicio 02: Muestra un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.

SELECT nombre, apellido1, apellido2, puesto
FROM empleado
WHERE puesto NOT LIKE 'Representante%';

--Ejercicio 03: Muestra un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos 
--cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada. Investiga para ello la función DATEDIFF de SQL Server.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
FROM pedido
WHERE DATEDIFF(DAY, fecha_entrega, fecha_esperada) >= 2;


--Ejercicio 04: Muestra un listado con todos los pedidos que fueron rechazados en 2009.

SELECT *
FROM pedido
WHERE estado = 'Rechazado' AND
fecha_pedido BETWEEN '2009-01-01' AND '2009-12-31';

--Ejercicio 05: Muestra un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades 
--en stock. El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.

SELECT * 
FROM producto
WHERE gama LIKE 'Ornamentales'
AND cantidad_en_stock > 100
ORDER BY precio_venta DESC;

--Ejercicio 06: Muestra un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el 
--código de empleado 11 o 30.

SELECT 
	cliente.nombre_cliente,
	cliente.ciudad,
	cliente.codigo_empleado_rep_ventas

FROM cliente
INNER JOIN empleado ON codigo_empleado = codigo_empleado_rep_ventas
WHERE ciudad ='Madrid' AND codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30;

--Ejercicio 07: Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.

SELECT 
	cliente.nombre_cliente,
	empleado.nombre,
	empleado.apellido1,
	empleado.apellido2
FROM cliente
INNER JOIN empleado ON codigo_empleado = codigo_empleado_rep_ventas
RIGTH
WHERE ciudad ='Madrid' AND codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30;