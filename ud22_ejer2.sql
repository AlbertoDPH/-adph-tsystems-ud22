/*Primero ponemos un DROP para que elimine y vuelva a cargar la base de datos 
en caso de que ya exista*/
DROP DATABASE IF EXISTS ud22_ejer2;

/*Creamos la base de datos*/
CREATE DATABASE ud22_ejer2;

/*Entramos en la base de datos*/
USE ud22_ejer2;

CREATE TABLE cliente (
id INT NOT NULL auto_increment ,
nombre varchar(250) DEFAULT NULL,
apellido varchar(250) DEFAULT NULL,
direccion varchar(250) DEFAULT NULL,
dni int DEFAULT NULL,
fecha  DATE DEFAULT NULL,
PRIMARY KEY (id)
);

CREATE TABLE videos (
id INT NOT NULL auto_increment ,
titulo varchar(250) DEFAULT NULL,
director varchar(250) DEFAULT NULL,
cli_id int DEFAULT NULL,
PRIMARY KEY (id),
constraint videos_fk foreign key (cli_id) references cliente (id)
);