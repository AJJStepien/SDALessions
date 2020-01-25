package animals;

import java.awt.*;

class Hipopotam extends Zwierzak {

    public Hipopotam(String img, int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Hipcia", "Trawa", hunger, teritory, locationx, locationy);
    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("xDxDxD nie wiem jak robi hipopotam");
    }

    @Override
    public void wedruj() {
        System.out.println("A hipopotamy nie wędrują. One leżą i żrą");
    }
}
