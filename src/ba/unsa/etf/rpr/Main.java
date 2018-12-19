package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String ispisiGradove(){
        String temp = new String();
        GeografijaDAO gd = new GeografijaDAO();
        ArrayList<Grad> lista = gd.gradovi();
        int i =lista.size();
        while(i > 0){
            temp += lista.get(i) + "\n";
            i--;
        }
        return temp;
    }
    public static void glavniGrad(){

    }

    public static void main(String[] args) {
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
    }
}
