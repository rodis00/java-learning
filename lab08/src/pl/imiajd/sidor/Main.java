package pl.imiajd.sidor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

	    Pracownik pracownik = new Pracownik("Kotowicz", new String[]{"Arek", "Mariusz"}, LocalDate.of(1999, 12, 12), true, LocalDate.of(2002, 6, 9), 2000);
        Student student = new Student("Kabacinska", new String[]{"Zuzanna", "Anna"}, LocalDate.of(2000, 2, 9), false, "medycyna");
        student.setSredniaOcen(5.0);

        System.out.println(pracownik.toString());
        System.out.println(student.toString());
    }
}
