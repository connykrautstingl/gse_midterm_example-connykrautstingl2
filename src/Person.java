public class Person {

    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }


    public String rechneBMI(int gewicht) {
        double bmi = 0;

        bmi = gewicht / ((koerpergroesse / 100) * (koerpergroesse / 100));

        if (bmi < 18.5) {
            return "Untergewicht";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normalgewicht";
        } else if (bmi >= 25 && bmi < 30) {
            return "Übergewicht";
        } else if (bmi >= 30) {
            return "Adipositas";
        }


    public void printPerson(int gewicht) {

            printPerson
            if (aktivitaetslevel == 1) {
                return "Couch Potato";
            }
            else if (aktivitaetslevel == 2){
                return "Gelegenheitssportler";
            }
            else if (aktivitaetslevel == 3){
                return "Sportler";
            }
            else if (aktivitaetslevel == 4){
                return "Profisportler";
            }
            return "Falsche Eingabe!";

        System.out.println(vorname + " " + nachname + ": " + aktivitaetslevel + " = " + rechneBMI());


    }


}
