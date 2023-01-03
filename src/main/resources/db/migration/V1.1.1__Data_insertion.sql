INSERT INTO car_brands(name) VALUES('Mercedes Benz');
INSERT INTO car_models(name, car_brand_id) VALUES('C-Class Cabriolet', (SELECT id from car_brands where name = 'Mercedes Benz'));
INSERT INTO car_models(name, car_brand_id) VALUES('AMG GT', (SELECT id from car_brands where name = 'Mercedes Benz'));