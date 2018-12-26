package ba.unsa.etf.rpr;

import java.awt.event.ActionEvent;
import java.util.Locale;

public class GUIController {
    public void bosanski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("bs", "BA"));
    }
    public void engleski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("en", "US"));
    }
    public void njemacki(ActionEvent actionEvent){
        Locale.setDefault(new Locale("de", "BA"));
    }
    public void francuski(ActionEvent actionEvent){
        Locale.setDefault(new Locale("fr", "BA"));
    }
}
