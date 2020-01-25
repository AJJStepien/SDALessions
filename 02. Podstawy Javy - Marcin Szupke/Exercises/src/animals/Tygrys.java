package animals;

import java.awt.*;

class Tygrys extends Kotowate {
    public Tygrys(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Tygrysa", hunger, teritory, locationx, locationy);
    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("Grrrrr! Jestem Tygrysem");
    }

    @Override
    public void wedruj() {
        super.wedruj();
        System.out.println("Podczas wędrówki szuka jak zwykle jedzenia");
    }
}
