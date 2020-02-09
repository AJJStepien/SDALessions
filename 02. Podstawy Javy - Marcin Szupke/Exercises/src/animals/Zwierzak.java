package animals;

import javax.management.ObjectName;
import java.awt.*;

abstract class Zwierzak {

    private String img;
    private String pozywienie;
    private int hunger;
    private int teritory[][];
    private int locationx, locationy;
    private int zmeczenie;

    //enum to prawie pełnoprawna klasa. Coś albo coś. Enum daje wybór

    public Zwierzak(String img, String pozywienie, int hunger, int[][] teritory, int locationx, int locationy, int zmeczenie) {
        this.img = img;
        this.pozywienie = pozywienie;
        this.hunger = hunger;
        this.teritory = teritory;
        this.locationx = locationx;
        this.locationy = locationy;
        this.zmeczenie = zmeczenie;
    }

    public void halasuj() throws ZbytDuzeZmeczenieException{

        if (zmeczenie > 10){
        System.out.print("Robi tak: ");
        }

    }
    public void jedz(){
        System.out.print("Je: ");
    }
    public void spij(){
        System.out.println("Zwierzak spi");
    }
    public abstract void wedruj();

}
