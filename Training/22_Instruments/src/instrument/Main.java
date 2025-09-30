package instrument;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(
                "A",
                "AA",
                "A-AA-123",
                "black"
        );
        System.out.println(guitar);
        System.out.println(guitar.toString());

        Piano piano = new Piano(
                "AB",
                "AAB",
                "AB-AAB-123"
        );

        Piano piano2 = new Piano(
                "AB",
                "AAB",
                "AB-AAB-123"
        );

        Band band = new Band();
        band.addInstrument(guitar);
        band.addInstrument(piano);
        band.addInstrument(guitar);
        band.addInstrument(piano);
        band.addInstrument(guitar);
        band.addInstrument(piano);
        band.addInstrument(guitar);
        band.addInstrument(piano);
        band.addInstrument(guitar);
        band.addInstrument(piano2);

       band.play();

    }
}