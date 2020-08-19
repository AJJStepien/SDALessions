package interfejsy;

public class Program implements Comparable{
    public static void main(String... args) {

        Pasazer Bob = new Pasazer(1,180);
        Pasazer Jane = new Pasazer(1,90);
        Pasazer Lisa = new Pasazer(2,180);
        Pasazer Mark = new Pasazer(3,720);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
