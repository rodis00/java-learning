import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Zad2Test extends Zad2{

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        LinkedList<LocalTime> linkedList = new LinkedList<>();
        linkedList.add(LocalTime.of(23,23,23));
        linkedList.add(LocalTime.of(22,22,22));
        linkedList.add(LocalTime.of(21,21,21));
        linkedList.add(LocalTime.of(20,20,20));
        linkedList.add(LocalTime.of(19,19,19));

        wypiszCoDrugi(integers);
        System.out.println();
        wypiszCoDrugi(arrayList);
        System.out.println();
        wypiszCoDrugi(linkedList);
    }
}
