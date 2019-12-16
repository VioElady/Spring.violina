
CREATE TABLE MUSIC(
music_id VARCHAR(12)NOT NULL PRIMARY KEY ,
name_track VARCHAR (34)NOT NULL ,
time_track FLOAT NOT NULL,
kind_music VARCHAR (11)
);
INSERT INTO MUSIC(music_id, name_track, time_track, kind_music)
VALUES ('4dgt','My love',3.06,'drame');

INSERT INTO MUSIC(music_id, name_track, time_track, kind_music)
VALUES ('4d56gt','Je te aime',2.55,'hip hop');

INSERT INTO MUSIC(music_id, name_track, time_track, kind_music)
VALUES ('456gt','My live is beautiful',2.06,'jazz');

INSERT INTO MUSIC(music_id, name_track, time_track, kind_music)
VALUES ('4d77t','My boy',1.06,'pop');

INSERT INTO MUSIC(music_id, name_track, time_track, kind_music)
VALUES ('4dlt','At the same rate',4.06,'dance');

SELECT *FROM MUSIC;

CREATE TABLE ALBUM(
    album_id VARCHAR(9)NOT NULL PRIMARY KEY ,
    album_name VARCHAR(25)NOT NULL,
    number_track INTEGER,
    rating_album FLOAT
);

INSERT INTO ALBUM(album_id, album_name, number_track, rating_album)
VALUES ('gfr34','Yellow Wood',123,8.9);

INSERT INTO ALBUM(album_id, album_name, number_track, rating_album)
VALUES ('bg45','Metallica',56,9.1);

INSERT INTO ALBUM(album_id, album_name, number_track, rating_album)
VALUES ('hg634','The Most Beautiful',133,9.4);

INSERT INTO ALBUM(album_id, album_name, number_track, rating_album)
VALUES ('gng56','Skool Luv Affair',99,9.9);

INSERT INTO ALBUM(album_id, album_name, number_track, rating_album)
VALUES ('gkh4','I Am Who',67,8.8);

SELECT *FROM ALBUM;

CREATE  TABLE ARTIST_MUSIC
(
    artist_id             VARCHAR(10) NOT NULL PRIMARY KEY,
    artist_lname          VARCHAR(7)  NOT NULL,
    artist_fname          VARCHAR(8)  NOT NULL,
    the_language_of_music VARCHAR(13),
    number_albums        INTEGER
);

INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)
VALUES ('gf4H3','Lady','Gaga','english',5);

INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)
VALUES ('HfH3','Miley','Cyrus','english',9);

INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)
VALUES ('vcsH3','Robbie','Williams','frances',4);

INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)
VALUES ('kj678','Celine','Dion','english',11);

INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)
VALUES ('zaccu','Bob','Dylan','english',9);

SELECT *FROM ARTIST_MUSIC;
