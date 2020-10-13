# MySpringBoot Server - Spring Boot, MySQL, JPA, Hibernate Rest API

REST API and Database Handler for MySpringBoot App. 

## Tech Stack

1. Java (SpringBoot)

2. JPA, Hibernate

3. MySQL

## Steps for Application Setup

**1. Clone the application**

```bash
git clone https://github.com/Cryptonex7/--template-MySpringBootApp.git
```

**2. Create MySQL database**
```bash
create database test_db
```

**3. Change MySQL username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

You can find the API Documentation at <http://localhost:8080/docs>
