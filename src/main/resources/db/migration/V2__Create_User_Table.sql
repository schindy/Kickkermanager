CREATE TABLE IF NOT EXISTS `user` (
`id` int(10) unsigned NOT NULL,
  `login_name` varchar(255) NOT NULL,
  `login_password` varchar(255) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `enable` tinyint(1) NOT NULL DEFAULT '0',
  `role_id` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

ALTER TABLE `user`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `login_name` (`login_name`), ADD UNIQUE KEY `email` (`email`), ADD UNIQUE KEY `id_2` (`id`), ADD KEY `id` (`id`), ADD KEY `role_id` (`role_id`), ADD KEY `role_id_2` (`role_id`), ADD KEY `role_id_3` (`role_id`);