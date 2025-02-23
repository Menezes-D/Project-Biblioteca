CREATE DATABASE biblioteca_db;

USE biblioteca_db;

CREATE TABLE tbl_livros (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(300) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    editora VARCHAR(100) NOT NULL,
    ano_publicacao INT
);

INSERT INTO livros (titulo, autor, editora, ano_publicacao)VALUES
('O Senhor dos Anéis', 'J.R.R. Tolkine', 'HarperCollins', 1954),
('Dom Casmurro', 'Machado de Assis', 'Editora Garnier', 1899),
('1984', 'George Orwell', 'Companhia das Letras', 1949);

SELECT * FROM tbl_livros