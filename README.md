# Library Management System

This is a Java-based Library Management System that allows managing various media types such as books, journals, and movies. The system facilitates lending media to clients, maintaining a database for clients, and tracking the items each client has borrowed. It also demonstrates key principles of object-oriented programming (OOP) such as class design, inheritance, polymorphism, and more.

## Features

- **Media Management**: Add, remove, or update books, journals, and movies in the library.
- **Client Database**: Maintain a database of clients registered with the library.
- **Lending System**:
  - Lend items to clients.
  - View the media items a client has borrowed.
  - Track the current status of each media item.
- **Detailed Reports**:
  - Generate a list of all lent items.
  - Display all items borrowed by a specific client.

## Object-Oriented Programming Concepts Utilized

- **Design of Classes**: Modular design with clear separation of concerns.
- **Inheritance and Polymorphism**: Media items (books, journals, movies) extend a base `Media` class.
- **Abstract Classes and Interfaces**: Abstract classes and interfaces are used for reusable and extendable code.
- **Static and Dynamic Binding**: Demonstrates method overloading and overriding.
- **Exception Handling**: Handles errors gracefully, such as invalid input or database connectivity issues.
- **File I/O**: Reads and writes data to files for persistence.
- **Recursion**: Used in specific utility methods, such as searching or file management.
- **Generics and Collections**: Utilizes Java's `List`, `Map`, and iterators for managing collections of clients and media.
- **Graphical User Interfaces (Optional)**: Can be extended to include a GUI using Swing or JavaFX.

## Prerequisites

Before running the project, ensure you have the following:

- Java Development Kit (JDK) 8 or higher.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or Visual Studio Code with Java extensions.
- A database management system (e.g., SQLite or MySQL) or an embedded database (e.g., H2) for client and media data storage.

## Usage

1. **Add Clients and Media**:
   - Register new clients and add media items to the library.

2. **Lend Media**:
   - Use the system to lend items to a client.

3. **Track Borrowed Items**:
   - Check the items a specific client has borrowed.
   - View all items currently on loan.

4. **Return Media**:
   - Mark items as returned once a client brings them back.

---

Enjoy using the Library Management System!
