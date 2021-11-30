
public class Main {
    public static void main(String[] args) {

        IntegerSet is_1 = new IntegerSet();
        IntegerSet is_2 = new IntegerSet();

        is_1.insertElement(8);
        is_2.insertElement(9);

        IntegerSet is_3 = IntegerSet.union(is_1.integer_set, is_2.integer_set);
        IntegerSet is_4 = IntegerSet.intersection(is_1.integer_set, is_2.integer_set);

        System.out.println(is_3.toString());
        System.out.println(is_4.toString());

        System.out.println(is_1.equals(is_2));

        is_1.deleteElement(5);

        System.out.println(is_1.toString());


    }
}
