DROP TABLE IF EXISTS "People2Events";
DROP TABLE IF EXISTS "People2Groups";
DROP TABLE IF EXISTS "Events";
DROP TABLE IF EXISTS "Groups";
DROP TABLE IF EXISTS "Users";

CREATE TABLE "Users"(
  "id" SERIAL PRIMARY KEY, "vkId" TEXT
);

CREATE TABLE "Events"(
  "id" SERIAL PRIMARY KEY, "name" TEXT, "place" TEXT, "Time" TEXT
);

CREATE TABLE "People2Events"(
  "EventId" INT REFERENCES "Events", "UserId" INT REFERENCES "Users", "Desition" INT
);

CREATE TABLE "Groups"(
  "id" SERIAL PRIMARY KEY, "name" TEXT
);

CREATE TABLE "People2Groups"(
  "GroupId" INT REFERENCES "Groups", "UserId" INT REFERENCES "Users"
);

INSERT INTO "Users" VALUES (1, '1');
INSERT INTO "Users" VALUES (2, '2');
INSERT INTO "Users" VALUES (3, '3');
INSERT INTO "Users" VALUES (4, '4');
INSERT INTO "Users" VALUES (5, '5');
INSERT INTO "Users" VALUES (6, '6');
INSERT INTO "Users" VALUES (7, '7');

INSERT INTO "Events" VALUES (1, 'Event1', 'Place1', 'Time1');
INSERT INTO "Events" VALUES (2, 'Event2', 'Place2', 'Time2');
INSERT INTO "Events" VALUES (3, 'Event3', 'Place3', 'Time3');


INSERT INTO "People2Events" VALUES (1, 1, 0);
INSERT INTO "People2Events" VALUES (1, 2, 2);
INSERT INTO "People2Events" VALUES (1, 3, 1);
INSERT INTO "People2Events" VALUES (2, 1, 1);
INSERT INTO "People2Events" VALUES (2, 4, 1);
INSERT INTO "People2Events" VALUES (3, 1, 2);
INSERT INTO "People2Events" VALUES (3, 2, 1);
INSERT INTO "People2Events" VALUES (3, 6, 3);

INSERT INTO "Groups" VALUES (1, 'Group1');
INSERT INTO "Groups" VALUES (2, 'Group2');
INSERT INTO "Groups" VALUES (3, 'Group3');

INSERT INTO "People2Groups" VALUES (1, 1);
INSERT INTO "People2Groups" VALUES (1, 2);
INSERT INTO "People2Groups" VALUES (1, 3);
INSERT INTO "People2Groups" VALUES (2, 1);
INSERT INTO "People2Groups" VALUES (2, 4);
INSERT INTO "People2Groups" VALUES (3, 1);
INSERT INTO "People2Groups" VALUES (3, 2);
INSERT INTO "People2Groups" VALUES (3, 6);