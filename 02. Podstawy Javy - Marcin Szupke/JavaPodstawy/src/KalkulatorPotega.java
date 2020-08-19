class KalkulatorPotega {
    public static void main(String[] args) {
        int podstawa = 2;
        int potega = 5;

        int result1 = 1;
        int result2 = 1;

        int w = 0;
        while (w < potega) {

            // result1 = podstawa * podstawa * podstawa *
            result1 = result1 * podstawa;
            w++;
        }
        System.out.println("Dla pętli while " + podstawa + "^" + potega + " = " + result1);

        for (int f = 0; f < potega; f++) {
            result2 = result2 * podstawa;
        }
        System.out.println("Dla pętli for " + podstawa + "^" + potega + " = " + result2);
    }
}

