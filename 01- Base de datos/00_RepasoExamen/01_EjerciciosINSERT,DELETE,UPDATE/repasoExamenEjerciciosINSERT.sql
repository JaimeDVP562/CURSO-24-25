USE jardineria

--01 
SELECT *
FROM oficina

INSERT INTO oficina(codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2) 
VALUES ('ALM-ES','Barcelona','España','Almeria','08019','+34 93 3561182','Avenida Diagonal, 38','3A escalera Derecha');


--02
SELECT *
FROM empleado

SELECT *
FROM oficina


INSERT INTO empleado(codigo_empleado, nombre, apellido1, apellido2, extension, email, codigo_oficina, codigo_jefe, puesto) 
VALUES (32,'Maria','Palma','Aceituno','2519','mari@jardineria.es','ALM-ES',1,'Representante Ventas');


--03
SELECT *
FROM cliente

INSERT INTO cliente(codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, linea_direccion1, linea_direccion2, ciudad, region, pais, codigo_postal, codigo_empleado_rep_ventas, limite_credito) 
VALUES (39,'Mari Two','Mari G','GoldFish','5556901745','5556901746','False Street 52 2 A',NULL,'San Francisco',NULL,'USA','24006',32,3000.00);

--04
SELECT *
FROM pedido

INSERT INTO pedido(codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega, estado, comentarios, codigo_cliente) 
VALUES (129,'2006-01-17','2006-01-19','2006-01-19','Entregado','Pagado a plazos',39);


--05

--Primero consultamos el cliente con el codigo que nos piden
SELECT *
FROM cliente
WHERE codigo_cliente = 39;

--Borramos la constraint que nos impide que podamos modificar el codigo cliente ya que está referenciando a otra tabla
ALTER TABLE pedido 
DROP CONSTRAINT fk_pedido_cliente

--Volvemos a añadir la contraint a la tabla pedido con la condicion de que se pueda modificar en cascada
ALTER TABLE pedido 
ADD CONSTRAINT fk_pedido_cliente FOREIGN KEY (codigo_cliente) REFERENCES cliente (codigo_cliente)
ON UPDATE CASCADE

--Modificamos el codigo del cliente 
UPDATE cliente
SET codigo_cliente = 40
WHERE codigo_cliente = 39

--Consultamos el cliente con el codigo anterior
SELECT *
FROM cliente
WHERE codigo_cliente = 39;

--Consultamos el cliente con el codigo modificado
SELECT *
FROM cliente
WHERE codigo_cliente = 40;


--06

--Primero consultamos SI PODEMOS BORRAR el cliente con el codigo que nos piden

DELETE FROM cliente
WHERE cliente.codigo_cliente = 40

--Borramos la constraint que nos impide que podamos modificar el codigo cliente ya que está referenciando a otra tabla
ALTER TABLE pedido 
DROP CONSTRAINT fk_pedido_cliente

--Volvemos a añadir la contraint a la tabla pedido con la condicion de que se pueda modificar en cascada
ALTER TABLE pedido 
ADD CONSTRAINT fk_pedido_cliente FOREIGN KEY (codigo_cliente) REFERENCES cliente (codigo_cliente)
ON DELETE CASCADE

--Modificamos el codigo del cliente 
DELETE FROM cliente
WHERE codigo_cliente = 40

--Consultamos el cliente con el codigo anterior 
SELECT *
FROM cliente
WHERE codigo_cliente = 40;

--07
SELECT *
FROM linea_pedido;

ALTER TABLE linea_pedido
ADD total_linea DECIMAL(15,2)

UPDATE linea_pedido
SET total_linea = (precio_unidad * cantidad *1.21)

