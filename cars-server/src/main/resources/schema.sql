--DROP TABLE IF EXISTS manufacturer;
CREATE TABLE manufacturer (
	id INT AUTO INCREMENT PRIMARY KEY,
	name VARCHAR(32) DEFAULT NOT NULL,
);

--DROP TABLE IF EXISTS model;
CREATE TABLE model (
	id LONG AUTO INCREMENT PRIMARY KEY,
	manufacturer_id INT DEFAULT NOT NULL,
	name VARCHAR(32) DEFAULT NULL,
	cylinders INT DEFAULT NULL,
	fuel_type ENUM('gas', 'diesel', 'hybrid', 'electric') DEFAULT NULL,
	transmission_type_id INT DEFAULT NOT NULL,
	FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(id),
	FOREIGN KEY (tranmission_id) REFERENCES transmission(id)
);

--DROP TABLE IF EXISTS transmission_type;
CREATE TABLE tranmission_type (
	id INT AUTO INCREMENT PRIMARY KEY,
	type ENUM('automatic', 'manual', 'cvt'),
	gears INT DEFAULT NULL
);

--DROP TABLE IF EXISTS color;
CREATE TABLE color (
	id INT AUTO INCREMENT PRIMARY KEY,
	name VARCHAR(32) DEFAULT NOT NULL
);