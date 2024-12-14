package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.models.BranchManager;

public class BranchManagerController {

    @FXML
    private Label nameLabel;
    @FXML
    private Label branchCodeLabel;

    private BranchManager branchManager;

    // Initialize method will run when the controller is loaded
    public void initialize() {
        branchManager = new BranchManager("John Doe", "B001");
        nameLabel.setText("Name: " + branchManager.getName());
        branchCodeLabel.setText("Branch Code: " + branchManager.getBranchCode());
    }
}
