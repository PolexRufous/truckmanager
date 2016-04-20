
INSERT INTO users(firstname, lastname, login, password) VALUES ("Alexander", "Kuschev", "polex", "pock81085");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Dmitryy", "Kuschev", "exbergamot", "exbergamot");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Karen", "Asmarian", "funtod", "funtod");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Elena", "Kuscheva", "lela", "lela");

INSERT INTO trucks(model, regnumber, description) VALUES ("DAF CoolTruck 2D", "GE111DD", "Green truck. 20 тонн 200 кубов. Шашлык в подарок");
INSERT INTO trucks(model, regnumber, description) VALUES ("Скания 1а", "АХ1211ГР", "Едет со скидкой 20 тонн натрамбует 500 кубов за шашлык");
INSERT INTO trucks(model, regnumber, description) VALUES ("ЗИЛ130 Pro", "ГРУ00000ЗИН", "Просто песня. 0 тонн 0 кубов. Зато быстро");

INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (1, "Гоги", "Обыкновенный", "КЛАС1121", "ТИР34 по январь 2016", "Юля его не любит");
INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (3, "Джура", "Прочный", "КОКИ1121", "ТИР34 по январь 2038", "Юля его не любит");
INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (2, "Джордж", "Буш", "ЮСА1121", "Везде навсегда", "Юля его не любит");

INSERT INTO contragentstype(contragenttype) VALUES ("Transporter");
INSERT INTO contragentstype(contragenttype) VALUES ("Broker");
INSERT INTO contragentstype(contragenttype) VALUES ("Konkurent");
INSERT INTO contragentstype(contragenttype) VALUES ("Customer");

INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SOMEGRUZIANFARM", "SGF", 4, "Мудаки, возят только говно. Платят плохо");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("CLOSED JOIN STOCK COMPANY UKRAINGOODS", "UGOOD", 4, "Молодцы, возят только говно. Платят плохо");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("ТУРКИШ БЭСТ ОДЕЖДА", "ТБО", 4, "Нормальные, возят только говно. Платят плохо");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SOMETRANS", "OJSC ST", 1, "Мудаки. Долго, дорого");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SHIPPING ANYWHERE", "SHIANY", 1, "Молодцы. Быстро, дорого");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("Общество с ограниченной ответственностью Украинский перевоз", "ООО Упер", 1, "Молодцы. Быстро, не дорого, качественно");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY UNIBROKER", "UNIBRO", 2, "Другого не нашли пока");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("LUCHSHE BY NE BYLO LIMITED", "BYDLO LTD", 3, "Куда же без них");

INSERT INTO ordersstatus(status) VALUES ("CREATED");
INSERT INTO ordersstatus(status) VALUES ("LOADED");
INSERT INTO ordersstatus(status) VALUES ("UNLOADED");
INSERT INTO ordersstatus(status) VALUES ("PAYED");

INSERT INTO orders(manager_id, truck_id, driver_id, customer_id, placefrom, placeto, cargo, comission, loaddate, unloaddate, status_id)
VALUES (1, 1, 1, 1, "Some place in Georgia", "Some place in Turkie", "Говнишечко. Много", 100, "2016-04-20", "2016-05-31", 2);
INSERT INTO orders(manager_id, truck_id, driver_id, customer_id, placefrom, placeto, cargo, comission, loaddate, unloaddate)
VALUES (1, 3, 2, 2, "Some place in Somewhere", "Some place in Nowhere", "Говнишечко. Чуть-чуть", 1, "2016-04-12", "2016-05-27", 2);