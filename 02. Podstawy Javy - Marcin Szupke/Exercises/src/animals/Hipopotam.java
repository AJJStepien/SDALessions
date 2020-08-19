package animals;

import java.awt.*;

class Hipopotam extends Zwierzak {

    public Hipopotam(String img, int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Hipcia", "Trawa", hunger, teritory, locationx, locationy,9);
    }

    @Override
    public void halasuj() {
        try {
            super.halasuj();
            System.out.println("xDxDxD nie wiem jak robi hipopotam");
        }
        catch (ZbytDuzeZmeczenieException e){
            System.out.println("czas spać!");
        }

    }

    @Override
    public void wedruj() {
        System.out.println("A hipopotamy nie wędrują. One leżą i żrą");
    }
}
