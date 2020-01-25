package animals;

import java.awt.*;

class Kot extends Kotowate{
    public Kot(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Kota", hunger, teritory, locationx, locationy);
    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("MiauMiau! Jestem Kotem");
    }
}
