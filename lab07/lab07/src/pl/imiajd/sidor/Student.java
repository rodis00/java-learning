package pl.imiajd.sidor;

public class Student extends Osoba{

    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    @Override
    public int getRokUrodzenia() {
        return super.getRokUrodzenia();
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString() + ", kierunek: " + kierunek;
        return text;
    }
}
