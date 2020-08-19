package pl.sda.dystans;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(10, 7);
        p1.distance(p2);
        p2.distance(p1);
    }
}
