#añadir datos

use biblioteca;
SET FOREIGN_KEY_CHECKS = 0;
truncate table autor;
truncate table libros;
truncate table volumenes;
truncate table prestamos;
truncate table personas;
SET FOREIGN_KEY_CHECKS = 1;

insert into autor values(1,"Stephen king");
insert into autor values(2, "John Ronald Reuel Tolkien");
insert into autor values(3, "Stephanie Meyer");
insert into autor values(4, "Edgar Alan Poe");

insert into libros values("0123457890-a", "it", "alfaguara", year("1986-09-15"), 1);
insert into libros values("01234567890-b", "the Lord of the rings", "castellana", year("1954-07-29"), 2 );
insert into libros values("01234567890-c", "Hunger games", "Grupo Planeta", year("2008-09-14"), 3);
insert into libros values("01234567890-d", "Black cat", "Edebe", year("2003-08-19"), 4);

insert into volumenes values (1, false, "0123457890-a");
insert into volumenes values (2, true, "0123457890-a");
insert into volumenes values (3, false, "01234567890-b");
insert into volumenes values (4, true, "01234567890-b");
insert into volumenes values (5, false,"01234567890-c");
insert into volumenes values (6, true,"01234567890-c");
insert into volumenes values (7, false,"01234567890-d");
insert into volumenes values (8, true,"01234567890-d");

insert into personas values('12345678A',1, 'David', 'Orive Ramírez', '+34638238475','Lagunetas, 11',1);
insert into personas values('23456789B',1, 'Richard', 'González Rodríguez', '+34582932328','Calle Mogollón, 03',1);
insert into personas values('13579103C',1, 'Juan', 'Gómez Fernández', '+34123456789','Calle málaga, 04',1);
insert into personas values('19249092D',1, 'Ivet', 'López Díaz', '+34234567890','Calle Italia, 05',1);
insert into personas values('90214909C',1, 'Kevin', 'Martínez Pérez', '+34246801234','Calle Cayetana, 06',1);
insert into personas values('98124822D',1, 'Pablo', 'Sánchez Romero', '+34494332211','Calle Dermo, 07',1);
insert into personas values('19204219F',1, 'Esteban', 'Sosa Torres', '+34954342211','Calle Remo, 08',1);
insert into personas values('89142829G',1, 'Carla', 'Álvarez Ruiz', '+34928321232','Calle Raqueta, 09',1);

insert into prestamos values(1, CURDATE(), '2019-09-20', 3, '12345678A');
insert into prestamos values(2, CURDATE(), '2019-09-21', 1, '23456789B');
insert into prestamos values(3, CURDATE(), '2019-09-22', 5, '13579103C');
insert into prestamos values(4, CURDATE(), '2019-09-23', 6, '19249092D');
insert into prestamos values(5, CURDATE(), '2019-09-24', 2, '90214909C');
insert into prestamos values(6, CURDATE(), '2019-09-25', 4, '98124822D');
insert into prestamos values(7, CURDATE(), '2019-09-25', 3, '19204219F');

select * from autor;
select * from libros;
select * from volumenes;
select * from personas;
select * from prestamos;