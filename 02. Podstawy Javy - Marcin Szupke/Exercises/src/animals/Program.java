package animals;

public class Program {
    public static void main(String... args){

        int[][] tabelaKot = new int[100][100];
        int[][] tabelaPies = new int[20][20];
        int[][] tabelaHipcio = new int[200][200];
        int[][] tabelaTygrysa = new int[200][200];

        Kot mruczek = new Kot(100, tabelaKot,3,9);
        mruczek.halasuj();
        Pies azor = new Pies( 100, tabelaPies, 10, 15);
        azor.halasuj();
        Hipopotam hipcio = new Hipopotam("Zdjęcie Hipcia", 100, tabelaHipcio, 100,25);
        hipcio.halasuj();
        azor.spij();
        Tygrys tydzio = new Tygrys( 100, tabelaTygrysa, 30,80);
        tydzio.wedruj();
    }
}
