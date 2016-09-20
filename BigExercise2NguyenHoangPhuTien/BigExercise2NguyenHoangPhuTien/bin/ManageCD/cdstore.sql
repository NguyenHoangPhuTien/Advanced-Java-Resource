-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2016 at 04:00 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cdstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `cd`
--

CREATE TABLE `cd` (
  `id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `singer` varchar(150) NOT NULL,
  `numbersongs` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cd`
--

INSERT INTO `cd` (`id`, `name`, `singer`, `numbersongs`, `price`) VALUES
(1, 'tinh em', 'minh thuan', 10, 20000),
(2, 'tinh anh', 'dan truong', 15, 30000),
(6, 'tinh cha', 'cam ly', 11, 12000),
(7, 'tinh me', 'minh tuyet', 14, 18000),
(8, 'con ca', 'lam truong', 18, 40000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cd`
--
ALTER TABLE `cd`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cd`
--
ALTER TABLE `cd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
