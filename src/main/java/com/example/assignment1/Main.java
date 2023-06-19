package com.example.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
    private Stage primaryStage;
    private DatabaseManager databaseManager;
    private Scene1Controller scene1Controller;
    private Scene2Controller scene2Controller;
    private Scene scene1;
    private Scene scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.databaseManager = new DatabaseManager();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        Parent scene1Root = loader.load();
        scene1Controller = loader.getController();
        scene1Controller.setMain(this);
        scene1 = new Scene(scene1Root);

        loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        Parent scene2Root = loader.load();
        scene2Controller = loader.getController();
        scene2Controller.setMain(this);
        scene2 = new Scene(scene2Root);

        setScene1();
        primaryStage.setTitle("Programmer Statistics");
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public void setScene1() {
        List<ProgrammerData> programmerDataList = databaseManager.getAllProgrammerData();
        scene1Controller.setBarChartData(programmerDataList);
        primaryStage.setScene(scene1);
    }

    public void setScene2() {
        List<ProgrammerData> programmerDataList = databaseManager.getAllProgrammerData();
        scene2Controller.setTableData(programmerDataList);
        primaryStage.setScene(scene2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
