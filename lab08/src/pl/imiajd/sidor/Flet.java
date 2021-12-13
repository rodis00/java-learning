package pl.imiajd.sidor;

import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String getDzwiek() {
        return "Dzwiek fletu";
    }
}
