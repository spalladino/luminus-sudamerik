CREATE TABLE products
("id" SERIAL PRIMARY KEY,
 "code" VARCHAR(20) NOT NULL UNIQUE,
 "name" VARCHAR(100),
 "group" VARCHAR(100),
 "price" DECIMAL,
 "unit" VARCHAR(20),
 "unit_qty" DECIMAL);
