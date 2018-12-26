package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class GUIController {
    public BorderPane glavna;

    private void selectLanguage(Locale locale) {
        Stage primaryStage = (Stage)glavna.getScene().getWindow();
        Locale.setDefault(locale);
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI.fxml"), bundle);
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(400);
    }
    public void bosanski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("bs", "BA"));
    }
    public void engleski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("en", "US"));
    }
    public void njemacki(ActionEvent actionEvent){
        Locale.setDefault(new Locale("de", "DE"));
    }
    public void francuski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("fr", "FR"));
    }
    public void saveAs(ActionEvent actionEvent){
        String format = new String();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save AS");
        //Stage stage = (Stage)
        //fileChooser.showOpenDialog(stage);
    }
    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}
