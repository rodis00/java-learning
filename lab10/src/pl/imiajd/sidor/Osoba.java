package pl.imiajd.sidor;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Comparable <Osoba>, Cloneable{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.nazwisko+", "+this.dataUrodzenia.toString()+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    public int compareTo(Osoba o) {
        int compare_nazwisko = this.nazwisko.compareTo(o.nazwisko);
        if(compare_nazwisko == 0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare_nazwisko;
    }
}
