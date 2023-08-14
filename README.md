Демо проект "магази цветов". 
Для запуска проекта:
    1 запустить командой docker compose up
    2 Подключиться к БД и создать таблицу и колонки см. ниже

CREATE TABLE Flowers (id int,name varchar,color varchar,count int);
INSERT INTO flowers (id, name, color, count) VALUES (1,'Роза','Красная',3);
INSERT INTO flowers (id, name, color, count) VALUES (2,'Роза','Белая',45);
INSERT INTO flowers (id, name, color, count) VALUES (3,'Тульпан','Желтый',34);
INSERT INTO flowers (id, name, color, count) VALUES (4,'Ромашка','Белая',76);


Какие технологии используются:
    1 spring-boot-starter-web
    2 spring-boot-starter-security
    3 lombok
    4 spring-boot-starter-test
    5 spring-boot-starter-data-jpa
    6 postgresql
    7 docker