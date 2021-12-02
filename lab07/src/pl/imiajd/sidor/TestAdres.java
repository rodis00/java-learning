package pl.imiajd.sidor;

public class TestAdres {
    public static void main(String[] args) {

        Adres adres_1 = new Adres("Iwaszkiewicza", "2a", "Garwolin", "20-100");
        Adres adres_2 = new Adres("Galczynskiego", "8", "23","Olsztyn", "20-100");

        adres_1.pokaz();
        adres_2.pokaz();
        System.out.println(adres_1.przed(adres_2));
    }
}
