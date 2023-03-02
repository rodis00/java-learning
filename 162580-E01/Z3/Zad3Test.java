import java.util.Arrays;

public class Zad3Test extends Zad3{
    public static void main(String[] args) {

        String track = "";
        String extend = ".jpg";

        String[] files = zwrocPlikiBezRozszerzenia(track, extend);
        System.out.println(Arrays.toString(files));
    }
}
