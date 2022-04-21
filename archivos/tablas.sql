create database if not exists java_api;
use java_api;
-- CONCEPTOS --
CREATE TABLE if not exists Concepto (
                                         id_concepto int auto_increment,
                                         nombre_concepto varchar(50),
                                         numero_concepto int,
                                         contenido_concepto longtext,
                                         id_capitulo int,
                                         primary key (id_concepto)
);



-- PREGUNTAS --
CREATE TABLE if not exists Preguntas (
                                         id_pregunta int  auto_increment,
                                         contenido_pregunta varchar(255),
                                         id_concepto int ,
                                         primary key (id_pregunta),
                                         FOREIGN KEY (id_concepto) REFERENCES Concepto(id_concepto)
);


-- EJEMPLOS --
CREATE TABLE if not exists ejemplo (
    id_ejemplos int  auto_increment,
    descripcion_ejemplo varchar(255),
    contenido_ejemplo varchar(255),
    id_concepto int,
    primary key(id_ejemplos),
    FOREIGN key (id_concepto) REFERENCES Concepto(id_concepto)
);

-- RESPUESTAS --
CREATE TABLE if not exists Respuestas (
                                          id_respuesta int PRIMARY key auto_increment,
                                          contenido_respuestas varchar(255) not null,
                                          id_pregunta int,
                                          es_correcta boolean not null,
                                          FOREIGN KEY (id_pregunta) REFERENCES Preguntas(id_pregunta)
);