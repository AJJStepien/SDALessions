package algorytmy;

public class CiagFibonacciego {
    public static int fib(int value){
        if (value == 0){return 0;}
        else if (value == 1){return 1;}
        return fib(value-1)+fib(value-2);
    }
}
