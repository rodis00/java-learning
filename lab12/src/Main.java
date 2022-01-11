import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Anna");
        pracownicy.add("Joanna");
        pracownicy.add("Jola");
        pracownicy.add("Ala");
        pracownicy.add("Mirka");
        pracownicy.add("Zdzisia");

        System.out.println(pracownicy);
        redukuj(pracownicy, 2);
        System.out.println(pracownicy);

        odwroc(pracownicy);
        System.out.println(pracownicy);

        zad_6(2015);

        sitoEratostenesa(100);

        LinkedList <Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);

        print(liczby);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){

        for(int i = n - 1; i < pracownicy.size(); i += n - 1)
            pracownicy.remove(i);
    }

    public static <T> void odwroc(LinkedList<T> lista){

        int j = 0;
        LinkedList<T> new_list = new LinkedList<>(lista);

        for(int i = lista.size() - 1; i >= 0; i--) {

            lista.set(j, new_list.get(i));
            j++;
        }
    }

    public static void zad_6(int liczba){

        Stack<Integer> stos = new Stack<>();
        while (liczba > 0){
            stos.push(liczba % 10);
            liczba /= 10;
        }
        while (!stos.empty()){
            System.out.print(stos.pop() + " ");
        }
        System.out.println();
    }

    public static void sitoEratostenesa(int liczba) {

        int n = liczba;
        boolean []primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for(int i = 2; i < Math.sqrt(n); i++){
            for(int j = i + i; j < n; j = j + i)
                primes[j] = false;
        }
        for(int i = 0; i < primes.length; i++)
            if (primes[i])
                System.out.println(i);
    }

    public static <T extends Iterable<?>> void print(T object){

        Iterator <?> iterator = object.iterator();
        while (iterator.hasNext()) {

            System.out.print(iterator.next() + ", ");
        }
            System.out.println();
    }
}
