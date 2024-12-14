package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a TabPane to hold multiple views
        TabPane tabPane = new TabPane();

        // Load BranchManagerView.fxml
        FXMLLoader branchManagerLoader = new FXMLLoader();
        branchManagerLoader.setLocation(getClass().getResource("/fxml/BranchManagerView.fxml"));
        AnchorPane branchManagerView = branchManagerLoader.load();
        Tab branchManagerTab = new Tab("Branch Manager", branchManagerView);  // Set title for this tab

        // Load CustomerView.fxml
        FXMLLoader customerLoader = new FXMLLoader();
        customerLoader.setLocation(getClass().getResource("/fxml/CustomerView.fxml"));
        AnchorPane customerView = customerLoader.load();
        Tab customerTab = new Tab("Customer", customerView);  // Set title for this tab

        // Add tabs to TabPane
        tabPane.getTabs().addAll(branchManagerTab, customerTab);

        // Set the Scene with the TabPane
        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Branch Manager and Customer View");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
