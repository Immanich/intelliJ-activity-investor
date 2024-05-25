package com.javafx.final_activity_investor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private TextField nameField, addressField, phoneField, investmentField, totalLabel;

    @FXML
    private TableView table;

    private ObservableList<Investment> investments;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        investments = FXCollections.observableArrayList(new ArrayList<Investment>());

//        students.add(new Student("Ekloy", "BSCriminal", 4));
//        students.add(new Student("Mico", "BSTagay", 10));
//        students.add(new Student("Kuci", "BSShutdown", 91));

        TableColumn nameCol = new TableColumn<Investment, String>("Name of Investor");
        nameCol.setCellValueFactory(new PropertyValueFactory<Investment, String>("name"));

        TableColumn addressCol = new TableColumn<>("Address");
        addressCol.setCellValueFactory(new PropertyValueFactory<Investment, String>("address"));

        TableColumn phoneCol = new TableColumn<>("Phone Number");
        phoneCol.setCellValueFactory(new PropertyValueFactory<Investment, Integer>("phone"));

        TableColumn investmentAmountCol = new TableColumn<>("Investment Amount");
        phoneCol.setCellValueFactory(new PropertyValueFactory<Investment, Float>("investmentAmount"));

        table.getColumns().add(nameCol);
        table.getColumns().add(addressCol);
        table.getColumns().add(phoneCol);
        table.getColumns().add(investmentAmountCol);


        table.setItems(investments);
    }

    @FXML
    public void submit(ActionEvent event) {
        try {
            Investment i = new Investment(
                    nameField.getText(),
                    addressField.getText(),
                    Integer.parseInt(phoneField.getText()),
                    Float.parseFloat(investmentField.getText())
            );
            investments.add(i);
            computeTotal();
            clearForm();

        } catch(NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    private void computeTotal() {
        float total = 0;
        for(Investment i: investments) {
            total += i.getAmount();
        }

        totalLabel.setText(String.format("%,.2f", total));
    }

    private void clearForm() {
        nameField.setText(null);
        addressField.setText(null);
        phoneField.setText(null);
        investmentField.setText(null);
    }
}