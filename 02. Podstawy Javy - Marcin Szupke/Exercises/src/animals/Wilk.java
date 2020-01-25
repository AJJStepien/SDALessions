package animals;

import java.awt.*;

class Wilk extends Psowate {

    public Wilk(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Wilka", hunger, teritory, locationx, locationy);
    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("Auuuu! Jestem Wilkiem!");
    }
}
