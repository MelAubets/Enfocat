drop database if exists discography_db;
create database if not exists discography_db;
use discography_db;
create table if not exists mapa(
idMapa integer unsigned primary key auto_increment,
fecha date,
gran_text longtext,
algo int,
decimal_nombre float
);
describe discography_db.mapa;