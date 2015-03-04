CREATE TABLE IF NOT EXISTS `game` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `finish` tinyint(1) NOT NULL DEFAULT '0',
  `user_id` int(10) unsigned NOT NULL,
  `pointsnote_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  FOREIGN KEY (`pointsnote_id`) REFERENCES `pointsnote` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin;