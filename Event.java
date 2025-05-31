package planner.model;

import javafx.beans.property.*;
import java.time.LocalDate;

public class Event {
    private final StringProperty title = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();
    private final StringProperty description = new SimpleStringProperty();

    // getters and setters 
    public StringProperty titleProperty() { return title; }
    public String getTitle() { return title.get(); }
    public void setTitle(String v) { title.set(v); }

    public ObjectProperty<LocalDate> dateProperty() { return date; }
    public LocalDate getDate() { return date.get(); }
    public void setDate(LocalDate d) {date.set(d); }

    public StringProperty descriptionProperty() { return description; }
    public String getDescription() { return description.get(); }
    public void setDescription(String d) {description.set(d); }

    // displays title and date for event 
    @Override public String toString() { return getTitle() + " - " + getDate(); }



}
