public class ArrayUtil {

    public static <T extends Comparable<T>> boolean jestPalindromem(T[] o){

        int start = 0;
        int end = o.length - 1;
        boolean palindrom = false;
        while (start != end){
            if(o[start].compareTo(o[end]) == 0){
                palindrom = true;
                start++;
                end--;
            }
            else{
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }
}
