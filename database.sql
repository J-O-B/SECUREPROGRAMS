DROP DATABASE IF exists library;
CREATE DATABASE library;
use library;


CREATE TABLE books (
	book_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book_name VARCHAR(255),
    author VARCHAR(255),
    year_published INTEGER
);

