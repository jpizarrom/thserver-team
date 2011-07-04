-- phpMyAdmin SQL Dump
-- version 3.3.9.2deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 03-07-2011 a las 20:34:48
-- Versión del servidor: 5.1.49
-- Versión de PHP: 5.3.3-7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `memoria2-team`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Team`
--

CREATE TABLE IF NOT EXISTS `Team` (
  `teamId` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teamId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=45 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Team_User`
--

CREATE TABLE IF NOT EXISTS `Team_User` (
  `teams_teamId` bigint(20) NOT NULL,
  `users_userId` bigint(20) NOT NULL,
  PRIMARY KEY (`teams_teamId`,`users_userId`),
  KEY `FK6CEAE86DC6115A00` (`teams_teamId`),
  KEY `FK6CEAE86DAB3D64CA` (`users_userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `User`
--

CREATE TABLE IF NOT EXISTS `User` (
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `Team_User`
--
ALTER TABLE `Team_User`
  ADD CONSTRAINT `FK6CEAE86DAB3D64CA` FOREIGN KEY (`users_userId`) REFERENCES `User` (`userId`),
  ADD CONSTRAINT `FK6CEAE86DC6115A00` FOREIGN KEY (`teams_teamId`) REFERENCES `Team` (`teamId`);
