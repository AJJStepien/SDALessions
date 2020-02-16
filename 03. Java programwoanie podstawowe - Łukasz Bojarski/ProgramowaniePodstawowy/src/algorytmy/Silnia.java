package algorytmy;

public class Silnia {
    public static long rekurencyjnie(int liczba){
        if (liczba == 0){return 1;}
        else if (liczba == 1){return 1;}

        return liczba * Silnia.rekurencyjnie(liczba-1);
    }
}
