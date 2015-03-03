CREATE TABLE IF NOT EXISTS `role` (
`id` int(10) unsigned NOT NULL,
  `role` varchar(255) NOT NULL,
  `role_description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

ALTER TABLE `role` MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT;