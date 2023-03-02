import java.time.LocalTime;

public class ArrayUtilTest extends ArrayUtil{
    public static void main(String[] args) {

        Integer[] integers = {5, 4, 3, 4, 5};
        Integer[] niePosortowaneIntegery = {1, 4, 3, 5, 4};

        LocalTime[] localTimes = {
                LocalTime.of(23,23,23),
                LocalTime.of(22,22,22),
                LocalTime.of(21,21,21),
                LocalTime.of(22,22,22),
                LocalTime.of(23,23,23),
        };

        LocalTime[] niePosortowaneLocalTimes = {
                LocalTime.of(23,23,23),
                LocalTime.of(21,21,21),
                LocalTime.of(23,23,23),
                LocalTime.of(20,20,20),
                LocalTime.of(21,21,21),
        };

        System.out.println(jestPalindromem(integers));
        System.out.println(jestPalindromem(niePosortowaneIntegery));
        System.out.println();
        System.out.println(jestPalindromem(localTimes));
        System.out.println(jestPalindromem(niePosortowaneLocalTimes));
    }
}
