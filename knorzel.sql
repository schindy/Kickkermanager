-- phpMyAdmin SQL Dump
-- version 4.2.6deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 21. Jan 2015 um 18:10
-- Server Version: 5.5.40-0ubuntu1
-- PHP-Version: 5.5.12-2ubuntu4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `knorzel`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `cast`
--

CREATE TABLE IF NOT EXISTS `cast` (
  `id` int(10) unsigned NOT NULL,
  `dice1` int(10) unsigned DEFAULT NULL,
  `dice2` int(10) unsigned DEFAULT NULL,
  `dice3` int(10) unsigned DEFAULT NULL,
  `dice4` int(10) unsigned DEFAULT NULL,
  `dice5` int(10) unsigned DEFAULT NULL,
  `dice6` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `game`
--

CREATE TABLE IF NOT EXISTS `game` (
`id` int(10) unsigned NOT NULL,
  `finish` tinyint(1) NOT NULL DEFAULT '0',
  `user_id` int(10) unsigned NOT NULL,
  `pointsnote_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=2 ;

--
-- Daten für Tabelle `game`
--

INSERT INTO `game` (`id`, `finish`, `user_id`, `pointsnote_id`) VALUES
(1, 0, 0, 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pointsnote`
--

CREATE TABLE IF NOT EXISTS `pointsnote` (
`id` int(10) unsigned NOT NULL,
  `aces` int(10) unsigned DEFAULT NULL,
  `twos` int(10) unsigned DEFAULT NULL,
  `threes` int(10) unsigned DEFAULT NULL,
  `fours` int(10) unsigned DEFAULT NULL,
  `fives` int(10) unsigned DEFAULT NULL,
  `sixes` int(10) unsigned DEFAULT NULL,
  `uper_section_score` int(10) unsigned DEFAULT NULL,
  `bonus` int(10) unsigned DEFAULT NULL,
  `three_of_a_kind` int(10) unsigned DEFAULT NULL,
  `four_of_a_kind` int(10) unsigned DEFAULT NULL,
  `full_house` int(10) unsigned DEFAULT NULL,
  `small_straight` int(10) unsigned DEFAULT NULL,
  `big_straight` int(10) unsigned DEFAULT NULL,
  `yahtzee` int(10) unsigned DEFAULT NULL,
  `chance` int(10) unsigned DEFAULT NULL,
  `lower_section_score` int(10) unsigned DEFAULT NULL,
  `grand_total` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `role`
--

CREATE TABLE IF NOT EXISTS `role` (
`id` int(10) unsigned NOT NULL,
  `role` varchar(255) CHARACTER SET latin1 NOT NULL,
  `role_description` varchar(255) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=3 ;

--
-- Daten für Tabelle `role`
--

INSERT INTO `role` (`id`, `role`, `role_description`) VALUES
(1, 'ROLE_ADMIN', 'Administrator'),
(2, 'ROLE_USER', 'Normal User');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `round`
--

CREATE TABLE IF NOT EXISTS `round` (
  `id` int(11) NOT NULL,
  `cast1` int(10) unsigned DEFAULT NULL,
  `cast2` int(10) unsigned DEFAULT NULL,
  `cast3` int(10) unsigned DEFAULT NULL,
  `type` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `game_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` int(10) unsigned NOT NULL,
  `login_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `login_password` varchar(255) COLLATE utf8_bin NOT NULL,
  `first_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin NOT NULL,
  `enable` tinyint(1) NOT NULL DEFAULT '0',
  `role_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=13 ;

--
-- Daten für Tabelle `user`
--

INSERT INTO `user` (`id`, `login_name`, `login_password`, `first_name`, `last_name`, `email`, `enable`, `role_id`) VALUES
(1, 'schindy', 'test', 'Simon', 'Schindelmann', 'test@test.de', 1, 1),
(2, 'schindy2', 'test2', 'Simon2', 'Schindelmann2', 'test@test.de2', 1, 2),
(3, '', '', '', '', '', 0, 0),
(4, 'test', 'tesfsdfsdfsd', 'test123', 'test123', 'simon@web.de', 0, 0),
(7, 'test222', 'test', 'tests', 'tststs', 'tst@webde', 0, 0),
(8, 'schindy23', 'schindy23', 'admin', 'admin', 'admin@admin.de', 1, 1),
(9, 'test1', 'sdfsdfsdfdsf', 'sdfsd', 'sdfsd', 'bork@bork.de', 0, 2),
(11, 'dsfsdffdsdsadfssd', 'sdfsdfafdssdsdfsd', 'sdfsdf', 'sdfsdf', 'simonschin22222delmann@googlemail.com', 0, 2),
(12, 'sfafsdfds', 'gfgfgfggf', 'dfd', 'fsdfds', 'bork2322332@bork.de', 0, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cast`
--
ALTER TABLE `cast`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `pointsnote_id` (`pointsnote_id`);

--
-- Indexes for table `pointsnote`
--
ALTER TABLE `pointsnote`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`), ADD UNIQUE KEY `role` (`role`);

--
-- Indexes for table `round`
--
ALTER TABLE `round`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `login_name` (`login_name`), ADD UNIQUE KEY `email` (`email`), ADD UNIQUE KEY `id_2` (`id`), ADD KEY `id` (`id`), ADD KEY `role_id` (`role_id`), ADD KEY `role_id_2` (`role_id`), ADD KEY `role_id_3` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `game`
--
ALTER TABLE `game`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `pointsnote`
--
ALTER TABLE `pointsnote`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
