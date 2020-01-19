package figury;

public class Kwadrat extends Prostokat {

    private double dlugoscBoku;

    public Kwadrat (double dlugoscBoku)
    {   super(dlugoscBoku, dlugoscBoku);
        this.dlugoscBoku = dlugoscBoku;
    }
//
//    public void setDlugoscBoku(double dlugoscBoku) {
//        this.dlugoscBoku = dlugoscBoku;
//    }


//    public double obliczPolePowierzchni() {
//        double polePowierzchni;
//        polePowierzchni = Math.pow(dlugoscBoku, 2);
//        return polePowierzchni;
//    }
//    public double obliczObwod() {
//        double obwod;
//        obwod = dlugoscBoku * 4;
//        return obwod;
//    }
}
