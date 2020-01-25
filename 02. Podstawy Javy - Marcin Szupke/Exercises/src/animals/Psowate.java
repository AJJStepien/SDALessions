package animals;

import java.awt.*;

abstract class Psowate extends Zwierzak {

    private static final String coJePsowate = "Mięso";


    public Psowate(String img, int hunger, int[][] teritory, int locationx, int locationy) {
        super(img, coJePsowate , hunger, teritory, locationx, locationy);
    }

    @Override
    public void jedz() {
        super.jedz();
        System.out.println(coJePsowate);
    }

    @Override
    public void wedruj() {
        System.out.println("Psowaty bierze całą watahę i idzie");
    }
}
