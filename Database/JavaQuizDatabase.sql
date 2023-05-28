-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: javaquizdatabase
-- ------------------------------------------------------
-- Server version	5.7.42-log

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
-- Table structure for table `admin_login`
--

DROP TABLE IF EXISTS `admin_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_login` (
  `AdminUsername` varchar(255) DEFAULT NULL,
  `AdminPassword` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_login`
--

LOCK TABLES `admin_login` WRITE;
/*!40000 ALTER TABLE `admin_login` DISABLE KEYS */;
INSERT INTO `admin_login` VALUES ('Admin','Admin');
/*!40000 ALTER TABLE `admin_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finalmarks`
--

DROP TABLE IF EXISTS `finalmarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `finalmarks` (
  `SUserName` varchar(255) DEFAULT NULL,
  `SMarks` int(11) DEFAULT NULL,
  `Sid` int(11) NOT NULL AUTO_INCREMENT,
  `SGrade` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Sid`),
  UNIQUE KEY `SUserName` (`SUserName`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finalmarks`
--

LOCK TABLES `finalmarks` WRITE;
/*!40000 ALTER TABLE `finalmarks` DISABLE KEYS */;
INSERT INTO `finalmarks` VALUES ('jay',80,1,'A'),('gita',60,2,'B');
/*!40000 ALTER TABLE `finalmarks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listofquestions`
--

DROP TABLE IF EXISTS `listofquestions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listofquestions` (
  `QNo` varchar(255) DEFAULT NULL,
  `Question` varchar(255) DEFAULT NULL,
  `Option1` varchar(255) DEFAULT NULL,
  `Option2` varchar(255) DEFAULT NULL,
  `Option3` varchar(255) DEFAULT NULL,
  `Option4` varchar(255) DEFAULT NULL,
  `CorrectAnswer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listofquestions`
--

LOCK TABLES `listofquestions` WRITE;
/*!40000 ALTER TABLE `listofquestions` DISABLE KEYS */;
INSERT INTO `listofquestions` VALUES ('1','Who invented Java Programming','Guido van Rossum','James Gosling','Dennis Ritchie','Bjarne Stroustrup','2'),('2',' Which statement is true about Java?','Java is a sequence-dependent',' Java is a code dependent','Java is a platform-dependent','Java is a platform-independent','4'),('3','Which component is used to compile, debug and execute the java programs?','JDK','JRE','JIT','JVM','1'),('4','Which one of the following is not a Java feature?','Object-oriented','Use of pointers','Portable','Dynamic and Extensible','2'),('5','Which of these cannot be used for a variable name in Java?','identifier & keyword','identifier','keyword','none of the mentioned','3'),('6','What is the return type of the hashCode() method in the Object class?','Object',' int','long','void','2'),('7','What does the expression float a = 35 / 0 return?','Zero','Not a Number','Infinity','Run time exception','3'),('8','Which package contains the Random class?','java.util package','java.lang package','java.awt package','java.io package','1'),('9','An interface with no fields or methods is known as a ______?','Runnable Interface','Marker Interface','Abstract Interface','CharSequence Interface','2'),('10','Which of the following is not an OOPS concept in Java?','Polymorphism','Inheritance','Compilation','Encapsulation','3');
/*!40000 ALTER TABLE `listofquestions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_login`
--

DROP TABLE IF EXISTS `student_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_login` (
  `SUserName` varchar(255) DEFAULT NULL,
  `SPassword` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_login`
--

LOCK TABLES `student_login` WRITE;
/*!40000 ALTER TABLE `student_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_registration`
--

DROP TABLE IF EXISTS `student_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_registration` (
  `SFirstName` varchar(255) DEFAULT NULL,
  `SLastName` varchar(255) DEFAULT NULL,
  `SUserName` varchar(255) NOT NULL,
  `SPassword` varchar(255) NOT NULL,
  `Scity` varchar(255) DEFAULT NULL,
  `SEmail_ID` varchar(255) DEFAULT NULL,
  `SMobileNo` varchar(255) DEFAULT NULL,
  `Sid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Sid`),
  UNIQUE KEY `SUserName` (`SUserName`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_registration`
--

LOCK TABLES `student_registration` WRITE;
/*!40000 ALTER TABLE `student_registration` DISABLE KEYS */;
INSERT INTO `student_registration` VALUES ('Jayesh','Chavan','jay','jay@123','Jalgaon','jay@gmail.com','8390990515',1),('Dipali','Kharade','dipa','dipa@123','Pune','dipa@gmail.com','8390990515',2),('Heramb','Jadhav','herby','herby@123','Pune','herby@gmail.com','8390990515',3),('Amol','K','amol','amol@123','Nashik','amol@gmail.com','8390990515',4),('Gitanjali','Gavhane','gita','gita@123','Pune','gita@gmail.com','8390990515',6);
/*!40000 ALTER TABLE `student_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submitanswers`
--

DROP TABLE IF EXISTS `submitanswers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `submitanswers` (
  `QNo` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submitanswers`
--

LOCK TABLES `submitanswers` WRITE;
/*!40000 ALTER TABLE `submitanswers` DISABLE KEYS */;
/*!40000 ALTER TABLE `submitanswers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-28 17:20:43
