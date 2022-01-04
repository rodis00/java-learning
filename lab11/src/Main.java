import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList <LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2000, 12, 12));
        dates.add(LocalDate.of(2000, 11, 11));
        dates.add(LocalDate.of(2000, 5, 5));
        dates.add(LocalDate.of(2000, 6, 6));

        System.out.println(ArrayUtil.isSorted(dates));
        Collections.sort(dates);
        System.out.println(ArrayUtil.isSorted(dates));


        ArrayList <Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(2);
        integers.add(6);
        integers.add(7);

        System.out.println(ArrayUtil.isSorted(integers));
        Collections.sort(integers);
        System.out.println(ArrayUtil.isSorted(integers));

        System.out.println(ArrayUtil.binSearch(dates, LocalDate.of(2000, 11, 11)));
        System.out.println(ArrayUtil.binSearch(integers, 6));


    }
}
