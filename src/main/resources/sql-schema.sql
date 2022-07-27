   drop schema ims;

   CREATE SCHEMA IF NOT EXISTS `ims`;

   USE `ims` ;

   CREATE TABLE IF NOT EXISTS `ims`.`customers` (
       `id` INT(11) NOT NULL AUTO_INCREMENT,
       `first_name` VARCHAR(40) DEFAULT NULL,
       `surname` VARCHAR(40) DEFAULT NULL,
       `address` VARCHAR(50) DEFAULT NULL,
       PRIMARY KEY (`id`)
  );
  
    CREATE TABLE IF NOT EXISTS `ims`.`items` (
       `item_id` INT(11) NOT NULL AUTO_INCREMENT,
       `item_name` VARCHAR(40) NOT NULL,
       `item_cost` DOUBLE(10, 2) NOT NULL,
       PRIMARY KEY (`item_id`)
  );
  
   CREATE TABLE IF NOT EXISTS `ims`.`orders` (
       `order_id` INT(11) NOT NULL AUTO_INCREMENT,
	   `customer_id` INT(11) NOT NULL,
	   `order_total` DOUBLE(10, 2) DEFAULT NULL,
       PRIMARY KEY (`order_id`)
  ); 
  
  
  