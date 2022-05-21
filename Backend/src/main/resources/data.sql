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

INSERT INTO curso (año, modulo_curso) VALUES
(1,1),
(2,1),
(1,2),
(2,2),
(1,3),
(2,3),
(3,3),
(4,3);

INSERT INTO asignatura (nombre, curso_asignatura) VALUES
("Programacion",1),
("Base de datos",1),
("FOL",1),
("EIE",3);

INSERT INTO alumno (direccion,dni,fecha_nacimiento,nombre,telefono,curso_alumno) VALUES
("Calle Ramon", "25550056L", "1980-12-28", "Jose", "+34654344570",1),
("Calle Ramon", "25554056L", "1980-12-28", "Paco", "+34654344570",1),
("Calle Ramon", "25553056L", "1980-12-28", "Pepe", "+34654344570",1),
("Calle Ramon", "25551056L", "1980-12-28", "Xavi", "+34654344570",1),
("Calle Ramon", "25559056L", "1980-12-28", "Ramon", "+34654344570",1);

insert into profesor_asignatura (id_asignatura,id_curso,id_profesor) VALUES 
(1,1,1),
(4,3,1);

*/