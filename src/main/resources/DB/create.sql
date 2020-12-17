CREATE DATABASE news_portals;

\c news_portals;
CREATE TABLE staff (id SERIAL PRIMARY KEY, name VARCHAR, position VARCHAR, staff_role VARCHAR);
CREATE TABLE users_departments (id serial PRIMARY KEY, userId INT, departmentId INT);
CREATE TABLE departments (id serial PRIMARY KEY, name VARCHAR, description VARCHAR, numOfEmployee INTEGER, size INTEGER);
CREATE TABLE news (id serial PRIMARY KEY,news_type VARCHAR, title VARCHAR, content VARCHAR, userId INTEGER, departmentId INTEGER);
CREATE DATABASE news_portals_test WITH TEMPLATE news_portals;