insert into device_Owner (owner_id, owner_name,email_id) values (1, 'sanjeev','sanjeev@gmail.com');
insert into device_Owner (owner_id, owner_name,email_id) values (2, 'Rajesh','Rajesh@gmail.com');
insert into device_Owner (owner_id, owner_name,email_id) values (3, 'Rahul','Rahul@gmail.com');
insert into device_Owner (owner_id, owner_name,email_id) values (4, 'John','John@gmail.com');
insert into device_Owner (owner_id, owner_name,email_id) values (5, 'Amy','amy@gmail.com');
insert into device_Owner (owner_id, owner_name,email_id) values (6, 'Carol','carol@gmail.com');

insert into device (device_id, device_name, device_type) values (101, 'Lenovo', 'COMPUTER');
insert into device (device_id, device_name, device_type) values (102, 'iPhone', 'MOBILE');
insert into device (device_id, device_name, device_type) values (103, 'DELL', 'COMPUTER');
insert into device (device_id, device_name, device_type) values (104, 'ACER', 'COMPUTER');
insert into device (device_id, device_name, device_type) values (105, 'Sony Bravia','TV');
insert into device (device_id, device_name, device_type) values (106, 'ASUS','COMPUTER');

insert into device_Owner_Map (device_id, owner_id) values (101, 1);
insert into device_Owner_Map (device_id, owner_id) values (101, 2);
insert into device_Owner_Map (device_id, owner_id) values (101, 3);

insert into device_Owner_Map (device_id, owner_id) values (102, 4);
insert into device_Owner_Map (device_id, owner_id) values (102, 2);
insert into device_Owner_Map (device_id, owner_id) values (102, 6);

insert into device_Owner_Map (device_id, owner_id) values (103, 4);
insert into device_Owner_Map (device_id, owner_id) values (103, 2);

insert into device_Owner_Map (device_id, owner_id) values (104, 6);
insert into device_Owner_Map (device_id, owner_id) values (104, 1);

insert into device_Owner_Map (device_id, owner_id) values (105, 5);

insert into device_Owner_Map (device_id, owner_id) values (106, 3);



