package pl.imiajd.sidor;

public class Adres {

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    void pokaz(){
        System.out.println("kod pocztowy: " + kod_pocztowy + "\tmiasto: " + miasto);
        System.out.println("ulica: " + ulica + ", numer domu: " + numer_domu + ", numer mieszkania: " + numer_mieszkania);
        System.out.println();
    }

    public boolean przed(Adres adres1){
        if(this.kod_pocztowy.equals(adres1.kod_pocztowy))
            return true;
    return false;
    }
}
