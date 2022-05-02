create schema if not exists adcico_db;
use adcico_db;

drop table if exists `country`;
create table `country`(
country_id smallint unsigned not null auto_increment,
country varchar(50),
last_update timestamp,
primary key (country_id)
);

drop table if exists `city`;
create table `city`(
city_id smallint unsigned not null auto_increment,
city varchar(50),
country_id smallint unsigned not null,
last_update timestamp,
primary key (city_id),
foreign key (country_id) references country(country_id)
);

drop table if exists `address`;
create table `address` (
address_id smallint unsigned not null auto_increment,
address varchar(50),
address2 varchar(50),
district varchar(20),
city_id smallint unsigned not null,
postal_code varchar(10),
phone varchar(20),
location geometry,
last_update timestamp,
primary key(address_id),
foreign key (city_id) references city(city_id)
);