-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 07-11-2019 a las 16:15:43
-- Versión del servidor: 5.7.27-0ubuntu0.19.04.1
-- Versión de PHP: 7.0.33-12+ubuntu19.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Direcciones`
--

CREATE TABLE `Direcciones` (
  `id_direccion` int(11) NOT NULL,
  `Calle` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NumExt` int(10) NOT NULL,
  `NumInt` int(10) NOT NULL,
  `CP` int(5) NOT NULL,
  `Zona` int(3) NOT NULL,
  `Delegacion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_paciente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Direcciones`
--

INSERT INTO `Direcciones` (`id_direccion`, `Calle`, `NumExt`, `NumInt`, `CP`, `Zona`, `Delegacion`, `id_paciente`) VALUES
(4, 'CallePrueba', 5, 5, 7280, 3, 'qwe', 55),
(5, 'CallePrueba', 5, 5, 7280, 3, 'qwe', 56),
(6, 'qwe', 5, 5, 7280, 5, 'asdqwe', 57),
(7, 'asd', 55, 5, 12345, 1, 'qwe', 58);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Medicos`
--

CREATE TABLE `Medicos` (
  `id_medico` int(10) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apaterno` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Amaterno` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_paciente` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Medicos`
--

INSERT INTO `Medicos` (`id_medico`, `Nombre`, `Apaterno`, `Amaterno`, `id_paciente`) VALUES
(7, 'uno', 'Doc', 'Prueba', 55),
(8, 'dos', 'Doc', 'Prueba', 56),
(9, 'wq', 'asd', 'qwe', 57),
(10, 'qwe', 'ojnn', 'asd', 58);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pacientes`
--

CREATE TABLE `Pacientes` (
  `id_Paciente` int(10) NOT NULL,
  `APaterno` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `AMaterno` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Sexo` varchar(2) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Fecnac` date NOT NULL,
  `Tiempo` int(10) NOT NULL,
  `EstadoFederativo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `EstadoCivil` int(3) NOT NULL,
  `Estudios` int(4) NOT NULL,
  `Leer` int(2) NOT NULL,
  `Escribir` int(2) NOT NULL,
  `ocupacion` int(2) NOT NULL,
  `religion` int(2) NOT NULL,
  `age` int(10) NOT NULL,
  `cp` int(10) NOT NULL,
  `telFijo` int(10) NOT NULL,
  `telMovil` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Pacientes`
--

INSERT INTO `Pacientes` (`id_Paciente`, `APaterno`, `AMaterno`, `Nombre`, `Sexo`, `Fecnac`, `Tiempo`, `EstadoFederativo`, `EstadoCivil`, `Estudios`, `Leer`, `Escribir`, `ocupacion`, `religion`, `age`, `cp`, `telFijo`, `telMovil`) VALUES
(55, 'Escamilla', 'Hernandez', 'Allan', '0', '1950-06-14', 5, 'CDMX', 2, 13, 0, 0, 3, 1, 69, 7280, 12345678, 0),
(56, 'Escamilla', 'Hernandez', 'Allan', '0', '1950-06-14', 5, 'CDMX', 2, 13, 0, 0, 3, 1, 69, 7280, 0, 0),
(57, 'qwe', 'qwe', 'qwe', '0', '1950-06-14', 5, 'sde', 0, 0, 0, 0, 0, 0, 69, 7280, 12345678, 12345678),
(58, 'qwe', 'qwe', 'qwe', '0', '1950-10-10', 5, 'asdqw', 0, 0, 0, 0, 0, 0, 69, 12345, 12345678, 12345678);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Direcciones`
--
ALTER TABLE `Direcciones`
  ADD PRIMARY KEY (`id_direccion`),
  ADD KEY `id_paciente` (`id_paciente`),
  ADD KEY `id_paciente_2` (`id_paciente`);

--
-- Indices de la tabla `Medicos`
--
ALTER TABLE `Medicos`
  ADD PRIMARY KEY (`id_medico`),
  ADD KEY `id_paciente` (`id_paciente`);

--
-- Indices de la tabla `Pacientes`
--
ALTER TABLE `Pacientes`
  ADD PRIMARY KEY (`id_Paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Direcciones`
--
ALTER TABLE `Direcciones`
  MODIFY `id_direccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `Medicos`
--
ALTER TABLE `Medicos`
  MODIFY `id_medico` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `Pacientes`
--
ALTER TABLE `Pacientes`
  MODIFY `id_Paciente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Direcciones`
--
ALTER TABLE `Direcciones`
  ADD CONSTRAINT `prueba` FOREIGN KEY (`id_paciente`) REFERENCES `Pacientes` (`id_Paciente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Medicos`
--
ALTER TABLE `Medicos`
  ADD CONSTRAINT `prueba2` FOREIGN KEY (`id_paciente`) REFERENCES `Pacientes` (`id_Paciente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
