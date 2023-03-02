import java.util.Iterator;

public class Zad2 {

    public static <E extends Iterable<?>> void wypiszCoDrugi(E o){
        Iterator<?> iterator = o.iterator();
        int index = 0;
        System.out.print(iterator.next() + ", ");
        String drugi = "";
        while (iterator.hasNext()){
            if(index == 1){
                drugi = iterator.next().toString();
                System.out.print(drugi + ", ");
                index = 0;
            }
            else{
                index++;
                iterator.next();
            }
        }
    }
}
