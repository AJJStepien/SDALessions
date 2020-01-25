package rownosc;

public class Program {
    public static void main (String... args){
        Lot lot1 = new Lot(123,'1');
        Lot lot2 = new Lot(123,'1');

        boolean isTheSame = lot1 == lot2;
        System.out.println("IsTheSame: " + isTheSame); //false, gdyż == porównuje referencje
        boolean isEquals = lot1.equals(lot2); //false gdy bazowa metoda equals nie jest przeciążona
        System.out.println("IsEquals: " + isEquals);

        Lot lot3 = lot1;
        if (lot1.equals(lot3)) {
            System.out.println("Lot1 i Lot3 są równe");
        }
        Pies pies = new Pies();  //nie porównujemy obiektów z róznych bajek, obiektów różnych klas
        if(lot1.equals(pies)){
            System.out.println("Lot to Pies!!!");
        }
            //jeśli przeciążę metodę equals w klasie Lot, to spodziewam się porównywania obiektów klasy Lot
            // gdybym przeciążył equals w klasie Pies, to bym się spodziewał obiektów klasy Pies do porównania
    }
}
