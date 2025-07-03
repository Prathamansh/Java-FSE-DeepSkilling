-- MySQL Script to create schema and table for orm-learn

CREATE DATABASE IF NOT EXISTS ormlearn;

USE ormlearn;

CREATE TABLE IF NOT EXISTS country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO country (code, name) VALUES 
    ('IN', 'India'),
    ('US', 'United States of America');
