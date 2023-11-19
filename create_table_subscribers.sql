--Créez un rôle que nous allons appeler “prog_admin” et attribuer les mots de passe 
CREATE ROLE prog_admin WITH LOGIN PASSWORD '123456';

--Créez une base de données dans Postgresql, nommée “library_management”
CREATE DATABASE IF NOT EXISTS library_management;

\c library_management

CREATE TABLE IF NOT EXISTS subscribers (
    id SERIAL PRIMARY KEY,
    user_id INT,
    subscription_date DATE
);

INSERT INTO subscribers (user_id, subscription_date) VALUES
    (1, '2023-01-01'),
    (2, '2023-02-15'),
    (3, '2023-03-20');