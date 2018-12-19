package ba.unsa.etf.rpr;

public class Grad {
    private String naziv;
    private int id;
    private int brojStanovnika;
    private int drzavaId;

    public Grad(String naziv, int id, int brojStanovnika, int drzavaId) {
        this.naziv = naziv;
        this.id = id;
        this.brojStanovnika = brojStanovnika;
        this.drzavaId = drzavaId;
    }

    public int getDrzava() {
        return drzavaId;
    }

    public void setDrzava(int drzava) {
        this.drzavaId = drzava;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
