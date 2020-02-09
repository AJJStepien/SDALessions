package algorytmy;

public class NajwiekszyWspolnyDzielnik {

    public int obliczOdejmujac(int a, int b) {

        int result;
        int A = a;
        int B = b;
        while (B != 0) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
        }
        return A;
    }
    public int obliczModulo(int a, int b){

    }

    public static void main(String[] args) {
        NajwiekszyWspolnyDzielnik nwd = new NajwiekszyWspolnyDzielnik();
        int a = 102;
        int b = 4;
        int x = nwd.obliczOdejmujac(a, b);
        System.out.println(x);
    }
}
