

--Alumno:  Jaime Gavilan Torrero
--Examen BADAT UD02-UD03
--Curso 1 DAW tarde 


CREATE DATABASE pokedex;
USE pokedex;



CREATE TABLE tipo (
		
		idTipo NVARCHAR (50), 
		nombre NVARCHAR (50) NOT NULL, 
		CONSTRAINT pk_tipo_idTipo PRIMARY KEY idTipo,
		CONSTRAINT un_tipo_nombre UNIQUE nombre
);

CREATE TABLE categoria (
		
		idCategoria NVARCHAR (50), 
		nombre NVARCHAR (50) NOT NULL, 
		CONSTRAINT pk_categoria_idCategoria PRIMARY KEY idCategoria,
		CONSTRAINT un_categoria_nombre UNIQUE nombre
);

CREATE TABLE pokemon (
		
		numeroPokedex NVARCHAR (50), 
		nombre NVARCHAR (50) NOT NULL, 
		descripcion NVARCHAR (250)NOT NULL,
		foto NVARCHAR (150)NOT NULL,
		idCategoria NVARCHAR (50)NOT NULL,
		CONSTRAINT pk_pokemon_numeroPokedex PRIMARY KEY numeroPokedex,
		CONSTRAINT fk_pokemon_idCategoria FOREIGN KEY idCategoria REFERENCES categoria(idCategoria),
		CONSTRAINT un_pokemon_nombre UNIQUE nombre, 
		CONSTRAINT df_pokemon DEFAULT descripcion 'Es un pokemon pacifico'
);

CREATE TABLE habilidad (
		
		idHabilidad NVARCHAR (50), 
		nombre NVARCHAR (50)NOT NULL, 
		CONSTRAINT pk_pokemon_idHabilidad PRIMARY KEY idHabilidad,
		CONSTRAINT un_habilidad_nombre UNIQUE nombre

);

CREATE TABLE debilidad (
		
		idDebilidad NVARCHAR (50), 
		nombre NVARCHAR (50)NOT NULL, 
		CONSTRAINT pk_debilidad_idDebilidad PRIMARY KEY idDebilidad,
		CONSTRAINT un_debilidad_nombre UNIQUE nombre

);

CREATE TABLE estadistica (
		
		numeroPokedex NVARCHAR (50), 
		peso DECIMAL (10,2)NOT NULL, 
		altura DECIMAL (10,2)NOT NULL, 
		vida INT (255)NOT NULL, 
		velocidad INT (255)NOT NULL, 
		def_es INT (255)NOT NULL, 
		ata_es INT (255)NOT NULL, 
		defensa INT(255)NOT NULL, 
		ataque INT (255),NOT NULL 

		CONSTRAINT pk_pokemon_numeroPokedex PRIMARY KEY numeroPokedex,
		CONSTRAINT fk_estadistica_numeroPokedex FOREIGN KEY numeroPokedex REFERENCES pokemon (numeroPokedex)

);

CREATE TABLE tipo-pokemon (

		idTipo NVARCHAR (50), 
		numeroPokedex NVARCHAR (50), 
		CONSTRAINT pk_tipo-pokemon PRIMARY KEY numeroPokedex, idTipo,
		CONSTRAINT fk_tipo-pokemon_idTipo FOREIGN KEY idTipo REFERENCES tipo (idTipo),
		CONSTRAINT fk_tipo-pokemon_numeroPokedex FOREIGN KEY numeroPokedex REFERENCES pokemon (numeroPokedex)

);

CREATE TABLE pokemon-habilidad (

		idHabilidad NVARCHAR (50), 
		numeroPokedex NVARCHAR (50), 
		CONSTRAINT pk_tipo-pokemon PRIMARY KEY numeroPokedex, idHabilidad,
		CONSTRAINT fk_tipo-pokemon_idHabilidad FOREIGN KEY idHabilidad REFERENCES habilidad (idHabilidad),
		CONSTRAINT fk_tipo-pokemon_numeroPokedex FOREIGN KEY numeroPokedex REFERENCES pokemon (numeroPokedex)

);

CREATE TABLE pokemon-debilidad (

		idDebilidad NVARCHAR (50), 
		numeroPokedex NVARCHAR (50), 
		CONSTRAINT pk_tipo-pokemon PRIMARY KEY numeroPokedex, idDebilidad,
		CONSTRAINT fk_tipo-pokemon_idDebilidad FOREIGN KEY idDebilidad REFERENCES debilidad (idDebilidad),
		CONSTRAINT fk_tipo-pokemon_numeroPokedex FOREIGN KEY numeroPokedex REFERENCES pokemon (numeroPokedex)

);




-- EJERCICIO 02 

--Apartado d) 

ALTER TABLE pokemon
ADD COLUMN tipo_evolucion;

ALTER TABLE pokemon 
ADD CONSTRAINT df_pokemon_tipo_evolucion DEFAULT tipo_evolucion ('Nivel','Piedra Fuego','Piedra Agua','Piedra Piedra Fuego','Piedra Trueno', 'Piedra Hoja', 'Piedra Lunar', 'Intercambio', 'No evoluciona');


--Apartado e) 

ALTER TABLE pokemon
ADD COLUMN fecha_descubrimiento;


ALTER TABLE pokemon
MODIFY COLUMN fecha_descubrimiento NOT NULL;




