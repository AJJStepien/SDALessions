package animals;

import java.awt.*;

class Pies extends Psowate {


    public Pies(int hunger, int[][] teritory, int locationx, int locationy) {
        super("Zdjęcie Psa", hunger, teritory, locationx, locationy,3);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException{
        super.halasuj();
        System.out.println("HauHau! Jestem Psem");
    }
}
