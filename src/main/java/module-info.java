module com.example.loginscreen {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.loginscreen to javafx.fxml;
    exports com.example.loginscreen;
}