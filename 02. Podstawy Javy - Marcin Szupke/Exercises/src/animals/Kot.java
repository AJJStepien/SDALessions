package animals;

import java.awt.*;

class Kot extends Kotowate{
    public Kot(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Kota", hunger, teritory, locationx, locationy, 5);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException{
        super.halasuj();
        System.out.println("MiauMiau! Jestem Kotem");
    }
}
