insert into users(username, password, enabled) values ("tinhcao", "tinhcao", true);
insert into users(username, password, enabled) values ("kua", "kua", true);

insert into authorities(username, authority) values ("tinhcao", "ROLE_USER");
insert into authorities(username, authority) values ("kua", "ROLE_USER");
