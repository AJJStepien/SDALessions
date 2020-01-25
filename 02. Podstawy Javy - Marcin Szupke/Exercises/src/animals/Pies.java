package animals;

import java.awt.*;

class Pies extends Psowate {


    public Pies(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Psa" +
                "", hunger, teritory, locationx, locationy);
    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("HauHau! Jestem Psem");
    }
}
