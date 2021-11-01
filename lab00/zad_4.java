package domena.pl;

public class zad_4 {
    public static void main(String[] args) {

        int account = 1000;
        double interest = 0.06;

        for(int i = 0; i < 3; i++)
        {
            account -= account * interest;
            System.out.println((i + 1) + " rok = " + account);
        }
    }
}
