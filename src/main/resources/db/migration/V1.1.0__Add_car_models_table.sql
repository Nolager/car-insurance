CREATE TABLE car_models(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(100),
car_brand_id int NOT NULL,
FOREIGN KEY(car_brand_id) REFERENCES car_brands(id)
);