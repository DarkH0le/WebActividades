CREATE DATABASE  IF NOT EXISTS `PizzaRepo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `PizzaRepo`;
-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: PizzaRepo
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
-- Table structure for table `Pizza`
--

DROP TABLE IF EXISTS `Pizza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Pizza` (
  `idPizza` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `ingirdients` varchar(45) DEFAULT NULL,
  `sizeOne` varchar(45) DEFAULT NULL,
  `sizeOnePrice` varchar(45) DEFAULT NULL,
  `sizeTwo` varchar(45) DEFAULT NULL,
  `sizeTwoPrice` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPizza`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pizza`
--

LOCK TABLES `Pizza` WRITE;
/*!40000 ALTER TABLE `Pizza` DISABLE KEYS */;
INSERT INTO `Pizza` VALUES (1,'Peperoni','Peperoni','14cm','100','17','150','https://urlzs.com/mpNCj'),(14,'Pepe','roniini','23','123','34cm','344','https://urlzs.com/mpNCj'),(15,'Ivan','asdm','klm','kml','lkm','klm',NULL),(16,'Piza nueva','lk','mlkm','lkm','lkm','lm',NULL),(17,'AMERICANA','TOMATE,CEBOLLA','14cm','130','16','200',NULL);
/*!40000 ALTER TABLE `Pizza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PizzaOrder`
--

DROP TABLE IF EXISTS `PizzaOrder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `PizzaOrder` (
  `idPizzaOrder` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `town` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `amout` varchar(45) DEFAULT NULL,
  `pizzaType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPizzaOrder`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PizzaOrder`
--

LOCK TABLES `PizzaOrder` WRITE;
/*!40000 ALTER TABLE `PizzaOrder` DISABLE KEYS */;
INSERT INTO `PizzaOrder` VALUES (29,'Editing','Editing','Editing','Editing','8','14cm','8',NULL),(30,'bla','j','j','j','8','14cm','8',NULL),(31,'bla','j','j','j','8','14cm','8',NULL),(32,'edit','j','j','j','8','14cm','8',NULL),(33,'j','jed','j','j','8','14cm','8',NULL),(34,'j','j','j','j','8','14cm','8',NULL),(35,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(36,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(37,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(38,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(39,'Ivan Nuevo','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(40,'Ivan haha','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(41,'Ivan haha','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(42,'Ivan haha','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(43,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(44,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(45,'Ivan','Aldama','Casa Fuerte','Talju','1234','23','2',NULL),(46,'eddited','j','j','j','8','14cm','8',NULL),(47,'eddited','j','j','j','8','14cm','8',NULL),(48,'eddited','j','j','j','8','14cm','8',NULL),(49,'eddited','j','j','j','8','14cm','8',NULL),(50,'eddited','Jose','j','j','8','14cm','8',NULL),(51,'nuevo','j','Nuevo','nuevo','12','nuevo','4',NULL),(52,'eddited','j','j','j','8','14cm','8',NULL),(53,'eddited','j','j','j','8','14cm','8',NULL),(54,'eddited','j','j','jd','8','14cm','8',NULL),(55,'eddited','jd','jd','j','8','14cm','8',NULL),(56,'eddited','jdd','j','j','8','14cm','8',NULL),(57,'eddited','dddd','j','j','8','14cm','8',NULL),(58,'edditedf','jf','jf','jf','8','14cmf','8',NULL),(59,'Ivan','Casa Fuert','CLasica','Talju','6142240515','14cm','2',NULL),(60,'Yaira','La fuente','ITESM','Zapopan','4543234','17','2',NULL);
/*!40000 ALTER TABLE `PizzaOrder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-12 13:19:44
