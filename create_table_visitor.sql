--Créez un rôle que nous allons appeler “prog_admin” et attribuer les mots de passe 
CREATE ROLE prog_admin WITH LOGIN PASSWORD '123456';

--Créez une base de données dans Postgresql, nommée “library_management”
CREATE DATABASE IF NOT EXISTS library_management;

\c library_management

CREATE TABLE IF NOT EXISTS visitor(
    id_visitor serial PRIMARY KEY,
    visitor_name varchar(200) NOT NULL,
    reference varchar(200) NOT NULL
);

INSERT INTO visitor (visitor_name, reference) VALUES
    ('John Doe', 'Ref123'),
    ('Jane Smith', 'Ref456'),
    ('Bob Johnson', 'Ref789');