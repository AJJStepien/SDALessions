package animals;

import java.awt.*;

abstract class Psowate extends Zwierzak {


    public Psowate(String img, int hunger, int[][] teritory, int locationx, int locationy, int zmeczenie) {
        super(img,"Mięso", hunger, teritory, locationx, locationy, zmeczenie);
    }

    @Override
    public void jedz() {
        super.jedz();
        System.out.println(Pozywienie.MIESO);
    }

    @Override
    public void wedruj() {
        System.out.println("Psowaty bierze całą watahę i idzie");
    }
}
