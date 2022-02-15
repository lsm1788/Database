SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS contract;
DROP TABLE IF EXISTS office;




/* Create Tables */

CREATE TABLE contract
(
	contract_no varchar(255) NOT NULL,
	contract_start_office_no char(3) NOT NULL,
	PRIMARY KEY (contract_no)
);


CREATE TABLE office
(
	office_no char(3) NOT NULL,
	office_addr varchar(255) NOT NULL,
	office_tel varchar(11) NOT NULL,
	PRIMARY KEY (office_no)
);



/* Create Foreign Keys */

ALTER TABLE contract
	ADD FOREIGN KEY (contract_start_office_no)
	REFERENCES office (office_no)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



