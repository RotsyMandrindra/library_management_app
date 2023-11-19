--Créez un rôle que nous allons appeler “prog_admin” et attribuer les mots de passe 
CREATE ROLE prog_admin WITH LOGIN PASSWORD '123456';

--Créez une base de données dans Postgresql, nommée “library_management”
CREATE DATABASE IF NOT EXISTS library_management;

\c library_management

CREATE TABLE IF NOT EXISTS author(
    id_author serial PRIMARY KEY,
    author_name varchar(200) NOT NULL,
    sex char(1) NOT NULL
);

INSERT INTO author (name, birth_year) VALUES
    ('J.D. Salinger', 1919),
    ('Harper Lee', 1926),
    ('George Orwell', 1903);
