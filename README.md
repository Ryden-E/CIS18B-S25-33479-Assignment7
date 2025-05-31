# CIS18B-S25-33479-Assignment7

A JavaFX GUI Application that allows the user to add and view events.
Utilizes multiple FXML views, properties, effects, and animations. 

## Java FX Controls

- **Border Pane**
- **ListView**
- **Button**
- **Vbox**
- **TextField**
- **DatePicker**
- **TextArea**

## Effects and Animations applied

-Blue drop shadow on events within this coming week
  * used `setCellFactory` with an if/else statement that checks if date is within 7 days. If true, add new `DropShadow`.
    
-Fade in effect after adding event
  * uses FadeTransition to increase event opacity from 0-1 over 0.5 seconds

## JavaFX properties for binding

-Used `StringProperty` and `ObjectProperty<LocalDate>` to update UI for title, description, and date

-`ObservableList` bound to `ListView` that redraws UI when event is added automatically

-New event objects are inserted into `ObservableList`, updating `ListView`, updating UI

## How to Run

### Prerequisites

- JDK 17+
- JavaFX 22 SDK
- Maven
  
1. Clone Repository
2. Open project with IDE and make sure SDK is added to projects external libraries
3. Run planner.Main

# Screenshots of Program Running

![image](https://github.com/user-attachments/assets/f74f40a8-d5ca-4524-88c4-2c58cf6ccf94)

![image](https://github.com/user-attachments/assets/fd2cdd15-1f82-400b-a118-d649a3650405)

