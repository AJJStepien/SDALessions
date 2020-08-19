package animals;

import java.awt.*;

class Lew extends Kotowate {

    public Lew(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Lwa", hunger, teritory, locationx, locationy, 7);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {
        super.halasuj();
        System.out.println("Roooar! Jestem Lwem!!!");
    }
}
