use adcico_db;

insert into `country`(country)
values
("Spain"),
("Spain"),
("Spain"),
("Spain"),
("Spain");

insert into `city`(city, country_id)
values
("Barcelona",1),
("Barcelona",2),
("Barcelona",3),
("Barcelona",4),
("Barcelona",5);

insert into `address`(address,address2,district,postal_code,phone,location,city_id)
values
("997-7920 Vivamus St.","Tula Oblast","Tula Oblast","1344-1334","(855) 835-8816", "Mali",1),
("997-7920 Vivamus St.","Tula Oblast","Tula Oblast","1344-1334","(855) 835-8816", "Mali",2),
("997-7920 Vivamus St.","Tula Oblast","Tula Oblast","1344-1334","(855) 835-8816", "Mali",3),
("997-7920 Vivamus St.","Tula Oblast","Tula Oblast","1344-1334","(855) 835-8816", "Mali",4),
("997-7920 Vivamus St.","Tula Oblast","Tula Oblast","1344-1334","(855) 835-8816", "Mali",5);