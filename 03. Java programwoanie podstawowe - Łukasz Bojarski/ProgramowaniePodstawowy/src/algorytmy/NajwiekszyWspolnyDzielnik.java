package algorytmy;

public class NajwiekszyWspolnyDzielnik {

    public int obliczOdejmujac(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public int obliczModulo(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public int obliczRekurencyjnie(int a, int b){
        if(b!=0)
            return obliczRekurencyjnie(b, a%b);
        else
            return a;
    }

    public static void main(String[] args) {
        NajwiekszyWspolnyDzielnik nwd = new NajwiekszyWspolnyDzielnik();
        int a = 102;
        int b = 4;
        int x = nwd.obliczOdejmujac(a, b);
        int y = nwd.obliczModulo(a, b);
        System.out.println(x);
        System.out.println(y);
    }
}
