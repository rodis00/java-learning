import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> tmp = new ArrayList<>(tab);
        Collections.sort(tmp);
        return tab.equals(tmp);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T szukany){
        if(ArrayUtil.isSorted(tab)){
            int lewa = 0;
            int prawa = tab.size() - 1;
            int index = 0;
            while (lewa <= prawa) {
                int srodek = lewa + (prawa - lewa) / 2;
                if (tab.get(srodek).equals(szukany)){
                    index = srodek;
                    break;
                }
                if (tab.get(srodek).compareTo(szukany) < 0)
                    lewa = srodek + 1;
                else
                    prawa = srodek - 1;
                if(lewa == prawa)
                    return -1;
            }
            return index;
        }
        return -1;
    }
}
