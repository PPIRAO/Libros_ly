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
  `fecha ingreso` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
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
INSERT INTO `administrador` VALUES (1,'2015-05-10 20:00:00','','prueba'),(2,'2015-05-10 20:00:00','a1234567.','pedro@loes.com'),(3,'2015-05-10 20:00:00','a1234567.','pringao@gmail.c'),(4,'2015-05-10 20:00:00','a1234567.','hola@gmail.com');
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
  `fecha_ingreso` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `nik` varchar(20) DEFAULT NULL,
  `premium` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'a1234567.','pepito@gmail.com','2015-05-11 20:00:00','pepito23',0),(2,'a7654321.','jose@gmail.com','2015-05-11 20:00:00','Josito',0),(3,'1234567Aa','antonio@yahoo.es','2015-05-11 20:00:00','Ant69',0),(4,'a1234567.','byluiso@gmail.com','2015-05-16 20:00:00','Luiso23',1),(5,'A1234567.','pepo@hotmail.es','2015-05-16 20:00:00','Papepo1',0),(6,'a','pocoyo@gmail.es','2015-05-16 20:00:00','Pocoio',1),(8,'a1234567.','a@gmailsss.com','2015-05-26 07:17:18','qwerty',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentar`
--

DROP TABLE IF EXISTS `comentar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentar` (
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `texto` varchar(300) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  `idLibro` int(11) DEFAULT NULL,
  PRIMARY KEY (`fecha`),
  KEY `fk_comentar_Cliente1_idx` (`idCliente`),
  KEY `fk_comentar_compra1_idx` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentar`
--

LOCK TABLES `comentar` WRITE;
/*!40000 ALTER TABLE `comentar` DISABLE KEYS */;
INSERT INTO `comentar` VALUES ('2015-05-18 20:00:00','Todo es genial',2,3);
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
  `fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `precio_sin_descuento` decimal(6,2) DEFAULT NULL,
  `descuento` decimal(4,2) DEFAULT NULL,
  `numero_tarjeta` int(16) DEFAULT NULL,
  `dni` varchar(9) DEFAULT NULL,
  `puntuacion` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,2,1,'2015-05-16 20:00:00',12.00,0.00,2147483647,'11334472P',6.0),(2,1,1,'2015-05-16 20:00:00',12.00,0.00,2147483647,'111111111',8.0),(3,3,2,'2015-05-16 20:00:00',12.00,0.00,2147483647,'99999999K',8.0),(4,4,2,'2015-05-16 20:00:00',12.00,0.00,2147483647,'33333333L',8.0),(5,1,4,'2015-05-16 20:00:00',10.00,NULL,2147483647,'12345678O',NULL);
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
  `Sinopsis` varchar(1000) DEFAULT NULL,
  `Autor` varchar(45) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `puntuacion` decimal(3,1) DEFAULT '5.0',
  `beneficios` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`idLibro`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'La guerra de los cielos: volumen 1','La guerra más antigua y devastadora de la existencia ha encontrado el modo de continuar, de extenderse por toda la creación. El Cielo y el Infierno ya no son los únicos escenarios para este terrible conflicto. ','Fernando Trujillo Sanz','Ficción',12.00,7.0,NULL),(2,'La guerra de los cielos: volumen 2','La guerra más antigua y devastadora de la existencia ha encontrado el modo de continuar, de extenderse por toda la creación. El Cielo y el Infierno ya no son los únicos escenarios para este terrible conflicto. ','Fernando Trujillo Sanz','Ficción',12.00,8.0,NULL),(3,'La sombra del templario','Los templarios, el Papa y un despiadado espía persiguen un pergamino que podría cambiar la Historia.Bernard Guils, un templario que viaja en un barco con destino a Barcelona, es envenenado al final del viaje. Antes de morir, le dice a un médico judío de a bordo que busque a su discípulo Guillem y le entregue unos papeles muy importantes. Pero estos pergaminos desaparecen misteriosamente, dando lugar a una trama inteligentemente entretejida con traiciones, escondrijos y espías que p','Nuria Masot ','Histórica',15.00,5.0,NULL),(4,'La ladrona de libros','En plena II Guerra Mundial, la pequeña Liesel hallará su salvación en la lectura. Una novela preciosa, tremendamente humana y emocionante, que describe las peripecias de una niña alemana de nueve años desde que es dada en adopción por su madre hasta el final de la guerra. Su nueva familia, gente sencilla y nada afecta al nazismo, le enseña a leer y a través de los libros Rudy logra distraerse durante los bombardeos y combatir la tristeza. Pero es el libro que ella misma está escribiendo el que f','Markus Zusak','Narrativa',12.00,5.0,NULL),(5,'Obsidian','Cuando nos mudamos a Virginia Occidental, justo antes del último curso deinstituto, creía que me esperaba una vida aburrida, en la que ni siquiera tendríainternet para actualizar mi blog literario. Entonces conocí a mi vecino,Daemon. Alto, guapo, con unos ojos verdes impresionantes y tambiéninsufrible, arrogante y malcriado.Pero eso no es todo. Cuando un desconocido me atacó, Daemon usó suspoderes para salvarme y después me confesó que no es de nuestro planeta.Sí, lo habéis leído bien. Mi vecin','Jennifer L. Armentrout','Juvenil',10.00,5.0,NULL);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modificar`
--

DROP TABLE IF EXISTS `modificar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modificar` (
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `descripcion` varchar(300) DEFAULT NULL,
  `Administrador_idAdministrador` int(11) NOT NULL,
  `idLibro` int(11) NOT NULL,
  PRIMARY KEY (`fecha`),
  KEY `fk_modificar_Administrador1_idx` (`Administrador_idAdministrador`),
  KEY `fk_modificar_Libro1_idx` (`idLibro`)
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

-- Dump completed on 2015-05-26 14:53:06
