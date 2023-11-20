-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2023 at 11:05 AM
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
-- Database: `java_user_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `flower_market`
--

CREATE TABLE `flower_market` (
  `ID` int(11) NOT NULL,
  `flower_name` varchar(127) NOT NULL,
  `flower_color` varchar(127) NOT NULL,
  `flower_meaning` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flower_market`
--

INSERT INTO `flower_market` (`ID`, `flower_name`, `flower_color`, `flower_meaning`) VALUES
(17, 'Iris', 'purple', 'heavenly eyes'),
(18, 'Lotus', 'yellow', 'faith'),
(19, 'Orchid flower', 'blue', 'elegance'),
(21, 'popo', 'green', '-');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `full_name` varchar(127) NOT NULL,
  `email` varchar(127) NOT NULL,
  `password` varchar(127) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `full_name`, `email`, `password`) VALUES
(1, 'Boom', 'full@gmail.com', '12345'),
(2, 'mi', 'tee@gmail.com', '6789'),
(3, 'boss', 'bossza@gmail.com', '123456'),
(4, 'wan', 'stupid@gmail.com', '234'),
(5, 'neno', 'neno@gmail.com', '123'),
(6, 'stone', 'stone34917@gmail.com', '1234'),
(7, 'name', 'name34@gmail.com', '12'),
(8, 'to', 'to3@gmail.com', '111'),
(9, 'David', 'David@gmail.com', '123'),
(10, 'test', 'test1@gmail.com', '212');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `flower_market`
--
ALTER TABLE `flower_market`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `flower_market`
--
ALTER TABLE `flower_market`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
