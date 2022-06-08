/*
-- esto es un comentario --

INSERT INTO profesor (direccion,dni,fecha_nacimiento,nombre,telefono) VALUES
("Calle La Paz 13", "20040956L", "2011-12-28", "Jose Luis", "+34654345670"),
("Calle La Paz 13", "20040967L", "2011-12-28", "Mario", "+34654345670"),
("Calle La Paz 13", "20077956L", "2011-12-28", "Pepito", "+34654345670"),
("Calle La Paz 13", "20009956L", "2011-12-28", "Andres", "+34654345670");

INSERT INTO modulo (duracion_años, nombre) VALUES
(2, "DAM"),
(2, "DAW"),
(4, "ESO");

insert into rol (nombre) values
("administrador");

INSERT INTO curso (año, modulo_curso) VALUES
-- DAM --
(1,1),
(2,1),
-- DAW --
(1,2),
(2,2),
-- ESO --
(1,3),
(2,3),
(3,3),
(4,3);

INSERT INTO asignatura (nombre, curso_asignatura) VALUES
("Programacion",1),
("Base de datos",1),
("FOL",1),
("Historia",5),
("EIE",3);

INSERT INTO alumno (direccion,dni,fecha_nacimiento,nombre,telefono,curso_alumno) values
-- Alumnos DAM año1 --
("Calle Ramon", "25550056L", "1980-12-28", "Jose", "+34654344570",1),
("Calle Ramon", "25224056L", "1980-12-28", "Paco", "+34654344570",1),
("Calle Ramon", "25553022L", "1980-12-28", "Pepe", "+34654344570",1),
("Calle Ramon", "25551056V", "1980-12-28", "Xavi", "+34654344570",1),
("Calle Ramon", "25559056L", "1980-12-28", "Ramon", "+34654344570",1),
-- Alumnos DAM año2 --
("Calle Ramon", "25550056A", "1980-12-28", "Jose", "+34654344570",2),
("Calle Ramon", "25553356L", "1980-12-28", "Paco", "+34654344570",2),
("Calle Ramon", "25554856L", "1980-12-28", "Pepe", "+34654344570",2),
-- Alumnos DAW año1 --
("Calle Ramon", "25550056M", "1980-12-28", "Felipe", "+34654344570",3),
("Calle Ramon", "25551056L", "1980-12-28", "Paco", "+34654344570",3),
("Calle Ramon", "25553056L", "1980-12-28", "Pepe", "+34654344570",3),
-- Alumnos DAW año2 --
("Calle Ramon", "25550056Z", "1980-12-28", "Jose", "+34654344570",4),
("Calle Ramon", "25554056L", "1980-12-28", "Paco", "+34654344570",4),
("Calle Ramon", "25551156L", "1980-12-28", "Pepe", "+34654344570",4),
-- Alumnos ESO año1 --
("Calle Ramon", "22550056L", "1980-12-28", "Jose", "+34654344570",5),
("Calle Ramon", "23554056L", "1980-12-28", "Paco", "+34654344570",5),
("Calle Ramon", "24553056L", "1980-12-28", "Pepe", "+34654344570",5),
-- Alumnos ESO año2 --
("Calle Ramon", "26550056L", "1980-12-28", "Jose", "+34654344570",6),
("Calle Ramon", "27554056L", "1980-12-28", "Paco", "+34654344570",6),
("Calle Ramon", "28553056L", "1980-12-28", "Pepe", "+34654344570",6),
-- Alumnos ESO año3 --
("Calle Ramon", "29550056L", "1980-12-28", "Jose", "+34654344570",7),
("Calle Ramon", "15554056L", "1980-12-28", "Paco", "+34654344570",7),
("Calle Ramon", "35553056L", "1980-12-28", "Pepe", "+34654344570",7),
-- Alumnos ESO año4 --
("Calle Ramon", "45550056L", "1980-12-28", "Jose", "+34654344570",8),
("Calle Ramon", "65554056L", "1980-12-28", "Paco", "+34654344570",8),
("Calle Ramon", "525553056L", "1980-12-28", "Pepe", "+34654344570",8);


insert into profesor_asignatura (id_asignatura,id_curso,id_profesor) VALUES 
(1,1,1),
(5,5,2),
(4,3,1);

insert into usuario (nombre,password,profesor_id,rol_usuario) values
("admin","$2a$12$5uf5z6MEXkN8ptCVVAgYs.LKNN51JKpJVhvCiDKvhG2mexNNk7lPW",1,1),
("admin2","$2a$12$5uf5z6MEXkN8ptCVVAgYs.LKNN51JKpJVhvCiDKvhG2mexNNk7lPW",2,1);

*/