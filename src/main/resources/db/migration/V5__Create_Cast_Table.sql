CREATE TABLE IF NOT EXISTS `cast` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dice1` int(10) unsigned DEFAULT NULL,
  `dice2` int(10) unsigned DEFAULT NULL,
  `dice3` int(10) unsigned DEFAULT NULL,
  `dice4` int(10) unsigned DEFAULT NULL,
  `dice5` int(10) unsigned DEFAULT NULL,
  `dice6` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;