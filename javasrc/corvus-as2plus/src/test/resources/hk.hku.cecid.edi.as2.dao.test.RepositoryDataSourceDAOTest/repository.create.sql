CREATE TABLE repository (
	message_id varchar(200) NOT NULL,
	message_box varchar(200) NOT NULL,
	content VARBINARY(200) NOT NULL,
	PRIMARY KEY (message_id, message_box)
);
