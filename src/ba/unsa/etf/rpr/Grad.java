package ba.unsa.etf.rpr;

public class Grad {
    private int id;
    private String naziv;
    private int brojStanovnika;
    private Drzava drzava;
    private static int brojGradova = 0;

    Grad(){
        id = 0;
        brojGradova++;
    }

    public Grad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        if(id == -1){
            this.id = brojGradova;
            brojGradova++;

        }
        else this.id = id;

        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
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

    @Override
    public String toString() {
        return naziv + " (" + ( (drzava != null)?drzava.getNaziv() : "nema drzave") + ") - " + brojStanovnika;
    }



}
