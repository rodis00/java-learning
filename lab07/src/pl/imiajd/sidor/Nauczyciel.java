package pl.imiajd.sidor;

public class Nauczyciel extends Osoba{

    private float pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, float pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public int getRokUrodzenia() {
        return super.getRokUrodzenia();
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString() + ", pensja: " + pensja;
        return text;
    }
}
