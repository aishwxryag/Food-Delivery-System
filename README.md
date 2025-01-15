# Food Delivery System

A platform for users to order food and restaurants to manage orders.

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Overview

The **Food Delivery System** is designed to streamline the process of ordering food by users and managing food by restaurants. It supports multiple roles:
- **Users**: Browse restaurants, place orders, and track delivery status.
- **Restaurants**: Manage menus and process orders.

---

## Features

- **Restaurant Management**: Add/edit menus, process orders, and manage availability.
- **Order Management**: Real-time order tracking for users and delivery personnel.

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
- **Other Tools**: Node.js, Maven, npm

---

## Contributing

We welcome contributions to this project. Here’s how you can help:

1. **Fork the Repository**:
   - Click the "Fork" button at the top right of this repository.
2. **Create a New Branch**:
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. **Make Changes**:
   - Implement your feature or fix bugs.
4. **Commit Changes**:
   ```bash
   git commit -m "Add feature: YourFeatureName"
   ```
5. **Push to GitHub**:
   ```bash
   git push origin feature/YourFeatureName
   ```
6. **Submit a Pull Request**:
   - Open a pull request from your forked repository to this repository.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

## Acknowledgments

- Inspired by various online food delivery systems.
- Special thanks to all contributors and open-source resources.

---
