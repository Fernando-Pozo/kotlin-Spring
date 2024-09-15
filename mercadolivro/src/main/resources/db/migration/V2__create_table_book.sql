CREATE TABLE IF NOT EXISTS book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price decimal(10,2) NOT NULL,
    status varchar(255) NOT NULL,
    customer_id int not null,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
