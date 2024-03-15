-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mrs
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `opened_mv`
--

DROP TABLE IF EXISTS `opened_mv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opened_mv` (
  `o_starttime` time NOT NULL,
  `mv_title` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `t_theater` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `o_openseat` int DEFAULT NULL,
  PRIMARY KEY (`o_starttime`,`t_theater`),
  KEY `FK_Movie_Info_TO_Opened_mv_1` (`mv_title`),
  KEY `FK_Theater_TO_Opened_mv_1` (`t_theater`),
  CONSTRAINT `FK_Movie_Info_TO_Opened_mv_1` FOREIGN KEY (`mv_title`) REFERENCES `movie_info` (`mv_title`),
  CONSTRAINT `FK_Theater_TO_Opened_mv_1` FOREIGN KEY (`t_theater`) REFERENCES `theater` (`t_theater`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opened_mv`
--

LOCK TABLES `opened_mv` WRITE;
/*!40000 ALTER TABLE `opened_mv` DISABLE KEYS */;
INSERT INTO `opened_mv` VALUES ('14:00:00','둔2','A',100),('14:00:00','짱구는 말려','C',59),('16:00:00','스즈메의 창문단속','B',79),('16:00:00','쏘유','C',60),('18:00:00','서울의 여름','B',80),('18:00:00','쏘유','C',56),('20:00:00','둔2','A',97),('20:00:00','스즈메의 창문단속','B',78),('22:00:00','서울의 여름','A',98);
/*!40000 ALTER TABLE `opened_mv` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-19 17:50:51
