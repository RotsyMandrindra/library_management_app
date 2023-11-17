--Créez un rôle que nous allons appeler “prog_admin” et attribuer les mots de passe 
CREATE ROLE prog_admin WITH LOGIN PASSWORD '123456';

--Créez une base de données dans Postgresql, nommée “library_management”
CREATE DATABASE library_management;

\c library_management

CREATE TABLE book(
    id_book serial PRIMARY KEY,
    book_name varchar(200) NOT NULL,
    page_numbers int NOT NULL,
    topics varchar(200) NOT NULL,
    release_date date NOT NULL
);

CREATE TABLE author(
    id_author serial PRIMARY KEY,
    author_name varchar(200) NOT NULL,
    sex char(1) NOT NULL
);

CREATE TABLE visitor(
    id_visitor serial PRIMARY KEY,
    visitor_name varchar(200) NOT NULL,
    reference varchar(200) NOT NULL
);

CREATE TABLE write(
    id_write serial PRIMARY KEY,
    id_author int REFERENCES author(id_author),
    id_book int REFERENCES book(id_book)
);


CREATE TABLE borrow_or_return(
    id_borrow_or_return serial PRIMARY KEY,
    id_visitor int REFERENCES visitor(id_visitor),
    id_book int REFERENCES book(id_book)
);