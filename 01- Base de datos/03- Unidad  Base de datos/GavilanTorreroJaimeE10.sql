
--Alumno: Jaime Gavilán Torrero
--C.F.G.S. Desarrollo de aplicaciones Web
--Módulo Profesional: Base de datos 
--Curso Académico: 2024/2025



--Ejercicio 10: Disponemos de la siguiente base de datos para gestionar la información de los pubs de una
--determinada provincia.

--CREATE DATABASE pubs;
--USE  pubs;


--TABLE localidad

CREATE TABLE localidad(

		codigo_localidad INT,
		nombre NVARCHAR (25)NOT NULL,
		CONSTRAINT pk_localidad_codigo_localidad PRIMARY KEY (codigo_localidad)

);

--TABLE pub
CREATE TABLE pub(

		codigo NVARCHAR (9),
		nombre NVARCHAR (25)NOT NULL,
		licencia_fiscal NVARCHAR (200)NOT NULL,
		domicilio NVARCHAR (200),
		fecha_apertura DATE DEFAULT GETDATE() NOT NULL,
		horario NVARCHAR (50) NOT NULL,
		codigo_localidad INT NOT NULL,
		CONSTRAINT pk_pub_codigo PRIMARY KEY (codigo),
		CONSTRAINT fk_localidad_codigo_localidad FOREIGN KEY (codigo_localidad) REFERENCES localidad (codigo_localidad),
		CONSTRAINT ch_pub_horario CHECK (horario IN ('HORARIO1','HORARIO2','HORARIO3')),
		CONSTRAINT un_pub_licencia_fiscal UNIQUE (licencia_fiscal)

);
      
-- TABLE titular

CREATE TABLE titular(

		dni_titular NVARCHAR (9),
		nombre NVARCHAR (25)NOT NULL,
		domicilio NVARCHAR (200),
		codigo_Pub NVARCHAR (9)NOT NULL,
		CONSTRAINT pk_titular_dni_titular PRIMARY KEY (dni_titular),
		CONSTRAINT fk_titular_codigoPub FOREIGN KEY (codigo_Pub) REFERENCES pub (codigo)
);


-- TABLE empleado

CREATE TABLE empleado(

		dni_empleado NVARCHAR (9),
		nombre NVARCHAR (25)NOT NULL,
		domicilio NVARCHAR (200),
		CONSTRAINT pk_empleado_dni_empleado PRIMARY KEY (dni_empleado)
);


--TABLE articulo

CREATE TABLE articulo(

		codigo_articulo NVARCHAR (9),
		nombre NVARCHAR (25)NOT NULL,
		cantidad INT NOT NULL,
		precio INT NOT NULL,
		codigo_Pub NVARCHAR (9)NOT NULL,
		CONSTRAINT pk_articulo_codigo_articulo PRIMARY KEY (codigo_articulo),
		CONSTRAINT fk_titular_codigo_Pub FOREIGN KEY (codigo_Pub) REFERENCES pub (codigo),
		CONSTRAINT ch_articulo_precio CHECK (precio > 0)
);


--TABLE pub-empleado

CREATE TABLE pub_empleado(

		codigo_Pub NVARCHAR (9),
		dni_empleado NVARCHAR (9),
		funcion NVARCHAR(25),
		CONSTRAINT fk_pub_emplado_codigo_Pub FOREIGN KEY (codigo_Pub) REFERENCES pub (codigo),
	    CONSTRAINT fk_pub_emplado_dni_empleado FOREIGN KEY (dni_empleado) REFERENCES empleado (dni_empleado),
		CONSTRAINT ch_pub_empleado_funcion CHECK (funcion  IN ('CAMARERO', 'SEGURIDAD', 'LIMPIEZA'))
);


