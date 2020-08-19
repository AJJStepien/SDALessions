package animals;

import java.awt.*;

class Wilk extends Psowate {

    public Wilk(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Wilka", hunger, teritory, locationx, locationy, 12);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {
        super.halasuj();
        System.out.println("Auuuu! Jestem Wilkiem!");
    }
}
