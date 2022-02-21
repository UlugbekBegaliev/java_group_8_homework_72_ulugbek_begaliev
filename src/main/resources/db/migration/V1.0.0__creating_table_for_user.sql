use `multiplayerChat`;

CREATE TABLE `users` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `username` VARCHAR(128) NOT NULL DEFAULT,
  `email` VARCHAR(128) NOT NULL,
  `password` VARCHAR(128) NOT NULL,
  `enabled` BOOLEAN NOT NULL DEFAULT TRUE,
  `role` VARCHAR(128) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_unique` (`email` ASC)
);