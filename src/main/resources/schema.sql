-- Create the database if it doesn't exist
CREATE DATABASE IF NOT EXISTS studentdb;

-- Use the database
USE studentdb;

-- Create the student table if it doesn't exist
-- This is optional as Hibernate will create it with spring.jpa.hibernate.ddl-auto=update
-- But it's good to have it here for reference
CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    date_naissance DATE
);