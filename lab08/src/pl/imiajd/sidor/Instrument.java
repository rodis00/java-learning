package pl.imiajd.sidor;

import java.time.LocalDate;

public abstract class Instrument {

    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String getDzwiek();

    public boolean equals(Object object) {
        return this.toString().equals(object.toString());
    }

    public String toString() {
        return "producent: " + producent + '\n' +
                "rokProdukcji: " + rokProdukcji + "\n";
    }
}
