# Food Delivery System

A platform for users to order food and restaurants to manage orders.

[Click here to watch the video](https://drive.google.com/file/d/1D1-OZ0YeW1pjVq4iuBX13ZiSLtpKy8GN/view?usp=drive_link)

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Acknowledgments](#acknowledgments)

---

## Overview

The **Food Delivery System** is designed to streamline the process of ordering food by users and managing food by restaurants. It supports multiple roles:
- **Users**: Browse restaurants, place orders, and track delivery status.
- **Restaurants**: Manage menus and process orders.

---

## Features

- **Food Menu Management**:
  - Add, retrieve, and view food items with details like name, description, price, and quantity.
  - Check food item availability based on requested quantity.
  
- **Order Management**:
  - Place orders after validating food item availability.
  - Retrieve all orders and manage order statuses.

- **Microservice Communication**:
  - **Feign Client**: Orders Service communicates with Food Menu Service for real-time inventory checks.
  - **Eureka Server**: Facilitates dynamic service discovery and scalability.

- **Centralized Service Registry**:
  - Monitor service health and availability using the Eureka Dashboard.

- **Database Integration**:
  - MySQL databases for separate services:
    - `foodServiceDb` for food items.
    - `orderServiceDb` for order data.

- **Testing and Validation**:
  - Test individual services and inter-service communication using Postman.
  - Handle errors like insufficient food item quantity during order placement.

- **Modular and Scalable**:
  - Independent services allow easy scaling and future additions like a payment service.

---

## Installation

Follow these steps to set up the project locally:

### Set Up MySQL Databases

1. Open phpMyAdmin or any MySQL client.
2. Create two databases:
   - `foodServiceDb` for the Food Menu Service.
   - `orderServiceDb` for the Orders Service.

### Start the Eureka Server

1. Navigate to the Eureka Server project in your IDE.
2. Run the application (`EurekaApplication.java`).
3. Verify that the Eureka Dashboard is available at:
   ```
   http://localhost:8761
   ```

### Start Microservices

#### Food Menu Service
1. Navigate to the Food Menu Service project in your IDE.
2. Run the application (`FoodServiceApplication.java`).
3. Verify that the service is registered in Eureka (accessible via the Eureka Dashboard).

#### Orders Service
1. Navigate to the Orders Service project in your IDE.
2. Run the application (`OrderServiceApplication.java`).
3. Verify that the service is also registered in Eureka.

---

## Usage

### Test the System

Use Postman or a similar tool to test the functionality of the system.

#### Food Menu Service Endpoints
- **Get all food items**:
  ```
  GET http://localhost:8081/fooditems/getAll
  ```
- **Add a food item**:
  ```
  POST http://localhost:8081/fooditems/add
  ```
- **Get a specific food item**:
  ```
  GET http://localhost:8081/fooditems/{id}
  ```
  Replace `{id}` with the actual food item ID.
- **Check availability of a food item**:
  ```
  GET http://localhost:8081/fooditems/{id}/check-availability?quantity=5
  ```
  Replace `{id}` with the actual food item ID.

#### Orders Service Endpoints
- **Get all orders**:
  ```
  GET http://localhost:8082/orders/getAll
  ```
- **Place an order**:
  ```
  POST http://localhost:8082/orders/place
  ```

### Verify Microservice Communication

1. Place an order via the Orders Service.
2. Check that the Orders Service communicates with the Food Menu Service to validate food item availability.
3. Confirm the results:
   - Food item quantity decreases if the order is successfully placed.
   - The order is saved in the Orders Service database.

### Stop Services

1. Stop the applications in your IDE once you are done testing.
2. Shut down the Eureka Server.

---

## Technologies Used

- **Backend**: Spring Boot, Hibernate, MySQL
- **Other Tools**: Node.js, Maven, npm, Spring Cloud Feign, Postman, IntelliJ IDEA

---

## Acknowledgments

- Inspired by various online food delivery systems.
- Special thanks to all open-source resources.

---
