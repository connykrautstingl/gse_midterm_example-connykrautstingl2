package orga.campus02.krautstingl.thirdpackage;

import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {

    private String artikelname;
    private double preis;


    public EinkaufslisteApp(String artikelname, double preis) {
        this.artikelname = artikelname;
        this.preis = preis;
    }

    public String getArtikelname() {
        return artikelname;
    }

    public double getPreis() {
        return preis;
    }


    public static double sum(ArrayList<Einkauf> einkaufsliste){

    }


    public static double sum(HashSet<Einkauf> einkaufsliste) {

    }


    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufslise){

    }


}
