CREATE TABLE
	`WebPage` (
		`id` BIGINT,
		`title` VARCHAR(150),
		`description` VARCHAR(250),
		`keywords` VARCHAR(250),
		`url` VARCHAR(50),
		PRIMARY KEY(`id`)
	);

CREATE TABLE
	`WebLink` (
		`id` BIGINT,
		`href` VARCHAR(250),
		`anchor` VARCHAR(250),
		`doFollow` VARCHAR(250),
		`webPage` BIGINT,
		`webPage_id` BIGINT,
		PRIMARY KEY(`id`),
		FOREIGN KEY(`webPage`) REFERENCES `WebPage`(`id`)
	);