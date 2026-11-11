# Online Shopping Management System

A Java-based Online Shopping Management System developed using Java Swing, JDBC, and MySQL. The application provides separate functionalities for customers, administrators, and suppliers to manage shopping activities.

## Features

- **User Module:** Browse products and manage shopping activities.
- **Admin Module:** Manage products and oversee system operations.
- **Supplier Module:** Manage supplier-related activities.
- **Database Connectivity:** Store and retrieve application data using MySQL.
- **User Interface:** Desktop interface developed using Java Swing.

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- NetBeans IDE

## Project Structure

```text
Online Shopping/
├── src/
│   ├── admin/
│   ├── supplier/
│   ├── user/
│   ├── connection/
│   ├── dao/
│   └── icons/
├── nbproject/
├── build.xml
├── manifest.mf
└── README.md
```

## Prerequisites

- Java Development Kit (JDK)
- NetBeans IDE
- MySQL Server
- MySQL JDBC Driver

## Setup and Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/tejashwinim12/Online-Shopping-System.git
   ```

2. Open the project in NetBeans IDE.

3. Create a MySQL database named `online_shopping`.

4. Configure your database username and password using environment variables:
   - `DB_USERNAME`
   - `DB_PASSWORD`

5. Ensure the MySQL JDBC driver is available to the project.

6. Build and run the project using NetBeans.

## Database Configuration

The application uses MySQL for storing project data. Configure your local database credentials through environment variables. Do not add actual passwords or sensitive credentials to the source code.

## Author

**Project:** Online Shopping Management System

**GitHub:** [tejashwinim12](https://github.com/tejashwinim12)