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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `b_number` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `m_phone` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `o_starttime` time NOT NULL,
  `mv_title` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `t_theater` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `b_date` datetime DEFAULT NULL,
  `b_bookseat` varchar(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`b_number`),
  KEY `FK_Member_TO_Book_1` (`m_phone`),
  KEY `FK_Opened_mv_TO_Book_1` (`o_starttime`),
  KEY `FK_Opened_mv_TO_Book_2` (`mv_title`),
  KEY `FK_Opened_mv_TO_Book_3` (`t_theater`),
  CONSTRAINT `FK_Member_TO_Book_1` FOREIGN KEY (`m_phone`) REFERENCES `member` (`m_phone`),
  CONSTRAINT `FK_Opened_mv_TO_Book_1` FOREIGN KEY (`o_starttime`) REFERENCES `opened_mv` (`o_starttime`),
  CONSTRAINT `FK_Opened_mv_TO_Book_2` FOREIGN KEY (`mv_title`) REFERENCES `opened_mv` (`mv_title`),
  CONSTRAINT `FK_Opened_mv_TO_Book_3` FOREIGN KEY (`t_theater`) REFERENCES `opened_mv` (`t_theater`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1400CF5','010-4444-5555','14:00:00','짱구는 말려','C','2023-11-11 00:00:00','F5'),('1600BC3','010-1111-1234','16:00:00','스즈메의 창문단속','B','2023-11-11 00:00:00','C3'),('1600BC4','010-5678-7777','16:00:00','스즈메의 창문단속','B','2023-11-11 00:00:00','C4'),('1600BC5','010-5678-8888','16:00:00','스즈메의 창문단속','B','2023-11-11 00:00:00','C5'),('1800CE10','010-1111-2222','18:00:00','쏘유','C','2023-11-11 00:00:00','E10'),('1800CE9','010-1111-2222','18:00:00','쏘유','C','2023-11-11 00:00:00','E9'),('2000AG1','010-4444-5555','20:00:00','둔2','A','2023-11-11 00:00:00','G1'),('2000AG2','010-4444-5555','20:00:00','둔2','A','2023-11-11 00:00:00','G2'),('2000AG3','010-4444-5555','20:00:00','둔2','A','2023-11-11 00:00:00','G3'),('2000BD3','010-7777-2222','20:00:00','스즈메의 창문단속','B','2023-11-11 00:00:00','D3'),('2000BD4','010-5555-2222','20:00:00','스즈메의 창문단속','B','2023-11-11 00:00:00','D4'),('2200AA1','010-0000-3333','22:00:00','서울의 여름','A','2023-11-11 00:00:00','A1'),('2200AA2','010-0000-3333','22:00:00','서울의 여름','A','2023-11-11 00:00:00','A2'),('2200AA3','010-0000-3333','22:00:00','서울의 여름','A','2023-11-11 00:00:00','A3'),('2200AA4','010-0000-3333','22:00:00','서울의 여름','A','2023-11-11 00:00:00','A4');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
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
