public class RachunekBankowy {

    private double saldo;
    static double rocznaStopaProcentowa;

    public RachunekBankowy(double saldo)
    {
        this.saldo = saldo;
    }

    public static void setRocznaStopaProcentowa(double new_rocznaStopaProcentowa) {
        rocznaStopaProcentowa = new_rocznaStopaProcentowa / 100;
    }


    public double getSaldo() {
        return saldo;
    }

    public double obliczMiesieczneOdsetki()
    {
        saldo += Math.round((saldo * rocznaStopaProcentowa) / 12);
        return saldo;
    }
}
