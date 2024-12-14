package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.models.Customer;

public class CustomerController {

    @FXML
    private Label nameLabel;
    @FXML
    private Label customerIdLabel;

    private Customer customer;

    // Initialize method will run when the controller is loaded
    public void initialize() {
        customer = new Customer("Jane Doe", "C123");
        nameLabel.setText("Name: " + customer.getName());
        customerIdLabel.setText("Customer ID: " + customer.getCustomerId());
    }
}
