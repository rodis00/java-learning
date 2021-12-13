package pl.imiajd.sidor;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String getDzwiek() {
        return "Dzwiek fortepianu";
    }
}
