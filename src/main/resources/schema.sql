CREATE TABLE book(
    id int auto_increment,
    title varchar(255) NOT NULL,
    pages int NOT NULL,
    author varchar(255) NOT NULL
);

-- insert into book(title,pages,author) values ('Spring Boot: Up and Running',328,'Mark Heckler');