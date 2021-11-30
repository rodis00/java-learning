public class test_Rach_Bank {
    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(3000);
        RachunekBankowy saver2 = new RachunekBankowy(2000);

        RachunekBankowy.setRocznaStopaProcentowa(4);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());


        RachunekBankowy.setRocznaStopaProcentowa(5);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

    }
}
