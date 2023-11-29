show databases;

CREATE DATABASE cloud_vendor;

use cloud_vendor;

show tables;

DROP TABLE cloud_vendor_info;

CREATE TABLE cloud_vendor_info (
    vendor_id varchar(255),
    vendor_address varchar(255),
    vendor_name varchar(255),
    vendor_phone_number varchar(255)
);

select * FROM cloud_vendor_info;