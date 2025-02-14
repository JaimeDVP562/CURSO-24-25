--Alumno: Jaime Gavilan Torrero
--C.F.G.S. Desarrollo de aplicaciones Web
--Modulo Profesional: Base de datos 
--Curso Academico: 2024/2025


USE jardineria;


--EJ01

INSERT INTO oficina(codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2) 
			VALUES ('ALM-ES','Almeria','España','Almeria','29007','+34 951 591 591','Avenida Diagonal, 38','3A escalera Derecha');


--EJ02
SELECT * FROM empleado;

INSERT INTO empleado(codigo_empleado, nombre, apellido1, apellido2, extension, email, codigo_oficina, codigo_jefe, puesto) 
					VALUES (32,'Amanda','Gavilan','Torrero','3898','Amanda@jardineria.es','ALM-ES',NULL,'Representante de ventas');

--Ej03
SELECT * FROM cliente;

INSERT INTO cliente(codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, linea_direccion1, linea_direccion2, ciudad, region, pais, codigo_postal, codigo_empleado_rep_ventas, limite_credito) 
				VALUES (39,'Antonio','Antonio B','Banderas','627259482','627259482','False Street 20','False Street 20','San M�laga',NULL,'USA','29007',32,5.000);


--Ej04

SELECT * FROM producto;

SELECT * FROM pedido;

INSERT INTO pedido(codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega, estado, comentarios, codigo_cliente) 
			VALUES (129,'2025-01-17','2025-01-19','2025-01-19','Entregado','Pagado a plazos',39);


--Ej05

SELECT * FROM cliente
WHERE codigo_cliente=39;

	 --> 1. Borramos la constraint que apunta a la tabla producto

		 ALTER TABLE pedido
		 DROP CONSTRAINT fk_pedido_cliente; 

	 --> 2. Alteramos la tabla volviendo a crear la foreign key 
	 --pero con la condici�n de ON DELETE CASCADE. Esto es para 
	 --que cuando queramos borrar la una clave que apunte a otra
	 -- tabla, podamos borrarla sin problema.

		 ALTER TABLE pedido
		 ADD CONSTRAINT fk_pedido_cliente
		 FOREIGN KEY (codigo_cliente) 
		 REFERENCES cliente(codigo_cliente)
		 ON UPDATE CASCADE;

	--> Una vez creada la foreign key con la condicion de ON UPDATE 
	--CASCADE ya podremos borrar campo sin ningun problema aunque 
	--est� aputando alguna FK a otra tabla 

		 UPDATE cliente
		 SET codigo_cliente = 40
		 WHERE codigo_cliente = 39;			 
		 
--Ej06

SELECT * FROM cliente
WHERE codigo_cliente=40;

	 --> 1. Borramos la constraint que apunta a la tabla producto

		 ALTER TABLE pedido
		 DROP CONSTRAINT fk_pedido_cliente; 

	 --> 2. Alteramos la tabla volviendo a crear la foreign key 
	 --pero con la condici�n de ON DELETE CASCADE. Esto es para 
	 --que cuando queramos borrar la una clave que apunte a otra
	 -- tabla, podamos borrarla sin problema.

		 ALTER TABLE pedido
		 ADD CONSTRAINT fk_pedido_cliente
		 FOREIGN KEY (codigo_cliente) 
		 REFERENCES cliente (codigo_cliente)
		 ON DELETE CASCADE;

	--> Una vez creada la foreign key con la condicion de ON UPDATE 
	--CASCADE ya podremos borrar campo sin ningun problema aunque 
	--est� aputando alguna FK a otra tabla 

		 DELETE FROM cliente
		 WHERE codigo_cliente = 40;	

--Ej07

SELECT * FROM linea_pedido;


--Primero añadimos la columna y luedo la modificamos 
ALTER TABLE linea_pedido
ADD total_linea DECIMAL;



		 UPDATE linea_pedido
		 SET total_linea = precio_unidad * cantidad * 1.21;

--EJ08
INSERT INTO oficina(codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2) 
			VALUES ('GRD-ES','Granada','España','Granada','29007','+34 951 591 591','Avenida Diagonal, 38','3A escalera Derecha');


SELECT * FROM empleado;

INSERT INTO empleado(codigo_empleado, nombre, apellido1, apellido2, extension, email, codigo_oficina, codigo_jefe, puesto) 
					VALUES (33,'Adri','Gavilan','Torrero','3898','Adri@jardineria.es','ALM-ES',NULL,'Representante de ventas'),
					(34,'Jose','Gavilan','Torrero','3898','Jose@jardineria.es','ALM-ES',NULL,'Representante de ventas'),
					(35,'Jaime','Gavilan','Torrero','3898','Jaime@jardineria.es','ALM-ES',NULL,'Representante de ventas');


--Ej09


SELECT * FROM cliente;

INSERT INTO cliente(codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, linea_direccion1, linea_direccion2, ciudad, region, pais, codigo_postal, codigo_empleado_rep_ventas, limite_credito) 
				VALUES (41,'Antonio','Antonio B','Banderas','627259482','627259482','False Street 20','False Street 20','San M�laga',NULL,'USA','29007',33,5.000),
				(42,'Antonio','Antonio B','Banderas','627259482','627259482','False Street 20','False Street 20','San M�laga',NULL,'USA','29007',34,5.000),
				(43,'Antonio','Antonio B','Banderas','627259482','627259482','False Street 20','False Street 20','San M�laga',NULL,'USA','29007',35,5.000);


--Ej10

DELETE FROM cliente
WHERE codigo_cliente = 41;

-- Sí es posible eliminarlo.