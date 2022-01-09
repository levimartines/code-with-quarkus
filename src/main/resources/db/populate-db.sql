INSERT INTO category (name) values ('Electronics');
INSERT INTO category (name) values ('Office');

INSERT into product (name, price) values ('Computer', 2000.0);
INSERT into product (name, price) values ('Printer', 800.90);
INSERT into product (name, price) values ('Mouse', 75.50);

INSERT into product_category (product_id, category_id) VALUES (1, 1);
INSERT into product_category (product_id, category_id) VALUES (2, 1);
INSERT into product_category (product_id, category_id) VALUES (3, 2);
