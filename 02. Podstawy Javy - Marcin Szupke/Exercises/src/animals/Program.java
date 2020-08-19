package animals;

public class Program {
    public static void main(String... args){

        int[][] tabelaKot = new int[100][100];
        int[][] tabelaPies = new int[20][20];
        int[][] tabelaHipcio = new int[200][200];
        int[][] tabelaTygrysa = new int[200][200];

        Kot mruczek = new Kot(100, tabelaKot,3,9);
        try {mruczek.halasuj();}
        catch (ZbytDuzeZmeczenieException e) {
            System.out.println("czas spac");
        }
        Pies azor = new Pies( 100, tabelaPies, 10, 15);
        try {azor.halasuj();}
        catch (ZbytDuzeZmeczenieException e) {
            System.out.println("czas spac");
        }
//        Hipopotam hipcio = new Hipopotam("Zdjęcie Hipcia", 100, tabelaHipcio, 100,25);
//        hipcio.halasuj();
//        azor.spij();
//        Tygrys tydzio = new Tygrys( 100, tabelaTygrysa, 30,80);
//        tydzio.wedruj();


    }
}
