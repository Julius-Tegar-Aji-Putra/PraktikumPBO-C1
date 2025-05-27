USE pbo;

CREATE TABLE mahasiswa(
	id INT(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(20)
);

SELECT * FROM mahasiswa;

INSERT INTO mahasiswa (nama) VALUES ('Nina');
INSERT INTO mahasiswa (nama) VALUES ('Rudi');
INSERT INTO mahasiswa (nama) VALUES ('Beni');

TRUNCATE TABLE mahasiswa;

