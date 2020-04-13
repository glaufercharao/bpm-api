CREATE TABLE user (
     user_code BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
     user_name VARCHAR(60) NOT NULL,
     user_password VARCHAR(30) NOT NULL,
     user_permission BOOLEAN NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE product (
    prod_code BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    prod_name VARCHAR(60) NOT NULL,
    prod_description VARCHAR(2000) NOT NULL,
    prod_quantity INTEGER NOT NULL,
    prod_price DECIMAL(10,2) NOT NULL,
    prod_status  VARCHAR(9)  NOT NULL DEFAULT '2',
    prod_reason VARCHAR(1000)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO user (user_name,user_password, user_permission) VALUES ('admin','@dmin',1);
INSERT INTO product (prod_name,prod_description, prod_quantity, prod_price) VALUES ('Samuel Charão','Pilhas AAA',10,10.99);
