package animals;

import java.awt.*;

abstract class Kotowate extends Zwierzak {

    public Kotowate(String img, int hunger, int[][] teritory, int locationx, int locationy, int zmeczenie) {
        super(img, "Mięso", hunger, teritory, locationx, locationy, zmeczenie);
    }

    @Override
    public void jedz() {
        super.jedz();
        System.out.println(Pozywienie.MIESO);
    }

    @Override
    public void wedruj() {
        System.out.println("Kotowaty szlaja się po swoim terenie");
    }
}
