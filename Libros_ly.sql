-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: localhost    Database: libros_ly
-- ------------------------------------------------------
-- Server version	5.5.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL AUTO_INCREMENT,
  `fecha ingreso` date DEFAULT NULL,
  `contraseña` varchar(15) DEFAULT NULL,
  `mail` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idAdministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'2015-05-11','a1234567.',NULL),(2,'2015-05-11','a1234567.',NULL),(3,'2015-05-11','a1234567.',NULL),(4,'2015-05-11','a1234567.',NULL);
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Contraseña` varchar(40) DEFAULT NULL,
  `mail` varchar(40) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `nik` varchar(20) DEFAULT NULL,
  `premium` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'a1234567.','pepito@gmail.com','2015-05-12','pepito23',0),(2,'a7654321.','jose@gmail.com','2015-05-12','Josito',0),(3,'1234567Aa','antonio@yahoo.es','2015-05-12','Ant69',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentar`
--

DROP TABLE IF EXISTS `comentar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentar` (
  `fecha` date NOT NULL,
  `texto` varchar(300) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `idLibro` int(11) DEFAULT NULL,
  PRIMARY KEY (`fecha`),
  KEY `fk_comentar_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_comentar_compra1_idx` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentar`
--

LOCK TABLES `comentar` WRITE;
/*!40000 ALTER TABLE `comentar` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compra` (
  `idcompra` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) DEFAULT NULL,
  `idlibro` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `precio_sin_descuento` decimal(6,2) DEFAULT NULL,
  `descuento` decimal(4,2) DEFAULT NULL,
  `numero_tarjeta` int(16) DEFAULT NULL,
  `dni` varchar(9) DEFAULT NULL,
  `puntuacion` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro` (
  `idLibro` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(50) DEFAULT NULL,
  `Sinopsis` varchar(500) DEFAULT NULL,
  `Autor` varchar(45) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `puntuacion` decimal(3,1) DEFAULT NULL,
  `beneficios` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`idLibro`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'La guerra de los cielos: volumen 1','La guerra más antigua y devastadora de la existencia ha encontrado el modo de continuar, de extenderse por toda la creación. El Cielo y el Infierno ya no son los únicos escenarios para este terrible conflicto. ','Fernando Trujillo Sanz','Ficción',12.00,NULL,NULL),(2,'La guerra de los cielos: volumen 2','La guerra más antigua y devastadora de la existencia ha encontrado el modo de continuar, de extenderse por toda la creación. El Cielo y el Infierno ya no son los únicos escenarios para este terrible conflicto. ','Fernando Trujillo Sanz','Ficción',12.00,NULL,NULL);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modificar`
--

DROP TABLE IF EXISTS `modificar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modificar` (
  `fecha` date NOT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `Administrador_idAdministrador` int(11) NOT NULL,
  `Libro_idLibro` int(11) NOT NULL,
  PRIMARY KEY (`fecha`),
  KEY `fk_modificar_Administrador1_idx` (`Administrador_idAdministrador`),
  KEY `fk_modificar_Libro1_idx` (`Libro_idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modificar`
--

LOCK TABLES `modificar` WRITE;
/*!40000 ALTER TABLE `modificar` DISABLE KEYS */;
/*!40000 ALTER TABLE `modificar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-14 14:23:21
