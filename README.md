# Spring Boot Machine Test – Category & Product Management

This is a Spring Boot application developed as part of a machine test. The application implements CRUD operations for **Category** and **Product** entities, including a **one-to-many relationship** (One Category → Many Products). It also includes **server-side pagination** and uses **MySQL** as the database.

---    

## 🚀 Technologies Used

- Java 17 (or compatible version)
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (RDBMS)
- RESTful Web Services
- Maven

---

## ✅ Features

### 📁 Category APIs
- `GET /api/categories?page=0` – Fetch paginated list of categories
- `POST /api/categories` – Create a new category
- `GET /api/categories/{id}` – Get category by ID
- `PUT /api/categories/{id}` – Update category by ID
- `DELETE /api/categories/{id}` – Delete category by ID
- `GET/api/categories/{id}`- Fetch the data from id

### 📦 Product APIs
- `GET /api/products?page=0` – Fetch paginated list of products
- `POST /api/products` – Create a new product
- `GET /api/products/{id}` – Get product by ID (includes category details)
- `PUT /api/products/{id}` – Update product by ID
- `DELETE /api/products/{id}` – Delete product by ID
- `GET/api/products/{id}`- Fetch the data from id

---

## 🔗 Entity Relationship

- **One-to-Many:** One Category can have multiple Products.
- While fetching a **Product**, the related **Category details** are also returned in the response.

---

## 🗃️ Database Configuration

**Database Used:** MySQL  
Update the credentials and database name in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/Nimapmachinetest
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
