class KalkulatorSilnia {
    public static void main(String[] args) {
        int n = 10;

        int w = 1; int result1 = 1;
        int result2 = 1;

        while (w < n + 1){
            result1 = result1 * w;
            w++;
        }
        System.out.println("n! dla While: " + result1);

        for(int f = 1; f <= n; f++){
            result2 = result2 * f;
        }
        System.out.println("n! dla For: " + result2);

    }

}

