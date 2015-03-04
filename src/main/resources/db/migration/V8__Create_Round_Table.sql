CREATE TABLE IF NOT EXISTS `round` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cast1` int(10) unsigned DEFAULT NULL,
  `cast2` int(10) unsigned DEFAULT NULL,
  `cast3` int(10) unsigned DEFAULT NULL,
  `type` varchar(255)DEFAULT NULL,
  `game_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`game_id`) REFERENCES `game` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;