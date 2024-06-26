## Library Management System User Documentation

### Application Overview

**Description:**
The application is a library management system designed to track library items, patrons, and authors. It allows users to manage borrowing and returning of items, view information about items and authors, and maintain records related to library operations.

### Classes and Their Functionality

#### 1. LibraryItem, Book, Periodical Class

- **Description:** Represents a library item such as a book or a magazine.
- **Attributes:**
    - `id`: Unique identifier of the library item.
    - `title`: Title of the library item.
    - `author`: Author associated with the item (an instance of `Author` class).
    - `publisher`: Publisher of the library item.
    - `ISBN`: ISBN number of the library item.
    - `numberOfCopies`: Number of copies available for the library item.
- **Methods:**
    - Getters and setters for attributes.
    - Methods to borrow and return items.

#### 2. Author Class

- **Description:** Represents an author with a name, date of birth, and a list of authored items.
- **Attributes:**
    - `name`: Name of the author.
    - `dateOfBirth`: Date of birth of the author.
    - `items`: List of `LibraryItem` objects authored by the author.
- **Methods:**
    - Getters and setters for attributes.
    - Method to add an item authored by the author.

#### 3. Patron Class

- **Description:** Represents a library patron with basic information and borrowed items.
- **Attributes:**
    - `name`: Name of the patron.
    - `address`: Address of the patron.
    - `phone`: Phone number of the patron.
    - `type`: Type of the patron (student or employee).
    - `borrowedItems`: Map of `LibraryItem` objects and the number of copies borrowed by the patron.
- **Methods:**
    - Getters and setters for attributes.
    - Methods to borrow and return items.
    - Method to get the count of borrowed items for a specific `LibraryItem`.

### How to Start/Access the Application

1. **Starting the Application:**
    - Ensure Java Development Kit (JDK) is installed on your system.
    - Download the application JAVA files or clone the repository from GitHub.

2. **Accessing the Application:**
    - Open a terminal or command prompt.
    - Navigate to the directory where the JAVA files is located.

3. **Running the Application:**
    - Execute the run command in your IDE
    - The application should start and display a command-line interface or graphical user interface (depending on implementation).

### Class Diagram

Below is the class diagram illustrating the associations between classes:

### Class Relationships

| **Class**             | **Related Class** | **Relationship**    |
|-----------------------|-------------------|---------------------|
| LibraryItem           | Author            | one-to-one          |
| LibraryItem           | Patron            | many-to-many        |
| LibraryItem           | Library           | many-to-one         |
| Author                | Library           | many-to-one         |
| Patron                | Library           | many-to-one         |

This class diagram illustrates the relationships between the `LibraryItem`, `Author`, and `Patron` classes:

- **LibraryItem** has an association with **Author** indicating the author of the item.
- **Author** has a list of items they have authored, maintaining a one-to-many relationship with **LibraryItem**.
- **Patron** interacts with **LibraryItem** to borrow and return items, utilizing a map to track borrowed items.

