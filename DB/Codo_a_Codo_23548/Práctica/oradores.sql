-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2023 at 05:03 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `com_23548`
--

-- --------------------------------------------------------

--
-- Table structure for table `oradores`
--

CREATE TABLE `oradores` (
  `id_orador` int(11) NOT NULL,
  `nombre` varchar(35) NOT NULL,
  `apellido` varchar(35) NOT NULL,
  `mail` varchar(35) NOT NULL,
  `tema` varchar(35) NOT NULL,
  `fecha_alta` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `oradores`
--

INSERT INTO `oradores` (`id_orador`, `nombre`, `apellido`, `mail`, `tema`, `fecha_alta`) VALUES
(1, 'Giovanni', 'Rossi', 'giovanni.rossi@mail.com', 'Tema de Giovanni', '2023-11-17 13:02:23'),
(2, 'Francesca', 'Russo', 'francesca.russo@mail.com', 'Tema de Francesca', '2023-11-17 13:02:23'),
(3, 'Alessandro', 'Ferrari', 'alessandro.ferrari@mail.com', 'Tema de Alessandro', '2023-11-17 13:02:23'),
(4, 'Chiara', 'Esposito', 'chiara.esposito@mail.com', 'Tema de Chiara', '2023-11-17 13:02:23'),
(5, 'Luca', 'Bianchi', 'luca.bianchi@mail.com', 'Tema de Luca', '2023-11-17 13:02:23'),
(6, 'Giulia', 'Romano', 'giulia.romano@mail.com', 'Tema de Giulia', '2023-11-17 13:02:23'),
(7, 'Matteo', 'Colombo', 'matteo.colombo@mail.com', 'Tema de Matteo', '2023-11-17 13:02:23'),
(8, 'Sofia', 'Ricci', 'sofia.ricci@mail.com', 'Tema de Sofia', '2023-11-17 13:02:23'),
(9, 'Marco', 'Marino', 'marco.marino@mail.com', 'Tema de Marco', '2023-11-17 13:02:23'),
(10, 'Laura', 'Greco', 'laura.greco@mail.com', 'Tema de Laura', '2023-11-17 13:02:23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `oradores`
--
ALTER TABLE `oradores`
  ADD PRIMARY KEY (`id_orador`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `oradores`
--
ALTER TABLE `oradores`
  MODIFY `id_orador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
