DROP DATABASE IF EXISTS currency_app;
CREATE DATABASE currency_app;
USE currency_app;


CREATE TABLE currency (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    abbreviation VARCHAR(10) NOT NULL,
    name VARCHAR(50) NOT NULL,
    conversion_rate DECIMAL(10, 2) NOT NULL
);


INSERT INTO currency (abbreviation, name, conversion_rate) VALUES
    ('USD', 'US Dollar', 1.0),
    ('EUR', 'Euro', 0.85),
    ('GBP', 'British Pound', 0.73),
    ('JPY', 'Japanese Yen', 113.46),
    ('AUD', 'Australian Dollar', 1.36),
    ('CAD', 'Canadian Dollar', 1.26),
    ('INR', 'Indian Rupee', 75.04),
    ('CNY', 'Chinese Yuan', 6.38);


DROP USER IF EXISTS 'appuser'@'localhost';


CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';


GRANT SELECT, INSERT, UPDATE, DELETE ON currency_app.* TO 'appuser'@'localhost';
GRANT CREATE, DROP ON currency_app.* TO 'appuser'@'localhost';
