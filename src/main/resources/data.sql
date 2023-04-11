INSERT INTO manage_customer.type (id, name)
VALUES
    (101, 'Administrador'),
    (102, 'Usuario regular'),
    (103, 'Invitado'),
    (104, 'Soporte técnico'),
    (105, 'Desarrollador');

INSERT INTO manage_customer.customer (id, first_name, last_name, identification, user_type)
VALUES
    (101, 'John', 'Doe', '123456789', 101),
    (102, 'Jane', 'Doe', '987654321', 102),
    (103, 'Bob', 'Smith', '555111444', 102),
    (104, 'Alice', 'Johnson', '999888777', 103),
    (105, 'Charlie', 'Brown', '111222333', 102),
    (106, 'David', 'Lee', '333444555', 102),
    (107, 'Emily', 'Nguyen', '777666555', 101),
    (108, 'Frank', 'Zhang', '222333444', 102),
    (109, 'Grace', 'Kim', '444555666', 104),
    (110, 'Henry', 'Wong', '888777666', 105);

