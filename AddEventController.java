package planner.controller;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import planner.model.Event;
import javafx.fxml.FXML;

public class AddEventController {

    private EventListController parent;

    public void setParentController(EventListController parent) {
        this.parent = parent;
    }

    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextArea descriptionArea;

    // build event with user input and add to list
    @FXML
    private void handleSave() {
        Event ev = new Event();
        ev.setTitle(titleField.getText());
        ev.setDate(datePicker.getValue());
        ev.setDescription(descriptionArea.getText());

        parent.addEvent(ev);

        Stage thisStage = (Stage) titleField.getScene().getWindow();
        thisStage.close();
    }
}