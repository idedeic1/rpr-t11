package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GeografijaDAO.getInstance();
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
        GeografijaDAO.removeInstance();
    }

    public static void glavniGrad() {
        System.out.println("Unesite ime drzave: ");
        Scanner sc = new Scanner(System.in);
        String drzava = sc.next();
        Grad grad = GeografijaDAO.getInstance().glavniGrad(drzava);

        if(grad == null) {
            System.out.println("Nepostojeća država");
            return;
        }

        System.out.println("Glavni grad države " + drzava + " je " + grad.getNaziv() + ".");
    }

    public static String ispisiGradove() {
        ArrayList<Grad> gradovi = GeografijaDAO.getInstance().gradovi();
        String toRet = "";
        for(Grad g : gradovi) {
            toRet += g + "\n";
        }
        return toRet;
    }
}
