create database staff;
use staff;
create table employee(id int primary key, name varchar(32), salary float);
create table payable(id int primary key, monthly_salary decimal (8,2));
create table consultant(id int primary key, name varchar(32), daily_rate decimal (8,2), days_worked int);
create table sales_employee(id int primary key, comission_rate decimal (2,2), sales_total decimal (9,2));



