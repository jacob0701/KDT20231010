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
-- Table structure for table `movie_info`
--

DROP TABLE IF EXISTS `movie_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_info` (
  `mv_title` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mv_runningtime` int DEFAULT NULL,
  `mv_genre` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mv_grade` int DEFAULT NULL,
  `mv_director` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mv_openning` date DEFAULT NULL,
  PRIMARY KEY (`mv_title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_info`
--

LOCK TABLES `movie_info` WRITE;
/*!40000 ALTER TABLE `movie_info` DISABLE KEYS */;
INSERT INTO `movie_info` VALUES ('둔2',120,'SF',12,'드니빌뇌브','2023-12-31'),('서울의 여름',120,'드라마',12,'김성수','2023-11-22'),('스즈메의 창문단속',120,'애니메이션',12,'신카이마코토','2023-03-08'),('쏘유',120,'공포',18,'케빈그루터트','2023-12-13'),('짱구는 말려',120,'액션',2,'하시모토마사카즈','2020-08-20');
/*!40000 ALTER TABLE `movie_info` ENABLE KEYS */;
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
