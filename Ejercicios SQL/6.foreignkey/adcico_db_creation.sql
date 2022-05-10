create schema if not exists adcico_db;
use adcico_db;

drop table if exists `address`;
drop table if exists `city`;
drop table if exists `country`;

CREATE TABLE `country` (
    country_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
    country VARCHAR(50),
    last_update TIMESTAMP,
    PRIMARY KEY (country_id)
) ENGINE=InnoDB;

CREATE TABLE `city` (
    city_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
    city VARCHAR(50),
    country_id SMALLINT UNSIGNED,
    last_update TIMESTAMP,
    PRIMARY KEY (city_id),
    CONSTRAINT fk_country FOREIGN KEY (country_id)
        REFERENCES country (country_id)
        ON UPDATE CASCADE ON DELETE CASCADE
)  ENGINE=INNODB;

CREATE TABLE `address` (
    address_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
    address VARCHAR(50),
    address2 VARCHAR(50),
    district VARCHAR(20),
    city_id SMALLINT UNSIGNED,
    postal_code VARCHAR(10),
    phone VARCHAR(20),
    location VARCHAR(20),
    last_update TIMESTAMP,
    PRIMARY KEY (address_id),
    CONSTRAINT fk_city FOREIGN KEY (city_id)
        REFERENCES city (city_id)
        ON UPDATE CASCADE ON DELETE CASCADE
)  ENGINE=INNODB;