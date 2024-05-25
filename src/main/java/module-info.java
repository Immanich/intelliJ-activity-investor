module com.javafx.final_activity_investor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.final_activity_investor to javafx.fxml;
    exports com.javafx.final_activity_investor;
}