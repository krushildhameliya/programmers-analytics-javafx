package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.List;

public class Scene1Controller {
    @FXML
    private BarChart<String, Double> barChart;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private NumberAxis yAxis;

    private Main main;

    public void initialize() {
        // Initialize the bar chart
        xAxis.setLabel("Year");
        yAxis.setLabel("Number of Programmers (in millions)");
    }

    @FXML
    private void goToScene2(ActionEvent event) {
        main.setScene2();
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setBarChartData(List<ProgrammerData> programmerDataList) {
        XYChart.Series<String, Double> series = new XYChart.Series<>();
        for (ProgrammerData programmerData : programmerDataList) {
            series.getData().add(new XYChart.Data<>(String.valueOf(programmerData.getYear()), programmerData.getNumberOfProgrammers()));
        }

        // Clear existing data in the bar chart
        barChart.getData().clear();

        // Add the new series to the bar chart
        barChart.getData().add(series);
    }

}
