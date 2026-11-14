# Library Management System

A console-based Library Management System developed using **Java** and **Object-Oriented Programming (OOP)** principles.

## About the Project

This project is designed to manage basic library operations through a simple console interface. It provides separate access for administrators and students, allowing books to be managed and borrowed efficiently.

## Features

### Admin
- Admin login
- Add new books
- Display all books
- Search for books by ID
- Remove books

### Student
- Student registration
- Student login
- Display available books
- Search for books by ID
- Borrow books
- Return borrowed books

### Additional Functionality
- Separate admin and student menus
- Duplicate book ID prevention
- Duplicate student username prevention
- Book availability tracking
- Borrower ownership verification
- Login validation

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- IntelliJ IDEA

## OOP Concepts Demonstrated

- **Encapsulation:** Protecting data using private fields and getters/setters.
- **Inheritance:** Admin and Student classes inherit from the User class.
- **Abstraction:** The User class is abstract and defines a common structure for its subclasses.
- **Polymorphism:** Admin and Student provide their own implementations of the `showMenu()` method.

## Future Improvements

The project can be expanded with the following features:

- **Database Integration:** Store books and student information permanently instead of using temporary in-memory storage.
- **Graphical User Interface (GUI):** Replace the console interface with a user-friendly graphical interface.
- **Book Categories:** Organize books by categories, genres, or subjects.
- **Advanced Search:** Search for books using titles, authors, or categories.
- **Borrowing History:** Maintain records of previously borrowed and returned books.
- **Due Dates and Fine Calculation:** Introduce borrowing deadlines and overdue fine calculations.
- **Admin Account Management:** Allow administrators to change login credentials and manage accounts.
- **Improved Input Validation:** Handle invalid inputs and unexpected situations more effectively.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a compatible Java JDK is configured.
4. Run `Main.java`.

## Project Status

The core console-based functionality has been implemented and tested. Additional improvements may be introduced in future versions.

---

**Developed as a Java OOP project.**