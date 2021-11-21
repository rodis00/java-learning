import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class lab_05 {

    public static void main(String[] args) {

	    ArrayList <Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

	    ArrayList <Integer> b = new ArrayList<>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.print("a = ");
        show_array(a);

        System.out.print("b = ");
        show_array(b);

        System.out.print("\nzad_1 = ");
        ArrayList <Integer> zad_1 = append(a, b);
        show_array(zad_1);

        System.out.print("zad_2 = ");
        ArrayList <Integer> zad_2 = merge(a, b);
        show_array(zad_2);

        System.out.print("zad_3 = ");
        ArrayList <Integer> zad_3 = mergeSorted(a, b);
        show_array(zad_3);

        System.out.println("\nzad_4:");
        //ArrayList <Integer> zad_4 = reversed(a);
        reversed_check(a);

        System.out.println("\nzad_5:");
        //reverse(a);
        reverse_check(a);



    }
    public static ArrayList <Integer> append(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList <Integer> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);

        return c;
    }

    public static ArrayList <Integer> merge(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList <Integer> c = new ArrayList<>();

        int a_len = a.size();
        int b_len = b.size();

        int idx_a = 0;
        int idx_b = 0;

        while (idx_a < a_len)
        {
            c.add(a.get(idx_a));
            idx_a += 1;

            c.add(b.get(idx_b));
            idx_b += 1;
        }

        for(int i = idx_b; i < b_len; i++)
        {
            c.add(b.get(i));
        }

        return c;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList <Integer> c = merge(a, b);
        Collections.sort(c);

        return c;
    }


    public static ArrayList <Integer> reversed(ArrayList <Integer> a)
    {
        ArrayList <Integer> c = new ArrayList<>();

        for(int i = a.size() - 1; i >= 0; i--)
        {
            c.add(a.get(i));
        }
        return c;
    }

    public static void reversed_check(ArrayList <Integer> a)
    {
        System.out.print("a = ");
        show_array(a);

        ArrayList <Integer> c = reversed(a);
        System.out.print("reversed(a) = ");
        show_array(c);
    }

    public static void reverse(ArrayList <Integer> a)
    {
        for(int i = a.size() - 1; i >= 0; i--)
            System.out.print(a.get(i) + ", ");
        System.out.println();
    }

    public static void reverse_check(ArrayList <Integer> a)
    {
        System.out.print("a = ");
        show_array(a);

        System.out.print("reverse(a) = ");
        reverse(a);

    }

    public static void show_array(ArrayList <Integer> array)
    {
        for(int num : array)
            System.out.print(num + ", ");
        System.out.println();
    }
}
