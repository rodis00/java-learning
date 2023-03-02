import java.io.File;

public class Zad3 {

    public static String[] zwrocPlikiBezRozszerzenia(String track, String extend){

        File file = new File(track);
        return file.list((dir, name) -> !name.endsWith(extend));
    }
}
