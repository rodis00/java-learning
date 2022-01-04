public class PairUtil<T>{

    public static <T> Pair<T> swap(Pair<T> para){

        Pair<T> pair = new Pair<>(para.getFirst(), para.getSecond());
        para.swap();

        return pair;
    }
}
