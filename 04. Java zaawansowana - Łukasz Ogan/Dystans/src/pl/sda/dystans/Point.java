package pl.sda.dystans;

public class Point {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void distance(Point p1){
//        System.out.println(this.x);
//        System.out.println(this.y);
//        System.out.println(p1.getX());
//        System.out.println(p1.getY());
        int x1 = this.x;
        int x2 = p1.getX();
        int y1 = this.y;
        int y2 = p1.getY();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
        System.out.println(distance);
    }
}
