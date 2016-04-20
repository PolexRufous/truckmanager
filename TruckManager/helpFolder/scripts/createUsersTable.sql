
INSERT INTO users(firstname, lastname, login, password) VALUES ("Alexander", "Kuschev", "polex", "pock81085");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Dmitryy", "Kuschev", "exbergamot", "exbergamot");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Karen", "Asmarian", "funtod", "funtod");
INSERT INTO users(firstname, lastname, login, password) VALUES ("Elena", "Kuscheva", "lela", "lela");

INSERT INTO trucks(model, regnumber, description) VALUES ("DAF CoolTruck 2D", "GE111DD", "Green truck. 20 ���� 200 �����. ������ � �������");
INSERT INTO trucks(model, regnumber, description) VALUES ("������ 1�", "��1211��", "���� �� ������� 20 ���� ���������� 500 ����� �� ������");
INSERT INTO trucks(model, regnumber, description) VALUES ("���130 Pro", "���00000���", "������ �����. 0 ���� 0 �����. ���� ������");

INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (1, "����", "������������", "����1121", "���34 �� ������ 2016", "��� ��� �� �����");
INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (3, "�����", "�������", "����1121", "���34 �� ������ 2038", "��� ��� �� �����");
INSERT INTO drivers(truck_id, firstname, lastname, driverlicense, resolutions, description) VALUES (2, "������", "���", "���1121", "����� ��������", "��� ��� �� �����");

INSERT INTO contragentstype(contragenttype) VALUES ("Transporter");
INSERT INTO contragentstype(contragenttype) VALUES ("Broker");
INSERT INTO contragentstype(contragenttype) VALUES ("Konkurent");
INSERT INTO contragentstype(contragenttype) VALUES ("Customer");

INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SOMEGRUZIANFARM", "SGF", 4, "������, ����� ������ �����. ������ �����");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("CLOSED JOIN STOCK COMPANY UKRAINGOODS", "UGOOD", 4, "�������, ����� ������ �����. ������ �����");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("������ ���� ������", "���", 4, "����������, ����� ������ �����. ������ �����");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SOMETRANS", "OJSC ST", 1, "������. �����, ������");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY SHIPPING ANYWHERE", "SHIANY", 1, "�������. ������, ������");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("�������� � ������������ ���������������� ���������� �������", "��� ����", 1, "�������. ������, �� ������, �����������");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("OPEN JOIN STOCK COMPANY UNIBROKER", "UNIBRO", 2, "������� �� ����� ����");
INSERT INTO contragents(fullname, shortname, contragenttype_id, description) VALUES ("LUCHSHE BY NE BYLO LIMITED", "BYDLO LTD", 3, "���� �� ��� ���");

INSERT INTO ordersstatus(status) VALUES ("CREATED");
INSERT INTO ordersstatus(status) VALUES ("LOADED");
INSERT INTO ordersstatus(status) VALUES ("UNLOADED");
INSERT INTO ordersstatus(status) VALUES ("PAYED");

INSERT INTO orders(manager_id, truck_id, driver_id, customer_id, placefrom, placeto, cargo, comission, loaddate, unloaddate, status_id)
VALUES (1, 1, 1, 1, "Some place in Georgia", "Some place in Turkie", "����������. �����", 100, "2016-04-20", "2016-05-31", 2);
INSERT INTO orders(manager_id, truck_id, driver_id, customer_id, placefrom, placeto, cargo, comission, loaddate, unloaddate)
VALUES (1, 3, 2, 2, "Some place in Somewhere", "Some place in Nowhere", "����������. ����-����", 1, "2016-04-12", "2016-05-27", 2);