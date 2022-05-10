create schema if not exists salesman_db;
use salesman_db;

drop table if exists orders;
drop table if exists customer;
drop table if exists salesman;


CREATE TABLE salesman (
    salesman_id INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(30),
    city VARCHAR(15),
    commission DECIMAL(5 , 2 ),
    PRIMARY KEY (salesman_id)
)  ENGINE=INNODB;

CREATE TABLE customer (
    customer_id INT NOT NULL AUTO_INCREMENT,
    cust_name VARCHAR(30),
    city VARCHAR(15),
    grade NUMERIC(3),
    salesman_id INT,
    PRIMARY KEY (customer_id)
)  ENGINE=INNODB;

CREATE TABLE orders (
    ord_no INT NOT NULL AUTO_INCREMENT,
    purch_amt DECIMAL(8 , 2 ),
    ord_date DATE,
    customer_id int,
    salesman_id INT,
    PRIMARY KEY (ord_no),
    CONSTRAINT fk_salesman FOREIGN KEY (salesman_id)
        REFERENCES salesman (salesman_id)
        ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT fk_customer FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
        ON DELETE NO ACTION ON UPDATE NO ACTION
)  ENGINE=INNODB;

insert into salesman(`name`, city, commission) values
	('Juan', 'Barcelona', 1.5),
	('Carlos', 'Madrid', 1.0),
	('Maria', 'Girona', 2.5),
	('Claudia', 'Lleida', 2.0),
	('Mel', 'Berga', 3.5);

insert into customer(cust_name, city, grade) values
	('Pep','Berga', 2),
    ('Quima', 'Berga', 1),
    ('Joana', 'Barcelona', 12),
    ('Mirna', 'Barcelona', 10),
    ('Joana', 'Barcelona', 8),
    ('Chung Man', 'Girona', 15),
    ('Pep','Madrid', 26),
    ('Maria','Lleida', 18);

insert into orders(purch_amt, ord_date, customer_id, salesman_id) values
	(265.5, '2021-12-05', 1, 5),
    (569.75, '2020-09-30',2, 5),
    (1525.5, '2022-04-20',3, 1),
    (100.0, '2019-10-29', 4, 1),
    (1004.0, '2020-10-29', 5, 3),
    (5000.4, '2022-04-20', 6, 2),
    (1001.0, '2019-08-29', 7, 4),
    (2045.0, '2019-01-29', 8, 5),
    (1524.0, '2022-03-29', 5, 3),
    (3526.0, '2020-10-29', 1, 5);