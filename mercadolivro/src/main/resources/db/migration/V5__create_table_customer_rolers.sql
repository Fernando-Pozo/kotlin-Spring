CREATE TABLE IF NOT EXISTS customer_roles (
    customer_id int NOT NULL,
    role VARCHAR(50) not null,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
