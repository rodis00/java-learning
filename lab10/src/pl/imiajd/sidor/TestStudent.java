package pl.imiajd.sidor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent{
    public static void main(String[] args) {

        ArrayList<Student> grupa = new ArrayList<>();

        grupa.add(new Student("Januszkiewicz", LocalDate.of(2000, 12, 12), 3.0));
        grupa.add(new Student("Januszkiewicz", LocalDate.of(1999, 11, 11), 2.0));
        grupa.add(new Student("Kot", LocalDate.of(2000, 1, 18), 4.0));
        grupa.add(new Student("Sidor", LocalDate.of(2000, 1, 18), 4.0));
        grupa.add(new Student("Brzeczyszczykiewicz", LocalDate.of(1939, 8, 31), 3.5));

        for(Student student : grupa)
            System.out.println(student.toString());

        Collections.sort(grupa);
        System.out.println();

        for(Student student : grupa)
            System.out.println(student.toString());
    }
}
