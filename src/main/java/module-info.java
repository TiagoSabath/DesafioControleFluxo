module com.example.desafiocontrolefluxo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiocontrolefluxo to javafx.fxml;
    exports com.example.desafiocontrolefluxo;
}