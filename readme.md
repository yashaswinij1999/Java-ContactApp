# Contact Management Application

---

A Simple command-line contact management app written in Java. We can add, view, search and delete contacts.

## Index

- [Contact Management Application](#contact-management-application)
  - [Index](#index)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Steps to start the app](#steps-to-starttheapp)
  - [Features](#features)
    - [Menu 1](#menu-1)
    - [Menu 2](#menu-2)
  - [Concepts Used](#concepts-used)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Git installed (optional, for cloning the repository).

### Steps to start the app

1. **Clone the repository** (if you have Git installed) or download the repository as a ZIP file and extract it.

   ```
   https://github.com/yashaswinij1999/Java-ContactApp.git
   ```

2. **Navigate to the project directory:**

   ```
   cd Java-ContactApp
   ```

3. **Compile the Java files:**
   ```
   javac ContactApp.java
   ```
4. **Run the application**

   ```
   java ContactApp
   ```

## Features

Once you run the application, you will be presented with a menu to perform the following operations:

### Menu 1

1. **Create ContactApp**: Creates a new instance of ContactApp, which is saved as a new text file.
2. **Load ContactsApp**: Load existing ContactApps and perform CRUD operations on them.
3. **Search ContactApp**: Check if a specific ContactApp exists.
4. **List ContactsApp**: Display a list of all ContactApps.

### Menu 2

1. **Create Contact**: Add a new contact with a name, email, and phone number within selected ContactApp.
2. **List Contacts**: Display all contacts within the selected ContactApp.
3. **Update Contact**: Modify details of an existing contact within the selected ContactApp.
4. **Delete Contact**: Remove a contact from the selected ContactApp.

## Concepts Used

- **OOP Principles**: Utilizes object-oriented programming concepts.
- **Exception Handling**: handling of exceptions to ensure the application runs smoothly.
- **IO Operations**: Uses Java IO to read and write contact information to text files.
- **Threads**: Implements threading for concurrent operations.
- **Singleton Pattern**: Ensures a single instance of the Logger class, where a new thread of execution is created for logging activities, and all logs are written to a single `log.txt` file.
- **Collections**: Utilizes Java collections framework for managing contacts.
- **ContactBean**: A simple JavaBean to represent a contact.
- **MVC1 Design Pattern**: Implements the MVC1 design pattern to separate concerns.
