CREATE DATABASE newsportal_db;

\c newsportal_db;
CREATE TABLE users (id serial PRIMARY KEY, name VARCHAR, position VARCHAR, role VARCHAR, departmentId INTEGER);
CREATE TABLE departments (id serial PRIMARY KEY, name VARCHAR, description VARCHAR, numOfEmployee INTEGER);
CREATE TABLE news (id serial PRIMARY KEY, title VARCHAR, content VARCHAR, userId INTEGER, departmentId INTEGER);
CREATE DATABASE newsportal_db_test WITH TEMPLATE newsportal_db;