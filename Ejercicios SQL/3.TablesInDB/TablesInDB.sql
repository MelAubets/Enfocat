drop database if exists music_db;
create database if not exists music_db;
use music_db;
create table if not exists Genre(
idGenre int unsigned primary key auto_increment,
genre varchar(255)
);
create table if not exists Album(
idAlbum int unsigned primary key auto_increment,
albumName varchar(255),
dateReleased datetime
);
create table if not exists Artist(
artistId int unsigned primary key auto_increment,
astistName varchar(255)
);