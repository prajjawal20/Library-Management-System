Library Management System

Overview
This is a console-based Java application that manages library books in memory using an ArrayList. The system allows users to Add, View, Update, and Delete book records. It simulates basic CRUD operations similar to a database but is implemented using Java collections.

Features
Add Book
Input: Book ID, Title, Author, Quantity
Unique ID enforcement prevents duplicate book entries.
View Books
Display all books with their ID, Title, Author, and Quantity.
Shows a message if no records exist.
Update Book
Search by ID and display current data.
Choose to update Title, Author, Quantity, or All.
Delete Book
Remove a book record by ID.
Works correctly because IDs are unique.
Exit
Close the program safely.

Key Concepts Used
Classes & Objects: Book class to represent book entities.
ArrayList: Stores all book objects dynamically.
Encapsulation: Private fields with getter and setter methods.
Control Structures: Loops, switch-case, and conditionals for menu-driven operations.
Input Handling: Scanner usage and newline consumption for smooth input.
CRUD Operations: Basic Create, Read, Update, and Delete functionality.

How to Run
Open Terminal / Command Prompt and navigate to the folder containing your Java files.

Compile all Java files

javac com/lipilink/*.java
