package instrument;

import java.util.HashSet;
import java.util.Set;

public class Band {
    private final Set<Instrument> instruments = new HashSet<>();

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public void play() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
