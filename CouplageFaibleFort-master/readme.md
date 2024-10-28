# TP: Atelier Couplage Fort Vs Couplage Faible

## Description

This TP focuses on comparing **tight coupling** and **loose coupling** through the development of a student management application. The application allows you to add, update, and retrieve student information using different storage methods (list and dictionary).

The project is divided into three parts:
1. **Static Instantiation**: Basic implementation using a list for student storage.
2. **Application Extension**: Replace the list with a dictionary for storage.
3. **Dynamic Instantiation**: Dynamically choose the storage method and extend services like updating student information.

## Project Structure

The project is organized into three packages:
- `dao` : Data Access Object for student data.
- `metier` : Business logic layer.
- `presentation` : Main interface to launch the application.

### Key Classes
- **`Etudiant`**: Class representing a student with `id`, `nom`, `prenom`, and `email`.
- **`EtudiantDAO`**: DAO class using a list to store students.
    - `List<Etudiant> etudiants`: Stores the students.
    - `public Etudiant addEtudiant(Etudiant etudiant)`: Adds a new student.
    - `public List<Etudiant> getAllEtudiants()`: Retrieves all students.
- **`EtudiantDAODictionary`**: Alternative DAO class using a `Map<String, Etudiant>`.
- **`EtudiantManager`**: Handles business logic using the DAO.
    - `addEtudiant(Etudiant etudiant)`: Adds a student after verifying the email.
    - `getAllEtudiants()`: Retrieves all students.

## Setup

### Prerequisites

- **Java SDK** (latest version).
- **IntelliJ IDEA** as the IDE.

### Installation Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/votre-utilisateur/tp-gestion-etudiants.git
   
2. Open IntelliJ IDEA.
3. Navigate to `File > Open...`.
4. Select the cloned repository directory and click `Open`.
5. IntelliJ will detect it as a Maven/Gradle project if applicable and prompt you to import dependencies (click `Import` if needed).
6. Once the project is open, wait for IntelliJ to index and load the project structure.

## Run the project

1. Locate the `MainDictionary` class in the `presentation` package (which contains the main method and the last version of the application).
2. Right-click on the `MainDictionary.java` file and select `Run 'MainDictionary.main()'`.
3. Alternatively, open the file and click the green Run arrow next to the main method.

The application will compile and execute, adding and testing students.

## TP Breakdown

### 🟢 Part 1: Static Instantiation

1. Create a new project in IntelliJ.
2. Create the following packages: `dao`, `metier`, and `presentation`.

In the `dao` package:
- Create the `Etudiant` class with `id`, `nom`, `prenom`, and `email` attributes.
- Create the `EtudiantDAO` class with a list of students (`List<Etudiant>`) and methods to add and retrieve students.

In the `metier` package:
- Create the `EtudiantManager` class, which will interact with `EtudiantDAO` to manage students.
- Implement `addEtudiant()` to add students and `getAllEtudiants()` to retrieve all students.

In the `presentation` package:
- Add a `Presentation` class containing the main method.
- In `main()`, instantiate `EtudiantManager` and add 4 students to test the application.

### 🟢 Part 2: Application Extension

1. Create the `EtudiantDAODictionary` class in the `dao` package, using a `Map<String, Etudiant>` to store students by their id.
2. Modify the `EtudiantManager` class to use `EtudiantDAODictionary` instead of `EtudiantDAO`.
3. Refactor methods in `EtudiantManager` to interact with the new dictionary-based implementation.

### 🟢 Part 3: Dynamic Instantiation

In this part, propose a solution to dynamically choose between `EtudiantDAO` (list-based) and `EtudiantDAODictionary` (dictionary-based) by implementing a common DAO interface. This design ensures weak coupling, allowing both `EtudiantDAO` and `EtudiantDAODictionary` to implement this interface, which decouples the `EtudiantManager` from specific DAO implementations.

1. **Create a DAO Interface:** Define an interface that outlines the methods for adding and retrieving students.
2. **Implement the Interface:** Ensure that both `EtudiantDAO` and `EtudiantDAODictionary` implement the methods specified in the interface.
3. **Refactor EtudiantManager:** Update the `EtudiantManager` class to depend on the DAO interface, allowing it to work with any DAO implementation without being tied to a specific one.

### Add Update Functionality

Enhance the application by implementing an update method in both `EtudiantDAO` and `EtudiantDAODictionary`. This method should allow the modification of attributes such as `nom`, `prenom`, and `email`, while keeping the student ID unchanged.

## Usage

- **Add a Student:** Use the method in `EtudiantManager` to add a new student to either the list or dictionary storage.
- **Retrieve All Students:** Call the method to get all students from the chosen storage.
- **Update a Student:** Utilize the update method to modify a student's details while retaining their ID.
