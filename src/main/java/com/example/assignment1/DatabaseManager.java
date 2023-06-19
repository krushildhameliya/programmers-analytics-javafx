package com.example.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/assignment1";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Krushil27@";

    public List<ProgrammerData> getAllProgrammerData() {
        List<ProgrammerData> programmerDataList = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM programmers");

            while (resultSet.next()) {
                int year = resultSet.getInt("year");
                double numberOfProgrammers = resultSet.getDouble("number_of_programmers");
                ProgrammerData programmerData = new ProgrammerData(year, numberOfProgrammers);
                programmerDataList.add(programmerData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return programmerDataList;
    }
}
