package pl.imiajd.sidor;

public class TestOsoba {
    public static void main(String[] args) {

        Osoba person = new Osoba("Koziol", 1990);
        Student student = new Student("Baran", 2001, "administracja i zarzadzanie");
        Nauczyciel teacher = new Nauczyciel("Guzior", 1989, 2240.25f);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(teacher.toString());
    }
}
