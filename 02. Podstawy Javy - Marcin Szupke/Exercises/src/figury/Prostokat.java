package figury;

public class Prostokat {
    private double dlugoscPierwszegoBoku, dlugoscDrugiegoBoku;

    public Prostokat(double dlugoscPierwszegoBoku,
                     double dlugoscDrugiegoBoku) {
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }

//    public void setDlugoscPierwszegoBoku(double dlugoscPierwszegoBoku) {    //tutaj settery
//        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
//    }
//
//    public void setDlugoscDrugiegoBoku(double dlugoscDrugiegoBoku) {
//        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
//    }

    public double obliczPolePowierzchni(){
        double polePowierzchni;
        polePowierzchni = dlugoscDrugiegoBoku * dlugoscPierwszegoBoku;
        return polePowierzchni;
    }

    public double obliczObwod(){
        double obwod;
        obwod = (dlugoscDrugiegoBoku + dlugoscPierwszegoBoku) * 2;
        return obwod;
    }

}
