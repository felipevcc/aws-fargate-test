-- Create database
CREATE DATABASE IF NOT EXISTS USER_SYSTEM;
USE USER_SYSTEM;

-- Table: "USER"
CREATE TABLE IF NOT EXISTS `USER` (
  `user_id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `username` VARCHAR(20) NOT NULL UNIQUE,
  `password` VARCHAR(45) NOT NULL,
  `phone_number` VARCHAR(20) NOT NULL,
  `email` VARCHAR(100) NOT NULL UNIQUE
);