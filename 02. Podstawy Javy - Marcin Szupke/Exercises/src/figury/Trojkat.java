package figury;

public class Trojkat {
    private double podstawa;
    private double wysokosc;
    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;

    public Trojkat ( double podstawa,
                     double wysokosc,
                     double dlugoscPierwszegoBoku,
                     double dlugoscDrugiegoBoku) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }
//    public void setPodstawa(double podstawa) {
//        this.podstawa = podstawa;
//    }
//
//    public void setWysokosc(double wysokosc) {
//        this.wysokosc = wysokosc;
//    }
//
//    public void setDlugoscPierwszegoBoku(double dlugoscPierwszegoBoku) {
//        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
//    }
//
//    public void setDlugoscDrugiegoBoku(double dlugoscDrugiegoBoku) {
//        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
//    }

    public double obliczPolePowierzchni() {
        double polePowierzchni;
        polePowierzchni = (podstawa*wysokosc)/2;
        return polePowierzchni;
    }
    public double obliczObwod() {
        double obwodTrojkata;
        obwodTrojkata = podstawa + dlugoscDrugiegoBoku + dlugoscPierwszegoBoku;
        return obwodTrojkata;
    }
}
