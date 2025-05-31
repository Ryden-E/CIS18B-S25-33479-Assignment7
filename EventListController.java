package planner.controller;

import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import planner.model.Event;
import java.io.IOException;
import java.time.LocalDate;
import javafx.fxml.FXML;

public class EventListController {

    private final ObservableList<Event> events = FXCollections.observableArrayList();
    public ObservableList<Event> getEvents() { return events; }
    public void addEvent(Event e) { events.add(e); playAddAnimation(); }
    
    @FXML private ListView<Event> eventList;

    @FXML
    private void initialize() {
        eventList.setItems(events);

        // highlight upcoming events
        eventList.setCellFactory(list -> new javafx.scene.control.ListCell<>() {
            @Override protected void updateItem(Event ev, boolean empty) {
                super.updateItem(ev, empty);
                if (empty || ev == null) { setText(null); setEffect(null); }
                else {
                    setText(ev.toString());
                    if (ev.getDate() != null &&
                        !ev.getDate().isBefore(LocalDate.now()) &&
                        ev.getDate().isBefore(LocalDate.now().plusDays(7))) {
                        setEffect(new DropShadow(20, 5, 5, Color.DODGERBLUE));
                    } else setEffect(null);
                }
            }
    });
}

// add event button setup 
@FXML
private void showAddEvent() throws IOException {
    FXMLLoader loader =
        new FXMLLoader(getClass().getResource("/fxml/AddEventView.fxml")); // load add event fxml
    Parent root = loader.load();

    AddEventController addEventController = loader.getController();
    addEventController.setParentController(this);

    Stage dialog = new Stage();
    dialog.initOwner(eventList.getScene().getWindow());
    dialog.initModality(Modality.APPLICATION_MODAL);
    dialog.setScene(new Scene(root));
    dialog.setTitle("Add Event");
    dialog.show();
}

// fade in animation when event is added
public void playAddAnimation() {
    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), eventList);
    ft.setFromValue(0);
    ft.setToValue(1);
    ft.play();
}
}