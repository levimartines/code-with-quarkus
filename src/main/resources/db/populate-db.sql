INSERT INTO category (name) values ('Electronics');
INSERT INTO category (name) values ('Office');

INSERT into product (name, price) values ('Computer', 2000.0);
INSERT into product (name, price) values ('Printer', 800.90);
INSERT into product (name, price) values ('Mouse', 75.50);

INSERT into product_category (product_id, category_id) VALUES (1, 1);
INSERT into product_category (product_id, category_id) VALUES (2, 1);
INSERT into product_category (product_id, category_id) VALUES (3, 2);

INSERT INTO state (name) values ('Minas Gerais');
INSERT INTO state (name) values ('Sao Paulo');

INSERT INTO city (name, state_id) VALUES ('Uberlandia', 1);
INSERT INTO city (name, state_id) VALUES ('Sao Paulo', 2);
INSERT INTO city (name, state_id) VALUES ('Campinas', 2);

INSERT INTO client_type (id, description) VALUES (1, 'Physical Person');
INSERT INTO client_type (id, description) VALUES (2, 'Juridical Person');

INSERT INTO client (name, cpf_or_cnpj, client_type_id) VALUES ('Maria Silva', '19927087039', 1);

INSERT INTO address (street, number, complement, district, postal_code, client_id, city_id)
VALUES ('Rua Flores', '300', 'Apt 303', 'Vila Jardim', '38220854', 1, 1);
INSERT INTO address (street, number, complement, district, postal_code, client_id, city_id)
VALUES ('Av. Matos', '105', 'Room 3', 'Centro', '18777012', 1, 2);

INSERT INTO phone (client_id, phone) VALUES (1, '3331125');
INSERT INTO phone (client_id, phone) VALUES (1, '5555555');

