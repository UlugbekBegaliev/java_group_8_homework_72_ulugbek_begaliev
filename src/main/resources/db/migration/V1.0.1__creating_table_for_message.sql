use `multiplayerChat`;

CREATE TABLE `messages` (
    `id` INT AUTO_INCREMENT NOT NULL,
    `text` VARCHAR(128) NOT NULL,
    `date_time` TIMESTAMP NOT NULL,
    `user_id` INT NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
    PRIMARY KEY (`id`)
);