## :rocket: Технологии и инструменты

<p align="center">
 <a href="images/search?form=IARRTH&q=intellij+idea&first=1"><img src="https://th.bing.com/th?id=OSK.1092f43f0366fbf2d19494b8553ee2d8&w=148&h=148&c=7&o=6&dpr=1.1&pid=SANGAM" width="50" height="50" alt="IntelliJ IDEA"/></a>
- <a href="https://www.java.com/"><img src="th?id=OIP.ANfN008bhlikSHWZAaVXSAHaHa&w=80&h=80&o=6&dpr=2&pid=5.1" width="50" height="50" alt="Java"/></a>
- <a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50" alt="JUnit 5"/></a>
- <a href="https://spring.io/projects/spring-boot"><img src="images/SpringBoot.svg" width="50" height="50" alt="Spring Boot"/></a>
- <a href="https://spring.io/projects/spring-security"><img src="images/SpringSecurity.svg" width="50" height="50" alt="Spring Security"/></a>
- <a href="https://www.postgresql.org/"><img src="images/PostgreSQL.svg" width="50" height="50" alt="PostgreSQL"/></a>
- <a href="https://projectlombok.org/"><img src="images/Lombok.svg" width="50" height="50" alt="Lombok"/></a>
- <a href="https://www.docker.com/"><img src="images/Docker.svg" width="50" height="50" alt="Docker"/></a></a>
</p>
# Мой Проект Spring Boot Демо  "магази цветов".

Проект на Spring Boot с использованием Spring Security, PostgreSQL, Lombok и Docker.

## Технологии и инструменты

- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Java](https://www.java.com/)
- [JUnit 5](https://junit.org/junit5/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [PostgreSQL](https://www.postgresql.org/)
- [Lombok](https://projectlombok.org/)
- [Docker](https://www.docker.com/)

## Запуск проекта

1. Клонируйте репозиторий на свой локальный компьютер.
2. Откройте проект в IntelliJ IDEA.
3. Убедитесь, что у вас установлены Java, Docker и Docker Compose.
4. Запустите Docker и выполните `docker-compose up -d`.
5. Запустите приложение Spring Boot.
6. Подключиться к БД и создать таблицу и колонки см. ниже

`CREATE TABLE Flowers (id int,name varchar,color varchar,count int);`
`INSERT INTO flowers (id, name, color, count) VALUES (1,'Роза','Красная',3); INSERT INTO flowers (id, name, color, count) VALUES (3,'Тульпан','Желтый',34);`

## Дополнительные ресурсы

- [Документация Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Документация Spring Security](https://docs.spring.io/spring-security/site/docs/current/reference/html5/)
- [Документация PostgreSQL](https://www.postgresql.org/docs/)
- [Документация Lombok](https://projectlombok.org/features/all)
- [Документация Docker](https://docs.docker.com/get-started/)


