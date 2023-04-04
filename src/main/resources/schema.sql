create schema manage_customer;


CREATE TABLE manage_customer.type
(
    id   INT NOT NULL PRIMARY KEY,
    name VARCHAR(50)
);
CREATE TABLE manage_customer.customer
(
    id             INT NOT NULL PRIMARY KEY,
    first_name     VARCHAR(50),
    last_name      VARCHAR(50),
    identification VARCHAR(20),
    user_type      INT NOT NULL,
    FOREIGN KEY (user_type) REFERENCES manage_customer.type (id)
);



