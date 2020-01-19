package niezmiennosc;

public class NiezmiennoscTypowProstych {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        System.out.println("MAIN a=" + a + " b=" + b);
        swap(a, b);

        Pies pies1 = new Pies("azor");
        Pies pies2 = new Pies("burek");
        System.out.println("MAIN pies1=" + pies1.getImie() + " pies2=" + pies2.getImie());
        swap(pies1, pies2);
    }
    private static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("SWAP a=" + a + " b=" + b);
    }
    private static void swap(Pies pies1, Pies pies2){
        Pies tmp = new Pies(pies1.getImie());
        pies1.setImie(pies2.getImie());
        pies2.setImie(tmp.getImie());
        System.out.println("SWAP pies1=" + pies1.getImie() + " pies2=" + pies2.getImie());
    }
}
