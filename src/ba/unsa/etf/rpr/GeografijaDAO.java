package ba.unsa.etf.rpr;

import java.sql.Connection;
import java.util.ArrayList;

public class GeografijaDAO {
    private static GeografijaDAO instance = null;
    private Connection conn;

    private GeografijaDAO(){

    }
    private static void initialize(){
        instance = new GeografijaDAO();
    }
    public static void removeInstance(){
        instance = null;
    }
    public static GeografijaDAO getInstance(){
        if(instance == null) initialize();
        return instance;
    }

    Grad glavniGrad(String drzava){
        Grad g = new Grad ();

        return g;
    }
    void obrisiDrzavu(String drzava){}
    void dodajGrad(Grad grad){}
    void izmijeniGrad(Grad grad){}
    Drzava nadjiDrzavu(String drzava){
        Drzava d = new Drzava();

        return d;
    }
    ArrayList<Grad> gradovi(){
        ArrayList<Grad> lista = new ArrayList<>();

        return lista;
    }
}
