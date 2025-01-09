# Employee Management System (EMS)

## Overview

The **Employee Management System (EMS)** is a Spring Boot application designed to manage employee data. It provides RESTful APIs for creating, retrieving, updating, and deleting employee records. T[...]

## Features

- **Add a New Employee:** Create and store new employee records.
- **Retrieve Employee by ID:** Fetch details of a specific employee using their unique ID.
- **Retrieve All Employees:** Get a list of all employees in the system.
- **Update Employee Information:** Modify existing employee details.
- **Delete Employee by ID:** Remove an employee record from the system using their ID.

## Technologies Used

- **Java:** Programming language used for developing the application.
- **Spring Boot:** Framework for building the RESTful APIs.
- **Maven:** Dependency management and build automation tool.
- **PostgreSQL:** Database for storing employee data.
- **RESTful APIs:** Architecture style for designing networked applications.

## Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

- **Java 11** or higher
- **Maven 3.6.0** or higher
- **PostgreSQL** 

### Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/devXpraAddy/ems-backend.git
    ```

2. **Navigate to the Project Directory:**

    ```bash
    cd ems-backend
    ```

3. **Build the Project Using Maven:**

    ```bash
    mvn clean install
    ```

### Running the Application

1. **Navigate to the Target Directory:**

    ```bash
    cd target
    ```

2. **Run the Application:**

    ```bash
    java -jar ems-backend-0.0.1-SNAPSHOT.jar
    ```

## API Endpoints

| **Method** | **Endpoint**               | **Description**                      |
|------------|----------------------------|--------------------------------------|
| `POST`     | `/api/employees`           | Add a new employee                   |
| `GET`      | `/api/employees/{id}`      | Retrieve an employee by ID           |
| `GET`      | `/api/employees`           | Retrieve all employees               |
| `PUT`      | `/api/employees/{id}`      | Update an employee by ID             |
| `DELETE`   | `/api/employees/{id}`      | Delete an employee by ID             |

## License
This project is licensed under the MIT License
