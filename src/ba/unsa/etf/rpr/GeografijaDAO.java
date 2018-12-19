package ba.unsa.etf.rpr;

import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    private static GeografijaDAO instance = null;
    private Connection conn;

    public GeografijaDAO() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Desktop\\rpr-t9\\src\\baza.db");

            String upit1 = "INSERT INTO main.grad(id, naziv, broj_stanovnika, drzava) " +
                    "VALUES (1, 'Pariz', 2200000, 1)";

            String upit2 = "INSERT INTO grad(id, naziv, broj_stanovnika, drzava) " +
                    "VALUES (2, 'London', 8136000, 2)";

            String upit3 = "INSERT INTO grad(id, naziv, broj_stanovnika, drzava) " +
                    "VALUES (3, 'Bec', 1868000, 3)";

            String upit4 = "INSERT INTO grad(id, naziv, broj_stanovnika, drzava) " +
                    "VALUES (4, 'Manchester', 510746, 2)";

            String upit5 = "INSERT INTO grad(id, naziv, broj_stanovnika, drzava) " +
                    "VALUES (5, 'Graz',  283869, 3)";

            String upit6 = "insert into drzava(id, naziv, glavni_grad) " +
                    "values (1, 'Francuska', 1)";
            String upit7 = "insert into drzava(id, naziv, glavni_grad)" +
                    "values(2, 'United Kingdom', 2)";
            String upit8 = "insert into drzava(id, naziv, glavni_grad)" +
                    "values(3, 'Austrija', 3)";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(upit1);
            stmt.executeUpdate(upit2);
            stmt.executeUpdate(upit3);
            stmt.executeUpdate(upit4);
            stmt.executeUpdate(upit5);
            stmt.executeUpdate(upit6);
            stmt.executeUpdate(upit7);
            stmt.executeUpdate(upit8);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        Grad g = null;
        try {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from main.drzava where naziv = " + drzava);
            if(result == null) return null;

            int id1 = result.findColumn("glavni_grad");
            ResultSet res2 = stmt.executeQuery("select * from main.grad where id = " + id1);
            Grad g1 = new Grad(res2.getString("naziv"), res2.getInt("id") , res2.getInt("brojStanovnika"), res2.getInt("drzava"));

            g = g1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return g;
    }

    void obrisiDrzavu(String drzava){}
    void dodajGrad(Grad grad){
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate("insert into grad (id, naziv, broj_stanovnika, drzava) values (" + grad.getId() +", " + grad.getNaziv() + ", " + grad.getBrojStanovnika() +
                    ", " + grad.getDrzava() + ")");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    void dodajDrzavu(Drzava drzava){}
    void izmijeniGrad(Grad grad){}
    Drzava nadjiDrzavu(String drzava){
        Drzava d = null;

        return d;
    }
    ArrayList<Grad> gradovi(){
        ArrayList<Grad> lista = new ArrayList<>();

        return lista;
    }
}
