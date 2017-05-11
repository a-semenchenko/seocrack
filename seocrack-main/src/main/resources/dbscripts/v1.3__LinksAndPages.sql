CREATE TABLE
	`WebPage` (
		`id` BIGINT,
		`title` VARCHAR(10),
		`description` VARCHAR(50),
		`keywords` INT,
		`url` VARCHAR(50),
		PRIMARY KEY(`id`)
	);

CREATE TABLE
	`WebLink` (
		`id` BIGINT,
		`href` VARCHAR(30),
		`anchor` VARCHAR(50),
		`doFollow` VARCHAR(50),
		`webPage` VARCHAR(50),
		PRIMARY KEY(`id`),
		FOREIGN KEY(`webPage`) REFERENCES `WebPage`(`id`)
	);