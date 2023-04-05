-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2023 a las 05:27:32
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hilitosdeoro`
--
CREATE DATABASE IF NOT EXISTS `hilitosdeoro` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hilitosdeoro`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ctrl_terceros`
--

CREATE TABLE `ctrl_terceros` (
  `IdTercero` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Telefono` varchar(12) NOT NULL,
  `Direccion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ctrl_terceros`
--

INSERT INTO `ctrl_terceros` (`IdTercero`, `Nombre`, `Apellido`, `Telefono`, `Direccion`) VALUES
(1, 'Karol', 'Romero', '3006351706', 'Cll 31 '),
(2, 'Karla', 'Duarte', ' ', 'Cll 28 ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `IdProducto` int(11) NOT NULL,
  `NomProducto` varchar(20) NOT NULL,
  `VlrUnidad` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`IdProducto`, `NomProducto`, `VlrUnidad`) VALUES
(1, 'Madeja hilo rojo', '13000'),
(2, 'Piedras Coarzo', '5000'),
(3, 'Dije forma corazon', '7000'),
(4, 'Figuras ABCdario', '10000'),
(5, 'Murano', '10000'),
(6, 'Murano', '10000'),
(13, 'tijeras', '5000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ctrl_terceros`
--
ALTER TABLE `ctrl_terceros`
  ADD PRIMARY KEY (`IdTercero`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`IdProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ctrl_terceros`
--
ALTER TABLE `ctrl_terceros`
  MODIFY `IdTercero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
