--SHOW databases;
--
--CREATE database truckmanager;
--
--USE truckmanager;

CREATE table users (
id int UNIQUE NOT NULL AUTO_INCREMENT,
firstname varchar(16) NOT NULL,
lastname varchar(16) NOT NULL,
login varchar(16) NOT NULL UNIQUE,
password varchar(16) NOT NULL,
passwordhash varchar(256),
passwordsalt varchar(32),
description varchar(256),
PRIMARY KEY(id));

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
FOREIGN KEY (truck_id) REFERENCES trucks(id) ON UPDATE CASCADE ON DELETE SET NULL, 
PRIMARY KEY(id));

CREATE table contragentstype (
id int UNIQUE NOT NULL AUTO_INCREMENT,
contragenttype varchar(32) UNIQUE NOT NULL,
PRIMARY KEY(id));

CREATE table contragents (
id int UNIQUE NOT NULL AUTO_INCREMENT,
fullname varchar(64),
shortname varchar(32),
contragenttype_id int,
description varchar(256),
FOREIGN KEY(contragenttype_id) REFERENCES contragentstype(id),
PRIMARY KEY(id));

CREATE table ordersstatus(
id int UNIQUE NOT NULL AUTO_INCREMENT,
status varchar(32) UNIQUE NOT NULL,
PRIMARY KEY(id));

CREATE table orders(
id int UNIQUE NOT NULL AUTO_INCREMENT,
manager_id int NOT NULL,
truck_id int,
driver_id int,
customer_id int,
placefrom varchar(64),
placeto varchar(64),
cargo varchar(128),
comission int,
loaddate date,
unloaddate date,
status_id int,
createdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
lastchange TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
FOREIGN KEY(manager_id) REFERENCES users(id),
FOREIGN KEY(status_id) REFERENCES ordersstatus(id),
FOREIGN KEY(truck_id) REFERENCES trucks(id),
FOREIGN KEY(driver_id) REFERENCES drivers(id),
FOREIGN KEY(customer_id) REFERENCES contragents(id),
PRIMARY KEY(id));

CREATE table orderscomments (
id int UNIQUE NOT NULL AUTO_INCREMENT,
comment varchar(256),
order_id int,
FOREIGN KEY(order_id) REFERENCES orders(id),
PRIMARY KEY(id));
