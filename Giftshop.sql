--PRODUCTS TABLE--
CREATE TABLE gproducts(product_id NUMBER PRIMARY KEY NOT NULL,
product_name VARCHAR2(32) NOT NULL,
description VARCHAR2 (40)NOT NULL,
Standard_cost NUMBER,
category VARCHAR2 (32)NOT NULL);

--ADMIN TABLE--
CREATE TABLE gadmin (
user_name VARCHAR2(20)primary key NOT NULL,
password VARCHAR2(30) NOT NULL);
--username
create table username(username varchar2(30) primary key not null,password varchar2(30) not null);
--CUSTOMERS TABLE--
CREATE TABLE gcustomers (customer_id NUMBER PRIMARY KEY,
user_name VARCHAR2(32)NOT NULL,
password VARCHAR2(32)NOT NULL,
address VARCHAR2(50)NOT NULL,
mobile_number NUMBER NOT NULL, foreign key (user_name) references username(username));

--ORDERS TABLE--
CREATE TABLE gorders (orders_id NUMBER PRIMARY KEY,
customer_id NUMBER,
status VARCHAR2(20)NOT NULL,
order_date DATE NOT NULL,
payment_mode VARCHAR2(20) , foreign key(customer_id) references gcustomers(customer_id));

--ORDER ITEMS TABLE--
CREATE TABLE gorder_itmes(order_id not null,
product_id NUMBER  not null,
quantity NUMBER NOT NULL,
price NUMBER NOT NULL,
payment_status VARCHAR2(20),constraint fk_prodid foreign key(product_id) references gproducts(product_id) ,constraint fk_orddid foreign key (order_id)references gorders(orders_id));