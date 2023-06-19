package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.util.List;

public class Scene2Controller {
    @FXML
    private TableView<ProgrammerData> tableView;
    @FXML
    private Button backButton;

    private Main main;

    @FXML
    private void goBackToScene1(ActionEvent event) {
        main.setScene1();
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setTableData(List<ProgrammerData> programmerDataList) {
        ObservableList<ProgrammerData> data = FXCollections.observableArrayList(programmerDataList);
        tableView.setItems(data);

        TableColumn<ProgrammerData, Integer> yearColumn = new TableColumn<>("Year");
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

        TableColumn<ProgrammerData, Double> numberOfProgrammersColumn = new TableColumn<>("Number of Programmers");
        numberOfProgrammersColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfProgrammers"));

        tableView.getColumns().setAll(yearColumn, numberOfProgrammersColumn);
    }


}


