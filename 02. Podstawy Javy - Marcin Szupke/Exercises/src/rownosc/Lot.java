package rownosc;

public class Lot {
    private int numerLotu;
    private char klasa;

    public Lot(int numerLotu, char klasa) {
        this.numerLotu = numerLotu;
        this.klasa = klasa;
    }
    @Override //przeciązamy equals                                   tak wygląda przeciążenie metody equals
    public boolean equals(Object o) {
        if (!(o instanceof Lot)) {
            return false;
        }

        if (super.equals(o)) {
            return true;
        }

        Lot other = (Lot) o; // przeciązamy objekt Lot

        if (this.numerLotu != other.numerLotu) {
            return false;
        }
        if (this.klasa != other.klasa) {
            return false;
        }

        return true;
    }
}
