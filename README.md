# Food Delivery System

A platform for users to order food, restaurants to manage orders, and delivery personnel to handle deliveries efficiently.

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

The **Food Delivery System** is designed to streamline the process of ordering, managing, and delivering food. It supports multiple roles:
- **Users**: Browse restaurants, place orders, and track delivery status.
- **Restaurants**: Manage menus and process orders.
- **Delivery Personnel**: Accept and deliver orders.

---

## Features

- **User Account Management**: Sign up, log in, and manage profiles.
- **Restaurant Management**: Add/edit menus, process orders, and manage availability.
- **Order Management**: Real-time order tracking for users and delivery personnel.
- **Payment Integration**: Secure payment handling.
- **Feedback System**: Ratings and reviews for restaurants.

---

## Installation

Follow these steps to set up the project locally:

### Backend Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/aishwxryag/Food-Delivery-System.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd Food-Delivery-System
   ```
3. **Set Up the Database**:
   - Install MySQL on your system.
   - Create a database for the application in MySQL.
   - Update the database credentials in the `src/main/resources/application.properties` file.
4. **Build and Run the Backend**:
   - Use the following command to start the backend:
     ```bash
     ./mvnw spring-boot:run
     ```

### Frontend Setup

1. **Navigate to the Frontend Directory**:
   ```bash
   cd frontend
   ```
2. **Install Dependencies**:
   - Install all required dependencies for the frontend by running:
     ```bash
     npm install
     ```
3. **Start the Frontend Server**:
   - Launch the development server with:
     ```bash
     npm start
     ```

---

## Usage

1. **Access the Application**:
   - Open your browser and navigate to `http://localhost:3000`.

2. **User Workflow**:
   - **Sign Up or Log In**: Register a new account or log in with existing credentials.
   - **Browse and Order**: Explore available restaurants, add items to the cart, and place orders.
   - **Track Orders**: Monitor the status of your placed orders in real time.

3. **Restaurant Workflow**:
   - **Manage Menu**: Add, edit, or remove menu items.
   - **Handle Orders**: View and update the status of incoming orders.

4. **Delivery Workflow**:
   - **Accept Deliveries**: View pending deliveries and assign yourself to them.
   - **Update Status**: Mark orders as delivered once completed.

---

## Technologies Used

- **Frontend**: React.js, HTML, CSS, JavaScript
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
