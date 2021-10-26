CREATE DATABASE  IF NOT EXISTS `bank` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bank`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account` (
  `idaccount` int(11) NOT NULL AUTO_INCREMENT,
  `code_account` varchar(45) DEFAULT NULL,
  `email_account` varchar(45) DEFAULT NULL,
  `login_account` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idaccount`),
  UNIQUE KEY `idaccount_UNIQUE` (`idaccount`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (10,'user_943','anna@gmail.com','anna'),(11,'user_285','david@gmail.com','david'),(12,'user_864','roman@gmail.com','roma'),(13,'user_601','andrey@gmail.com','andrey');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_operation`
--

DROP TABLE IF EXISTS `account_operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account_operation` (
  `idaccount_operation` int(11) NOT NULL AUTO_INCREMENT,
  `date_operation` varchar(45) DEFAULT NULL,
  `message` varchar(45) DEFAULT NULL,
  `account_idaccount` int(11) NOT NULL,
  PRIMARY KEY (`idaccount_operation`),
  UNIQUE KEY `idaccount_operation_UNIQUE` (`idaccount_operation`),
  KEY `fk_account_operation_account1_idx` (`account_idaccount`),
  CONSTRAINT `fk_account_operation_account1` FOREIGN KEY (`account_idaccount`) REFERENCES `account` (`idaccount`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_operation`
--

LOCK TABLES `account_operation` WRITE;
/*!40000 ALTER TABLE `account_operation` DISABLE KEYS */;
INSERT INTO `account_operation` VALUES (3,'11-05-2020 10:19:53:82','Registration new account.',10),(4,'11-05-2020 10:19:53:226','Open current account.',10),(5,'11-05-2020 10:20:43:981','Registration new account.',11),(6,'11-05-2020 10:20:44:137','Open current account.',11),(7,'22-05-2020 22:41:20:64','Registration new account.',12),(8,'22-05-2020 22:41:20:438','Open current account.',12),(9,'27-05-2020 15:05:25:61','Registration new account.',13),(10,'27-05-2020 15:05:25:273','Open current account.',13),(12,'27-05-2020 20:20:09:642','Open current account.',12),(13,'27-05-2020 20:28:53:283','Open current account.',10),(14,'28-05-2020 22:00:18:359','Current account is closed.',10),(15,'28-05-2020 22:00:38:690','Open current account.',10),(16,'28-05-2020 22:00:50:112','Open current account.',10),(17,'28-05-2020 22:52:11:437','Current account is closed.',10),(18,'28-05-2020 23:04:42:626','Current account is closed.',10),(19,'30-05-2020 19:53:34:383','Open current account.',10),(20,'30-05-2020 19:53:56:02','Current account is closed.',10),(21,'19-06-2020 19:56:37:405','Open current account.',10),(22,'19-06-2020 19:56:50:601','Current account is closed.',10),(23,'19-06-2020 19:56:58:960','Current account is closed.',10),(24,'19-06-2020 20:00:06:982','Current account is closed.',10),(25,'19-06-2020 20:00:15:761','Open current account.',10),(26,'19-06-2020 20:00:26:813','Current account is closed.',10),(27,'19-06-2020 20:00:33:33','Current account is closed.',10),(28,'19-06-2020 20:02:58:372','Current account is closed.',10),(29,'19-06-2020 20:03:09:424','Open current account.',10),(30,'19-06-2020 20:03:17:966','Current account is closed.',10),(31,'19-06-2020 20:03:22:742','Current account is closed.',10),(32,'19-06-2020 20:05:13:625','Open current account.',10),(33,'19-06-2020 20:05:27:534','Open current account.',10),(34,'19-06-2020 20:05:36:219','Current account is closed.',10),(35,'19-06-2020 21:25:04:565','Deposit account is closed.',10),(36,'19-06-2020 21:25:08:455','Deposit account is closed.',10),(37,'19-06-2020 21:32:14:549','Deposit account is closed.',10),(38,'19-06-2020 21:52:41:803','Open deposit account.',10),(39,'19-06-2020 22:13:59:645','Open deposit account.',10),(40,'19-06-2020 22:14:18:501','Deposit account is closed.',10),(41,'19-06-2020 22:19:06:908','Deposit account is closed.',10),(42,'19-06-2020 22:20:33:630','Open deposit account.',10),(43,'19-06-2020 22:20:57:111','Current account is closed.',10),(44,'22-06-2020 21:07:13:623','Open deposit account.',10),(45,'22-06-2020 22:09:41:482','Open deposit account.',10),(46,'22-06-2020 22:16:32:31','Deposit account is closed.',10),(47,'22-06-2020 22:16:40:816','Deposit account is closed.',10),(48,'22-06-2020 22:17:02:424','Open deposit account.',10),(49,'22-06-2020 22:17:28:708','Open deposit account.',10),(50,'23-06-2020 11:07:13:328','Open deposit account.',10),(51,'25-06-2020 22:28:58:604','Open deposit account.',10),(52,'25-06-2020 23:09:52:720','Open deposit account.',10),(53,'25-06-2020 23:11:12:583','Deposit account is closed.',10),(54,'25-06-2020 23:11:22:550','Deposit account is closed.',10),(55,'25-06-2020 23:30:23:687','Open deposit account.',10);
/*!40000 ALTER TABLE `account_operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit_account`
--

DROP TABLE IF EXISTS `credit_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `credit_account` (
  `idcredit` int(11) NOT NULL AUTO_INCREMENT,
  `credit_amount` double DEFAULT NULL,
  `credit_percent` int(11) DEFAULT NULL,
  `credit_type` varchar(45) DEFAULT NULL,
  `credit_term` int(11) DEFAULT NULL,
  `account_idaccount` int(11) NOT NULL,
  `credit_account_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`idcredit`),
  UNIQUE KEY `idcredit_UNIQUE` (`idcredit`),
  KEY `fk_credit_account_account1_idx` (`account_idaccount`),
  CONSTRAINT `fk_credit_account_account1` FOREIGN KEY (`account_idaccount`) REFERENCES `account` (`idaccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_account`
--

LOCK TABLES `credit_account` WRITE;
/*!40000 ALTER TABLE `credit_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `credit_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `current_account`
--

DROP TABLE IF EXISTS `current_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `current_account` (
  `idcurrent` int(11) NOT NULL AUTO_INCREMENT,
  `current_currency` varchar(5) DEFAULT NULL,
  `currency_number` varchar(50) DEFAULT NULL,
  `current_amount` double DEFAULT NULL,
  `account_idaccount` int(11) NOT NULL,
  `current_account_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`idcurrent`),
  UNIQUE KEY `idcurrent_UNIQUE` (`idcurrent`),
  KEY `fk_current_account_account1_idx` (`account_idaccount`),
  CONSTRAINT `fk_current_account_account1` FOREIGN KEY (`account_idaccount`) REFERENCES `account` (`idaccount`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_account`
--

LOCK TABLES `current_account` WRITE;
/*!40000 ALTER TABLE `current_account` DISABLE KEYS */;
INSERT INTO `current_account` VALUES (5,'UAH','UA63200',10000.34,10,1),(6,'UAH','UA50886',0,11,1),(7,'UAH','UA17562',0,12,1),(8,'UAH','UA52352',0,13,1),(10,'EUR','UA16200',0,12,1),(11,'USD','UA38319',0,10,0),(12,'USD','UA44335',125372,10,1),(13,'EUR','UA79759',0,10,0),(14,'EUR','UA85954',0,10,0),(15,'EUR','UA42665',0,10,0),(16,'UAH','UA73550',0,10,0),(17,'USD','UA40337',0,10,0),(18,'UAH','UA30078',0,10,0),(19,'EUR','UA27979',0,10,1);
/*!40000 ALTER TABLE `current_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deposit_account`
--

DROP TABLE IF EXISTS `deposit_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `deposit_account` (
  `iddeposit` int(11) NOT NULL AUTO_INCREMENT,
  `deposit_currency` varchar(5) DEFAULT NULL,
  `deposit_type` varchar(45) DEFAULT NULL,
  `deposit_term` varchar(5) DEFAULT NULL,
  `deposit_number` varchar(45) DEFAULT NULL,
  `deposit_amount` double DEFAULT NULL,
  `deposit_percent` double DEFAULT NULL,
  `account_idaccount` int(11) NOT NULL,
  `deposit_account_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`iddeposit`),
  UNIQUE KEY `iddeposit_UNIQUE` (`iddeposit`),
  KEY `fk_deposit_account_account1_idx` (`account_idaccount`),
  CONSTRAINT `fk_deposit_account_account1` FOREIGN KEY (`account_idaccount`) REFERENCES `account` (`idaccount`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deposit_account`
--

LOCK TABLES `deposit_account` WRITE;
/*!40000 ALTER TABLE `deposit_account` DISABLE KEYS */;
INSERT INTO `deposit_account` VALUES (3,'UAH','CLASSIC','12','UA18830D',0,9,10,0),(4,'UAH','CLASSIC','6','UA84273D',0,5.5,10,0),(5,'USD','CLASSIC','3','UA79365D',0,3,10,0),(6,'EUR','CLASSIC','1','UA68331D',0,1.5,10,1),(7,'EUR','CLASSIC','9','UA55530D',0,7.25,10,1),(8,'UAH','CLASSIC','12','UA28575D',0,9,10,1),(9,'UAH','SAVINGS','3','UA31488D',0,3.25,10,1),(10,'UAH','CLASSIC','1','UA47583D',0,1.5,10,0),(11,'UAH','CLASSIC','1','UA76633D',0,1.5,10,0),(12,'UAH','CLASSIC','1','UA33654D',0,1.5,10,1);
/*!40000 ALTER TABLE `deposit_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(45) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE KEY `iduser_UNIQUE` (`iduser`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'ADMIN','Alec','Syd','admin@gmail.com','+38(050)1234567','admin','admin'),(13,'USER','Anna','Syd','anna@gmail.com','+38(067)9876532','anna','123'),(14,'USER','David','Syd','david@gmail.com','+38(097)1478523','david','456'),(15,'USER','Roman','Deineka','roman@gmail.com','+38(097)1478523','roma','789'),(16,'USER','Andey','Deineka','andrey@gmail.com','+38(050)5757855','andrey','147');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_has_account`
--

DROP TABLE IF EXISTS `user_has_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_has_account` (
  `user_iduser` int(11) NOT NULL,
  `account_idaccount` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`account_idaccount`),
  KEY `fk_user_has_account_account1_idx` (`account_idaccount`),
  KEY `fk_user_has_account_user_idx` (`user_iduser`),
  CONSTRAINT `fk_user_has_account_account1` FOREIGN KEY (`account_idaccount`) REFERENCES `account` (`idaccount`),
  CONSTRAINT `fk_user_has_account_user` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_has_account`
--

LOCK TABLES `user_has_account` WRITE;
/*!40000 ALTER TABLE `user_has_account` DISABLE KEYS */;
INSERT INTO `user_has_account` VALUES (13,10),(14,11),(15,12),(16,13);
/*!40000 ALTER TABLE `user_has_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-26 14:10:28
