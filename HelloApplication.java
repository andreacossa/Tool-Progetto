package org.example.tool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;

public class HelloApplication extends Application {

    private DatabaseConnection db = new DatabaseConnection();
    Connection connection = db.getConnection();



    @Override
    public void start(Stage stage) throws IOException {

        stage.show();



        String risultato = db.selectById(43);
        if (risultato != null) {
            System.out.println(risultato);
        } else {
            System.out.println("Nessun record trovato");
        }

db.delete("federico","sodigas");




    }

    public static void main(String[] args) {
        launch();
    }



}



