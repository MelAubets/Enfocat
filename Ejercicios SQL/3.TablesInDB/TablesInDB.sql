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

insert into music_db.album(idAlbum, albumName, dateReleased) values
(null,'Toxic', '1994-10-05'),
(null,'Are you dead yet?', '2006-12-25'),
(null,'Master of puppets', '1999-03-20'),
(null,'El mal querer','2019-05-30');

select * from music_db.album;

insert into music_db.artist(artistId, astistName) values
(null, 'Britney'),
(null, 'Children of Boddom'),
(null, 'Metallica'),
(null, 'Rosalía');

select * from music_db.artist;

insert into music_db.genre(idGenre, genre) values
(null, 'Pop'),
(null, 'Metal'),
(null, 'Metal'),
(null, 'Trap');

select * from music_db.genre;