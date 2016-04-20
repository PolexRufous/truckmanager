--SHOW databases;

--CREATE database truckmanager;

USE truckmanager;
--
--CREATE table managers (
--id int UNIQUE NOT NULL AUTO_INCREMENT,
--firstname varchar(16) NOT NULL,
--lastname varchar(16) NOT NULL,
--login varchar(16) NOT NULL UNIQUE,
--passwordhash varchar(256),
--passwordsalt varchar(32),
--description varchar(256),
--PRIMARY KEY(id));

CREATE table trucks(
id int UNIQUE NOT NULL AUTO_INCREMENT,
model varchar (16),
regnumber varchar(16),
description varchar(256),
PRIMARY KEY(id));

CREATE table drivers(
id int UNIQUE NOT NULL AUTO_INCREMENT,
truck_id int,
firstname varchar(16) NOT NULL,
lastname varchar(16) NOT NULL,
driverlicense varchar(16) NOT NULL,
resolutions varchar(64),
description varchar(256),
FOREIGN KEY (truck_id) REFERENCES trucks(id), 
PRIMARY KEY(id));

