CREATE TABLE
	`User` (
		`login` VARCHAR(30),
		`password` VARCHAR(30),
		`firstName` VARCHAR(50),
		`companyName` VARCHAR(50),
		`lastName` VARCHAR(50),
		`role` VARCHAR(15),
		`UTYPE` VARCHAR(50),
		PRIMARY KEY(`login`)
		);

CREATE TABLE
	`Project` (
		`id` BIGINT,
		`region` VARCHAR(10),
		`url` VARCHAR(50),
		`budget` INT,
		`customer` VARCHAR(50),
		PRIMARY KEY(`id`),
		FOREIGN KEY(`customer`) REFERENCES `User`(`login`)
	);

CREATE TABLE
  `Keyword` (
    `id` BIGINT,
    `position` INT,
    `checkDate` TIMESTAMP(14),
    `project` INT NOT NULL,
    PRIMARY KEY(`id`),
    FOREIGN KEY(`project`) REFERENCES `Project`(`id`)
  );

CREATE TABLE
  `jndProjectSeo` (
    `id` BIGINT,
    `projectId` BIGINT,
    `seo` VARCHAR(30),
    PRIMARY KEY(`id`),
  );

CREATE TABLE
  `jndProjectManager` (
    `id` BIGINT,
    `projectId` BIGINT,
    `manager` VARCHAR(30),
    PRIMARY KEY(`id`),
);

