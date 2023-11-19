--Créez un rôle que nous allons appeler “prog_admin” et attribuer les mots de passe 
CREATE ROLE prog_admin WITH LOGIN PASSWORD '123456';

--Créez une base de données dans Postgresql, nommée “library_management”
CREATE DATABASE IF NOT EXISTS library_management;

\c library_management

CREATE TABLE IF NOT EXISTS book(
    id_book serial PRIMARY KEY,
    book_name varchar(200) NOT NULL,
    page_numbers int NOT NULL,
    topics varchar(200) NOT NULL,
    release_date date NOT NULL
);

INSERT INTO book (title, author_id, topic, publication_year) VALUES
    ('The Catcher in the Rye', 1, 'OTHER', 1951),
    ('To Kill a Mockingbird', 2, 'OTHER', 1960),
    ('1984', 3, 'OTHER', 1949);

CREATE TYPE IF NOT EXISTS topic AS ENUM ('COMEDY', 'ROMANCE', 'OTHER');
