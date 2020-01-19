package figury;

public class Test{
    public static void main(String[] args) {

        Trojkat trojkat = new Trojkat(5,7,5,6);
//        trojkat.setPodstawa(5);
//        trojkat.setDlugoscPierwszegoBoku(5);
//        trojkat.setDlugoscDrugiegoBoku(5);
//        trojkat.setWysokosc(7);

        double obwodTrojkata = trojkat.obliczObwod();
        double poleTrojkata = trojkat.obliczPolePowierzchni();

        System.out.println("Obwód trójkąta wynosi: " + obwodTrojkata);
        System.out.println("Pole trojkata wynosi: " + poleTrojkata);
        System.out.println();

        TrojkatRownoboczny trRb = new TrojkatRownoboczny(5);
        double obwodTrRb = trRb.obliczObwod();
        double poleTrRb = trRb.obliczPolePowierzchni();
        double poleTrRb2 = trRb.obliczPolePowierzchni(7);

        System.out.println("Obwód trójkąta równobocznego wynosi: " + obwodTrRb);
        System.out.println("Pole trojkata równobocznego wynosi: " + poleTrRb);
        System.out.println("Pole trojkata równobocznego2 wynosi: " + poleTrRb2);
        System.out.println();

        TrojkatRownoramienny trRm = new TrojkatRownoramienny(5,7,9);
        double obwodTrRm = trRm.obliczObwod();
        double poleTrRm = trRm.obliczPolePowierzchni();


        System.out.println("Obwód trójkąta równoramiennego wynosi: " + obwodTrRm);
        System.out.println("Pole trojkata równoramiennego wynosi: " + poleTrRm);
        System.out.println();

        Kwadrat kwadrat = new Kwadrat(5);
//        Prostokat kwadrat = new Kwadrat(5);
//        kwadrat.test <<------------- jesli odwołam się do klasy nadrzędnej
//                                      to nie mogę skorzystać z metod klasy podrzędnej
//                                      jesli Kwadrat kwadrat = new Kwadrat, to już możnaby skorzystać z test()
      //  kwadrat.setDlugoscBoku(5);

        double obwodKwadratu = kwadrat.obliczObwod();
        double poleKwadratu = kwadrat.obliczPolePowierzchni();

        System.out.println("Obwód kwadratu wynosi: " + obwodKwadratu);
        System.out.println("Pole kwadratu wynosi: " + poleKwadratu);
        System.out.println();

        Prostokat prostokat = new Prostokat(5,7);

//        prostokat.setDlugoscPierwszegoBoku(5);
//        prostokat.setDlugoscDrugiegoBoku(7);

        double obwodProstokata = prostokat.obliczObwod();
        double poleProstokata = prostokat.obliczPolePowierzchni();

        System.out.println("Obwód prostokąta wynosi: " + obwodProstokata);
        System.out.println("Pole prostokąta wynosi: " + poleProstokata);
        System.out.println();

        Koło kolo = new Koło(5);

       // kolo.setPromien(5);

        double obwodKola = kolo.obliczObwod();
        double poleKola = kolo.obliczPolePowierzchni();

        System.out.println("Obwód koła wynosi: " + obwodKola);
      //  System.out.format("%.2f%n", obwodKola); // %.2f = modulo do dwoch miejsc po przecinku z dzielenia z floatem
        System.out.println("Pole koła wynosi: " + poleKola); // %n = następna linia
       // System.out.format("%.2f%n", poleKola);     // pokaże wynik z przecinkiem zamiast kropki
    }
}
