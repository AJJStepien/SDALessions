package animals;

import javax.management.ObjectName;
import java.awt.*;

abstract class Zwierzak {
    private String img;
    private String food;
    private int hunger;
    private int teritory[][];
    private int locationx, locationy;

    public Zwierzak(String img, String food, int hunger, int[][] teritory, int locationx, int locationy) {
        this.img = img;
        this.food = food;
        this.hunger = hunger;
        this.teritory = teritory;
        this.locationx = locationx;
        this.locationy = locationy;
    }

    public void halasuj(){
        System.out.print("Robi tak: ");

    }
    public void jedz(){
        System.out.print("Je: ");
    }
    public void spij(){
        System.out.println("Spi");
    }
    public abstract void wedruj();

}
