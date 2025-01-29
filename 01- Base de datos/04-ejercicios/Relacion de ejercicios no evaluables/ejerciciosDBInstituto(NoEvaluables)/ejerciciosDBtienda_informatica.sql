USE tienda_informatica;


--Ejercicio 01: Inserta un nuevo fabricante.

SELECT * FROM fabricante;
INSERT INTO fabricante(codigo, nombre) 
				VALUES (13, 'Sony');

--Ejercicio 02: Inserta un nuevo producto asociado al nuevo fabricante.

SELECT * FROM producto;

INSERT INTO producto(codigo, nombre, precio, cod_fabricante) 
				VALUES (42, 'Taza para el café', 50, 13);


--Ejercicio 03: Elimina el fabricante Asus. �Es posible eliminarlo? Si no fuese posible, �qu� cambios deber�a
--realizar para que fuese posible borrarlo?

-- En principio no podemos borrar el fabricante Asus porque entra en conflicto al tener una foreign key 
-- apuntando a la tabla de producto por lo que para borrarla tendremos que hacerlo de la siguiente manera: 


		SELECT * FROM fabricante
		WHERE nombre ='Asus';

		 ALTER TABLE producto
		 DROP CONSTRAINT fk_producto_fabricante; --> 1. Borramos la constraint que apunta a la tabla producto

		 ALTER TABLE producto                    --> 2. Alteramos la tabla volviendo a crear la foreign key 
												 --pero con la condici�n de ON DELETE CASCADE. Esto es para 
												 --que cuando queramos borrar la una clave que apunte a otra
												 -- tabla, podamos borrarla sin problema.
		 ADD CONSTRAINT fk_producto_fabricante
		 FOREIGN KEY (cod_fabricante) 
		 REFERENCES fabricante(codigo)
		 ON DELETE CASCADE;

		 DELETE FROM fabricante					  --> Una vez creada la foreign key con la condicion de ON DELETE 
												  --CASCADE ya podremos borrar campo sin ningun problema aunque 
												  --esté aputando alguna FK a otra tabla 
		 WHERE nombre = 'Asus';



--Ejercicio 04: Elimina el fabricante Xiaomi. ¿Es posible eliminarlo? Si no fuese posible, �qu� cambios deber�a
--realizar para que fuese posible borrarlo?

		SELECT * FROM fabricante
		WHERE nombre LIKE '%Xiaomi%';

		--> En primer lugar tendremos que buscar si tenemos algún fabricante que se llame 'Xiaomi' y como 
		--no lo tenemos es impoisible borrar un campo que no tenemos. Por otro lado si lo tuvieramos, ç
		--tendríamos que borrarlo como hicimos en el caso anterior -->

		 --ALTER TABLE producto
		 --DROP CONSTRAINT fk_producto_fabricante; --> 1. Borramos la constraint que apunta a la tabla producto
												 
												 --> 2. Alteramos la tabla volviendo a crear la foreign key 
												 --pero con la condici�n de ON DELETE CASCADE. Esto es para 
												 --que cuando queramos borrar la una clave que apunte a otra
												 -- tabla, podamos borrarla sin problema.
												 
		 --ALTER TABLE producto  
		 --ADD CONSTRAINT fk_producto_fabricante
		 --FOREIGN KEY (cod_fabricante) 
		 --REFERENCES fabricante(codigo)
		 --ON DELETE CASCADE;

		 --DELETE FROM fabricante				  --> Una vez creada la foreign key con la condicion de ON DELETE 
												  --CASCADE ya podremos borrar campo sin ningun problema aunque 
												  --esté aputando alguna FK a otra tabla 
		 --WHERE nombre = 'Asus';



--Ejercicio 05: Actualiza el codigo del fabricante Lenovo y asignale el valor 81. ¿Es posible actualizarlo? Si no
--fuese posible, ¿que cambios deberia realizar para que fuese actualizarlo?

SELECT * FROM fabricante
WHERE nombre='Lenovo';

			UPDATE fabricante
			SET codigo = 81
			WHERE nombre = 'Lenovo' ;


--Ejercicio 06: Actualiza el codigo del fabricante Huawei y asignale el valor 130. Es posible actualizarlo? Si
--no fuese posible, que cambios deberia realizar para que fuese actualizarlo?


SELECT * FROM fabricante
WHERE nombre='Huawei';

			UPDATE fabricante
			SET codigo = 130
			WHERE nombre = 'Huawei' ;


--Ejercicio 07: Actualiza el precio de todos los productos sum�ndole 5 � al precio actual.

SELECT * FROM producto;

			UPDATE producto
			SET precio = precio + 5;


--Ejercicio 08: Elimina todas las impresoras que tienen un precio menor de 200 �.

SELECT * FROM producto
WHERE nombre  LIKE 'Printer%' AND precio < 200;

DELETE FROM producto
WHERE nombre  LIKE 'Printer%' AND precio < 200;

--Ejercicio 09: Elimina todos los productos que valgan 5€.

SELECT * FROM producto
WHERE precio = 5;

DELETE FROM producto
WHERE precio = 5;


--Ejercicio 10: Elimina todos los fabricantes con codigo 6.

SELECT * FROM fabricante
WHERE codigo = 6;

DELETE FROM fabricante
WHERE codigo = 6;

--Ejercicio 11: Elimina todos los productos que valgan m�s de 200�.

SELECT * FROM producto
WHERE precio > 200;

DELETE FROM producto
WHERE precio > 200;

--Ejercicio 12: Elimina todos los productos que valgan 90� o menos.

SELECT * FROM producto
WHERE precio < 91;

DELETE FROM producto
WHERE precio < 91;

--Ejercicio 13: Elimina los fabricantes que se llamen "Sony".

SELECT * FROM fabricante
WHERE nombre = '&Sony%';

DELETE FROM fabricante
WHERE nombre = '&Sony%';


--Ejercicio 14: Elimina los productos con precio diferente a 240�.

SELECT * FROM producto
WHERE precio NOT LIKE 240;

DELETE FROM producto
WHERE precio NOT LIKE 240;

--Ejercicio 15: Elimina todos los productos que en su nombre contengan la palabra "drive"


SELECT * FROM producto
WHERE nombre LIKE '%drive%';

DELETE FROM producto
WHERE nombre LIKE '%drive%';

--Ejercicio 16: Elimina todos los productos que valgan entre 100€ y 200€.

SELECT * FROM producto
WHERE precio BETWEEN 100 AND 200;

DELETE FROM producto
WHERE precio BETWEEN 100 AND 200;


--Ejercicio 17: Elimina todos los fabricantes que comiencen por "F".

SELECT * FROM fabricante
WHERE nombre LIKE 'F%';

DELETE FROM fabricante
WHERE nombre LIKE 'F%';

--Ejercicio 18: Elimina todos los productos que valgan m�s de 100� o menos de 250�.

SELECT * FROM producto
WHERE precio >100 
	OR precio < 250;

DELETE FROM producto
WHERE precio >100 
	OR precio < 250;

--Ejercicio 19: Elimina todos los fabricantes con código menor o igual a 3.

SELECT * FROM fabricante
WHERE codigo <= 3;

DELETE FROM fabricante
WHERE codigo <= 3;

--Ejercicio 20: Elimina todos los fabricantes que su nombre termine por "Labs".


SELECT * FROM fabricante
WHERE nombre LIKE '%Labs';

DELETE FROM fabricante
WHERE nombre LIKE '%Labs';

--Ejercicio 21: Elimina todos los productos que tengan una d en su nombre.

SELECT * FROM producto
WHERE nombre LIKE '%d%';

DELETE FROM producto
WHERE nombre LIKE '%d%';

--Ejercicio 22: Elimina todos los productos con precio comprendido entre 150€ y 270€ y que su nombre
--contenga la palabra "Printer".

SELECT * FROM producto
WHERE precio BETWEEN 100 AND 200 
	  AND nombre LIKE '%Printer%';


DELETE FROM producto
WHERE precio BETWEEN 100 AND 200 
	  AND nombre LIKE '%Printer%';


--Ejercicio 23: Actualiza a 250� el precio de los productos que su c�digo sea 1.


SELECT * FROM producto
WHERE codigo= 1;

		UPDATE producto
		SET precio = 250
		WHERE codigo =1;

--Ejercicio 24: Actualiza el nombre del fabricante que tenga c�digo 2 a "Creative".


SELECT * FROM fabricante
WHERE codigo= 2;

		UPDATE fabricante
		SET nombre = 'Creative'
		WHERE codigo = 2;

--Ejercicio 25: Incrementa el precio de todos los productos en 10.

SELECT * FROM producto;

		UPDATE producto
		SET precio = precio + 10;

--Ejercicio 26: Reduce el precio de todos los productos que cuesten máas de 50€ en 5.


SELECT * FROM producto
WHERE precio > 50;

		UPDATE producto
		SET precio = precio + 5
		WHERE precio > 50;


--Ejercicio 27: Cambia el nombre del producto con código 3 a "ZIP storage".


SELECT * FROM producto
WHERE codigo= 3;

		UPDATE producto
		SET nombre = 'ZIP storage'
		WHERE codigo= 3;

--Ejercicio 28: Cambia el precio a 200€ a todos los productos que valgan menos de 100€.

SELECT * FROM producto
WHERE precio < 100;

		UPDATE producto
		SET precio = 200
		WHERE precio < 100;

--Ejercicio 29: Cambia el nombre de los fabricantes que tengan en su nombre la palabra "Labs" a "Creative
--Labs Updated".


SELECT * FROM fabricante
WHERE nombre ='%Labs%';

		UPDATE fabricante
		SET nombre = 'Creative Labs Updated'
		WHERE nombre ='%Labs%';


--Ejercicio 30: Sube el precio un 20% a todos los productos cuyo precio este entre 50€ y 150€.

SELECT * FROM producto
WHERE precio BETWEEN 50 AND 150;

		UPDATE producto
		SET precio = precio * 1.2
		WHERE precio BETWEEN 50 AND 150;

--Ejercicio 31: Aumenta el precio en 30€ a todos los productos que valgan 120€ o menos.

SELECT * FROM producto
WHERE precio = 120 OR precio < 120;

		UPDATE producto
		SET precio = precio + 30
		WHERE precio = 120 OR precio < 120;

--Ejercicio 32: Cambia el fabricante a todos los productos cuyo precio sea mayor a 100 al fabricante con c�digo
--1.

SELECT * FROM producto
WHERE precio > 100;

		UPDATE producto
		SET codigo = 1
		WHERE precio > 100;

--Ejercicio 33: Cambia el precio a 200� a todos los productos que empiecen por "DVD".


SELECT * FROM producto
WHERE nombre LIKE 'DVD%';

		UPDATE producto
		SET precio = 200
		WHERE nombre LIKE 'DVD%';

--Ejercicio 34: Cambia el nombre a �High Memory� a todos los productos que cuesten m�s de 150� y contengan
--"Memory" en el nombre.

SELECT * FROM producto
WHERE precio > 150 
	AND nombre LIKE '%Memory%';

		UPDATE producto
		SET nombre ='High Memory'
		WHERE precio > 150 
		AND nombre LIKE '%Memory%';

--Ejercicio 35: Cambia el precio a 100€ a todos los productos que contengan "disk" o que valgan m�s de 10�.

SELECT * FROM producto
WHERE precio > 10 
	AND nombre LIKE '%disk%';

		UPDATE producto
		SET precio = 100
		WHERE precio > 10 
		AND nombre LIKE '%disk%';

--Ejercicio 36: Cambia el precio a 150� a todos los productos de los fabricantes 2, 3 y 4.

SELECT * FROM producto
WHERE codigo BETWEEN 2 AND 4;
		
		UPDATE producto
		SET precio = 150
		WHERE codigo BETWEEN 2 AND 4;