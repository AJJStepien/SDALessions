public class Kalkulator {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int z = 0;
        int result = 0;
        while(z<y){
            result = result + x;
            z++;
        }
        System.out.println("wg while wynik dodawania to: " + result);

        int result2 = 0;
        for (int a = 0; a<y; a++){
            result2 = result2 + x;
        }
        System.out.println("wg for wynik dodawania to: " + result2);

    }

}
