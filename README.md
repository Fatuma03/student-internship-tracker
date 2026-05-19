# Student Internship Tracker

## About the Project

The Student Internship Tracker is a Java console application that helps students organize and track their internship applications.

Users can add internship applications, view saved applications, update application statuses, and store application data in a text file.

## Features

- Add internship applications
- View all applications
- Save applications to a file
- Load saved applications when the program starts
- Update application status
- Track company name, position title, date applied, and status
- Simple menu-based console interface

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Scanner
- FileWriter
- File
- File handling
- Git and GitHub

## Current Version

This version supports adding, viewing, saving, loading, and updating internship applications.

Applications are saved in an `applications.txt` file, so the data can still be accessed after closing and reopening the program.

## How to Run

1. Clone or download the repository.
2. Open the project folder in a terminal.
3. Compile the Java files:

```bash
javac Main.java Application.java internshipTracker.java
```

4. Run the program:

```bash
java Main
```

## Example Menu

```text
Student Internship Tracker
1. Add internship application
2. View all applications
3. Update application status
4. Exit
```

## Example Application Entry

```text
RBC | Software Developer Intern | 2026-05-17 | Applied
```

## What I Learned

- How to create and use Java classes
- How to use constructors, getters, setters, and `toString()`
- How to store multiple objects using an `ArrayList`
- How to get user input using `Scanner`
- How to save data using `FileWriter`
- How to load saved data from a text file
- How to use Git and GitHub to track project progress

## Future Improvements

- Delete applications
- Search applications by company or status
- Add input validation
- Improve file format using CSV
- Add a graphical user interface using Java Swing
- Store data in a database
