# programmers-analytics-javafx

The Programmer Statistics JavaFX Application is a graphical application that displays statistics about the number of programmers over the years. It retrieves data from a MySQL database and presents it in two different scenes: a bar graph in Scene 1 and a table in Scene 2. The application follows the Model-View-Controller (MVC) design pattern.

## Features

- Display a bar graph showing the number of programmers over the years.
- Show a table with detailed programmer data.
- Switch between Scene 1 and Scene 2 using buttons.
- Fetch data from a MySQL database using the DatabaseManager class.
- Use JavaFX and FXML for the user interface.

## Technologies Used

- Java 8
- JavaFX
- MySQL
- MVC design pattern

## Setup and Installation

1. Clone the repository to your local machine.
2. Make sure you have Java 8 and MySQL installed.
3. Import the project into your preferred Java IDE.
4. Set up the MySQL database and configure the connection details in the `DatabaseManager` class.
5. Make sure the necessary JavaFX libraries are added to the project dependencies.
6. Run the `Main` class to start the application.

## File Structure

The project's file structure is organized as follows:

- `src/` - Contains the Java source code files.
  - `Main.java` - Entry point of the application.
  - `DatabaseManager.java` - Handles the database connection and queries.
  - `ProgrammerData.java` - Represents the programmer data model.
  - `Scene1Controller.java` - Controller for Scene 1 (bar graph scene).
  - `Scene2Controller.java` - Controller for Scene 2 (table scene).
  - `scene1.fxml` - FXML file defining the layout of Scene 1.
  - `scene2.fxml` - FXML file defining the layout of Scene 2.
- `resources/` - Contains the application resources such as FXML files.

## How to Use

1. Upon running the application, Scene 1 will be displayed by default.
2. Scene 1 shows a bar graph representing the number of programmers over the years.
3. Click the "Go to Scene 2" button to navigate to Scene 2.
4. Scene 2 displays a table with detailed programmer data fetched from the database.
5. Click the "Go back to Scene 1" button to return to Scene 1.
6. The bar graph and table will be updated with fresh data each time you switch scenes.

## Contributing

Contributions are welcome! If you have any suggestions, bug fixes, or improvements, please submit a pull request or open an issue.

## License

This project is licensed under the [MIT License](LICENSE).

## Credits

- Developed by Krushil Dhameliya

