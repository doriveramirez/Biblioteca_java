drop database if exists biblioteca;
create database biblioteca;
use biblioteca;

create table autor(

codigoAutor int primary key,
nombre varchar(50)

);

create table libros(

isbn varchar(25) primary key,
titulo varchar(50),
editorial varchar(50),
añoPublicacion year,
codigoAutor int,
foreign key (codigoAutor) references autor(codigoAutor)

);

create table volumenes(

codigoVolumen int primary key,
deterioro boolean default false,
isbn varchar(25),
foreign key (isbn) references libros(isbn)

);

create table personas(
dni varchar(10) primary key,
codigoSocio int,
nombre varchar(20),
apellidos varchar(20),
telefono varchar(12),
direccion varchar(50),
codigoPrestamo int
);

create table prestamos(

codigoPrestamo int primary key,
fechaPrestamo date,
fecha date,
codigoVolumen int,
dni varchar(10),
foreign key (codigoVolumen) references volumenes(codigoVolumen),
foreign key (dni) references personas(dni)
);