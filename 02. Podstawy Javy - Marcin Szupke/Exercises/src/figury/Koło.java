package figury;

public class Koło {
    private double promien;

    public Koło(double promien) {
        this.promien = promien;
    }
//    public void setPromien(double promien) {
//        this.promien = promien;
//    }

    double obwod;
    double polePowierzchni;

     public double obliczPolePowierzchni() {
        polePowierzchni = Math.PI * (promien * promien);
        return skrocWynik(polePowierzchni);
     }
     public double obliczObwod() {
        obwod = 2 * Math.PI *promien;
        return skrocWynik(obwod);
     }
     private double skrocWynik(double wynik) {
        double u = wynik * 100;
        u = Math.round(u);
        u = u / 100;
        return u;
     }
}
