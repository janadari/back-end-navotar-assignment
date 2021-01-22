# back-end-navotar-assignment

<h3>DB QUERIES:</h3>

CREATE TABLE `navotardb`.`userdetail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `address2` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  `zipcode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

<h3>STORE PROCEDURE :</h3>

USE `navotardb`;
DROP procedure IF EXISTS `USER_DETAIL`;

DELIMITER $$
USE `navotardb`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `USER_DETAIL` (
IN _UserID INT,
IN _Name varchar(45),
IN _Email varchar(45),
IN _Country varchar(45),
IN _State varchar(45),
IN _City varchar(45),
IN _Zipcode varchar(45),
IN _Address varchar(45),
IN _Address2 varchar(45),
IN _Phone varchar(45),
IN _Password varchar(45)
)
BEGIN
IF _UserID = 0 THEN 
     INSERT INTO userdetail(name,email,country,state,city,zipcode,address,address2,phone,password)
     VALUES(_Name,_Email,_Country,_State,_City,_Zipcode,_Address,_Address2,_Phone,_Password);
     
     SET _UserID = last_insert_id();
else
	update userdetail
    SET 
    name = _Name,
    email = _Email,
    country = _Country,
    state = _State,
    city = _City,
    zipcode = _ZipCode,
    address = _Address,
    address2 = _Address2,
    phone = _Phone,
    password = _Password
    WHERE id = _UserID;
    END IF;
    SELECT _UserID AS 'id';
END$$

DELIMITER ;

<h3>POSTMAN APIs : </h3>

<h4>for register </h4>
curl --location --request POST 'http://127.0.0.1:9191/adduser/' \
--header 'Content-Type: application/json' \
--data-raw '{"name":"shehani",
"country":"sri-lanka",
"state":"b",
"address":"abc",
"address2":"dbdd",
"city":"vcsdsfv",
"zipcode":"ccsdfasdfvc",
"phone":"0717704404",
"password":"789456",
"password2":"789456",
"email":"abc@gmail.com"}'

<h5>for login </h5>
curl --location --request GET 'http://127.0.0.1:9191/getuserbyname/shehani' \
--data-raw ''

![image](https://user-images.githubusercontent.com/31371187/105444541-07c1f900-5c94-11eb-8ffd-e9225249075d.png)
![image](https://user-images.githubusercontent.com/31371187/105445509-23c69a00-5c96-11eb-9226-83af4bd74d9b.png)

