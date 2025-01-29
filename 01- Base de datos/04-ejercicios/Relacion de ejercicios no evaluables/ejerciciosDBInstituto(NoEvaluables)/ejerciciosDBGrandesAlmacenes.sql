USE grandes_almacenes;

--Ejercicio 01: Elimina el cajero con el código 1.

 ALTER TABLE venta
 DROP CONSTRAINT fk_venta_cajero;

 ALTER TABLE venta
 ADD CONSTRAINT fk_venta_cajero
 FOREIGN KEY (cajero)
 REFERENCES cajero(codigo)
 ON DELETE CASCADE;

DELETE FROM cajero WHERE codigo = 1;

--Ejercicio 02: Elimina los productos que valgan más de 100€.

 ALTER TABLE venta
 DROP CONSTRAINT fk_venta_producto;

 ALTER TABLE venta
 ADD CONSTRAINT fk_venta_producto
 FOREIGN KEY (producto)
 REFERENCES producto(codigo)
 ON DELETE CASCADE;

DELETE FROM producto WHERE precio > 100;
SELECT * FROM producto;

--Ejercicio 03: Elimina las máquinas registradoras que se encuentren en el segundo piso.

DELETE FROM maquina_registradora WHERE piso = 2;


--Ejercicio 04: Elimina las ventas realizadas por el cajero con código 2.

DELETE FROM venta WHERE cajero = 2;
SELECT * FROM venta WHERE cajero =2;


--Ejercicio 05: Elimina los productos que empiecen por C.

SELECT * FROM producto WHERE nombre LIKE 'Camiseta%';

DELETE FROM producto WHERE nombre LIKE 'C%';


--Ejercicio 06: Elimina los cajeros que se llamen Kumar.

SELECT * FROM cajero WHERE nombrecompleto LIKE 'Kumar%';

DELETE FROM cajero WHERE nombrecompleto LIKE 'Kumar%';

--Ejercicio 07: Elimina los productos que cuesten entre 50 y 150 euros.

SELECT * FROM producto WHERE precio BETWEEN 50 and 150;
DELETE  FROM producto WHERE precio BETWEEN 50 and 150;


--Ejercicio 08: Elimina las máquinas registradoras de los pisos 3 y 4.

SELECT * FROM maquina_registradora WHERE piso BETWEEN 3 and 4;
DELETE  FROM maquina_registradora WHERE piso BETWEEN 3 and 4;

--Ejercicio 09: Elimina todas las ventas de los productos cuyo código es el 5 y de las máquinas registradores
--cuyo código es el 3.

SELECT * FROM venta WHERE producto = 5 AND maquina = 3;
DELETE FROM venta WHERE producto = 5 AND maquina = 3;


--Ejercicio 10: Elimina los cajeros con código menor que 10 y que no se llamen Joe.

SELECT * FROM cajero
WHERE nombrecompleto  LIKE 'Joe%' AND codigo < 10;

DELETE  FROM cajero
WHERE nombrecompleto  LIKE 'Joe%' AND codigo < 10;


--Ejercicio 11: Elimina los productos que no valgan 200€.

SELECT * FROM producto
WHERE precio NOT LIKE 200;

DELETE  FROM producto
WHERE precio NOT LIKE 200;

--Ejercicio 12: Elimina las máquinas registradoras de los pisos inferiores al 2.

SELECT * FROM maquina_registradora
WHERE piso < 2;

DELETE  FROM maquina_registradora
WHERE piso < 2;

--Ejercicio 13: Elimina los productos que terminen en X.
SELECT * FROM producto
WHERE nombre LIKE '%x';

DELETE  FROM producto
WHERE  nombre LIKE '%x';

--Ejercicio 14: Cambia el precio del producto 1 a 120€.

	SELECT * FROM producto
	WHERE  codigo =1;

		UPDATE  producto
		SET precio = 120
		WHERE codigo =1;

--Ejercicio 15: Cambia el nombre del cajero 2 a "María López".

	SELECT * FROM cajero
	WHERE  codigo =2;

	UPDATE cajero
	SET nombrecompleto = 'María López'
	WHERE codigo =2;

--Ejercicio 16: Modifica la máquina registradora 3 para que se encuentre en el segundo piso.

	SELECT * FROM maquina_registradora
	WHERE  codigo = 3;

	UPDATE maquina_registradora
	SET piso = 2
	WHERE codigo =3;

--Ejercicio 17: Incrementa el precio de todos los productos en 10€.

	SELECT precio FROM producto;

	UPDATE producto
	SET precio = precio + 10
	WHERE codigo =3;

--Ejercicio 18: Cambia el nombre de los productos que son promociones a "Oferta".

	SELECT * FROM producto;
	
	UPDATE producto
	SET precio = precio + 10
	WHERE codigo =3;


--Ejercicio 19: Añade el apellido "Pérez" a los cajeros cuyo nombre empiece por F.

	SELECT * FROM cajero
	WHERE nombrecompleto LIKE 'F%';
	
	UPDATE cajero
	SET nombrecompleto = nombrecompleto + ' Pérez'
	WHERE nombrecompleto LIKE 'F%';

--Ejercicio 20: Reduce un 10% el precio de los productos que valgan entre 50 y 100 euros.
	
	SELECT * FROM producto
	WHERE precio BETWEEN 50 AND 100;
	
	UPDATE producto
	SET precio = precio * 0.90
	WHERE precio BETWEEN 50 AND 100;

--Ejercicio 21: Incrementa el precio de los productos premium en 15€.

	SELECT * FROM producto
	WHERE nombre LIKE '%Premium%';
	
	UPDATE producto
	SET precio = precio + 15
	WHERE nombre LIKE '%Premium%';

--Ejercicio 22: Actualiza el nombre de los cajeros con código mayor a 10 para que incluyan " (Senior)".


	SELECT * FROM cajero
	WHERE codigo > 10;
	
	UPDATE cajero
	SET nombrecompleto = nombrecompleto + ' (Senior)'
	WHERE codigo > 10;


--Ejercicio 23: Incrementa en 20€ el precio de los productos con código menor a 10 o si en el nombre contienen
--"Especial".

	SELECT * FROM producto
	WHERE codigo < 10 OR nombre LIKE '%Especial%';
	
	UPDATE producto
	SET precio = precio + 20
	WHERE codigo < 10 OR nombre LIKE '%Especial%';

--Ejercicio 24: Cambia a 300€ el precio de los productos con código entre 5 y 10.

	SELECT * FROM producto
	WHERE precio BETWEEN 5 AND 10;
	
	UPDATE producto
	SET precio = 300
	WHERE precio BETWEEN 5 AND 10;


---Ejercicio 25: Agrega " - En descuento" a los productos cuyo precio es inferior a 30€ para indicar que están
--en descuesto.


	SELECT * FROM producto
	WHERE precio <30;
	
	UPDATE producto
	SET nombre = nombre + ' - En descuento'
	WHERE precio < 30;
