package ba.unsa.etf.rpr;

public class Drzava {
    private int id;
    private String naziv;
    private Grad glavniGrad;
    private static int brojDrzava = 0;

    public Drzava(){
        id = brojDrzava;
        brojDrzava++;
    }
    public Drzava(int id, String naziv, Grad glavniGrad) {
        if(id == -1){
            this.id = brojDrzava;
            brojDrzava++;
        }
        else this.id = id;

        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
