# Spring MVC Practice Project

This repository contains a Spring MVC project for practice and learning purposes. It demonstrates the fundamental concepts of the Spring MVC framework.

## Features

* Basic Spring MVC setup.
* Controller mapping and request handling.
* View resolution (JSP).
* Data binding and form handling.
* Basic database interaction with Spring Data JPA (MySQL).

## Technologies Used

* [Spring Boot](https://spring.io/projects/spring-boot):  Simplifies Spring development.
* [Spring MVC](https://spring.io/projects/spring-framework):  The Model-View-Controller framework.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa):  Simplifies database access.
* [Hibernate](https://hibernate.org/):  ORM (Object-Relational Mapping) framework.
* [MySQL](https://www.mysql.com/):  Relational database.
* [JSP](https://jakarta.ee/specifications/servlet/5.0/jakarta-servlet-5.0.html): JavaServer Pages for creating dynamic web pages.
* [Maven](https://maven.apache.org/): Build tool.

## Prerequisites

* [Java JDK](https://www.oracle.com/java/technologies/downloads/):  Version 17 or higher.
* [MySQL](https://www.mysql.com/downloads/):  MySQL server installed and running.
* [Git](https://git-scm.com/):  For cloning the repository.
* [Maven](https://maven.apache.org/download.cgi):  Maven installed.
* An IDE (Optional):  [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [Spring Tool Suite](https://spring.io/tools)

## Setup and Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/tarbipyakurel21/SpringMVC-practice.git](https://github.com/tarbipyakurel21/SpringMVC-practice.git)
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd SpringMVC-practice
    ```

3.  **Create a MySQL database:**
    * Create a database named `terobau` in your MySQL server.
    * Modify the `application.properties` file:
        * Set the correct `spring.datasource.username`, `spring.datasource.password`, and `spring.datasource.url` to match your MySQL configuration.  The provided `application.properties` has:
            ```properties
            spring.datasource.url=jdbc:mysql://localhost:3306/terobau
            spring.datasource.username=root
            spring.datasource.password=@saibaba
            ```
        * Ensure that the database name in the URL (`terobau`) matches the name of the database you created.
        * If your MySQL server is running on a different host or port, adjust the URL accordingly.

4.  **Build and run the application:**
    * Using Maven:
        ```bash
        ./mvnw spring-boot:run
        ```
    * The application will be accessible at `http://localhost:8080`.

## Project Structure

The project structure is a standard Spring MVC Maven project:

```
SpringMVC-practice/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tarbi/springmvcboot/
│   │   │       ├── controller/
│   │   │       ├── dao/
│   │   │       ├── model/
│   │   │       └── SpringMvcApplication.java (Main class)
│   │   ├── resources/
│   │   │   ├── application.properties (Database configuration)
│   │   │   └── templates/       (Thymeleaf templates)
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── jsp/           (JSP views)
```

##  Key Components

* **Controller:** Handles user requests and interacts with the model.
* **Model:** Represents the data of the application.
* **View:** Displays the data to the user (JSP pages).
* **Spring Data JPA:** Manages the interaction with the MySQL database.

##  Further Development

* Implement more features.
* Add unit and integration tests.
* Improve the user interface.
* Implement proper error handling.
* Add security.

"""
