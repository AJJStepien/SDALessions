package animals;

import java.awt.*;

abstract class Kotowate extends Zwierzak {
    private static final String coJeKotowate = "Mięso";

    public Kotowate(String img, int hunger, int[][] teritory, int locationx, int locationy) {
        super(img, coJeKotowate, hunger, teritory, locationx, locationy);
    }

    @Override
    public void jedz() {
        super.jedz();
        System.out.println(coJeKotowate);
    }

    @Override
    public void wedruj() {
        System.out.println("Kotowaty szlaja się po swoim terenie");
    }
}
