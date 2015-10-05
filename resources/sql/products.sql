-- name: list-products
-- retrieve all products from the database
SELECT * FROM products;

-- name: create-product!
-- creates a new product record
INSERT INTO products
("code", "name", "group", "price", "unit", "unit_qty")
VALUES (:code, :name, :group, :price, :unit, :unit_qty)
