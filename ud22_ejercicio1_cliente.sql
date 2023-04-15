/*Primero ponemos un DROP para que elimine y vuelva a cargar la base de datos 
en caso de que ya exista*/
/*DROP DATABASE IF EXISTS ud22_ejercicio1_cliente;*/

/*Creamos la base de datos*/
CREATE DATABASE ud22_ejercicio1_cliente;

/*Entramos en la base de datos*/
USE ud22_ejercicio1_cliente;


CREATE TABLE cliente (
id INT NOT NULL auto_increment ,
nombre varchar(250) DEFAULT NULL,
apellido varchar(250) DEFAULT NULL,
direccion varchar(250) DEFAULT NULL,
dni int DEFAULT NULL,
fecha  DATE DEFAULT NULL,
PRIMARY KEY (id)
);