module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    
    opens planner to javafx.graphics;

    opens planner.controller to javafx.fxml;

    exports planner.controller to javafx.fxml;

    exports planner;
    exports planner.model;
}
