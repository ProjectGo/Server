drop table if exists "people2events";
drop table if exists "people2groups";
drop table if exists "events";
drop table if exists "groups";
drop table if exists "users";

create table "users"(
  "id" serial primary key, "vkid" text
);

create table "groups"(
  "id" serial primary key, "name" text
);

create table "people2groups"(
  "groupid" int references "groups", "userid" int references "users"
);

create table "events"(
  "id" serial primary key, "name" text, "place" text, "time" text, "groupid" int references "groups"
);

create table "people2events"(
  "eventid" int references "events", "userid" int references "users", "desigion" int
);

insert into "users" values (1, '1');
insert into "users" values (2, '2');
insert into "users" values (3, '3');
insert into "users" values (4, '4');
insert into "users" values (5, '5');
insert into "users" values (6, '6');
insert into "users" values (7, '7');

insert into "groups" values (1, 'group1');
insert into "groups" values (2, 'group2');
insert into "groups" values (3, 'group3');

insert into "people2groups" values (1, 1);
insert into "people2groups" values (1, 2);
insert into "people2groups" values (1, 3);
insert into "people2groups" values (2, 1);
insert into "people2groups" values (2, 4);
insert into "people2groups" values (3, 1);
insert into "people2groups" values (3, 2);
insert into "people2groups" values (3, 6);

insert into "events" values (1, 'event1', 'place1', 'time1', 1);
insert into "events" values (2, 'event2', 'place2', 'time2', 2);
insert into "events" values (3, 'event3', 'place3', 'time3', 3);


insert into "people2events" values (1, 1, 0);
insert into "people2events" values (1, 2, 2);
insert into "people2events" values (1, 3, 1);
insert into "people2events" values (2, 1, 1);
insert into "people2events" values (2, 4, 1);
insert into "people2events" values (3, 1, 2);
insert into "people2events" values (3, 2, 1);
insert into "people2events" values (3, 6, 3);