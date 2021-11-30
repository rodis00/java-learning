import java.util.Arrays;

public class IntegerSet {

    static int rozmiar = 100;
    boolean []integer_set = new boolean[rozmiar];

    public IntegerSet(){
        for(int i = 0; i < rozmiar; i++)
            integer_set[i] = false;
    }

    public String toString() {
        return "integer_set=" + Arrays.toString(integer_set);
    }

    boolean equals(IntegerSet is_)
    {
        for(int i = 0; i < rozmiar; i++)
            if(integer_set[i] == is_.integer_set[i])
                return true;
        return false;
    }

    static IntegerSet union(boolean []is_1, boolean []is_2)
    {
        IntegerSet new_integer_set = new IntegerSet();
        for(int i = 1; i < rozmiar; i++)
            if(is_1[i] || is_2[i])
                new_integer_set.integer_set[i] = true;
        return new_integer_set;
    }

    static IntegerSet intersection(boolean []is_1, boolean []is_2)
    {
        IntegerSet new_integer_set = new IntegerSet();
        for(int i = 0; i < rozmiar; i++)
            if(is_1[i] && is_2[i])
                new_integer_set.integer_set[i] = true;
        return new_integer_set;
    }

    void insertElement(int element)
    {
        if(element > 1 && element < 100)
            integer_set[element - 1] = true;
    }

    void deleteElement(int element)
    {
        if(element > 1 && element < 100)
            integer_set[element - 1] = false;
    }
}
