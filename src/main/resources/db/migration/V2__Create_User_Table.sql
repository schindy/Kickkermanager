CREATE TABLE IF NOT EXISTS `user` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) NOT NULL,
  `login_password` varchar(255) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `enable` tinyint(1) NOT NULL DEFAULT '0',
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
