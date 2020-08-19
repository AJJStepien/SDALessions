package interfejsy;

public class Pasazer implements Comparable {
    private int poziom;
    private int dlugoscCzlonkowstwa;

    public Pasazer(int poziom, int dlugoscCzlonkowstwa) {
        this.poziom = poziom;
        this.dlugoscCzlonkowstwa = dlugoscCzlonkowstwa;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
