package struktury_danych;

public class Tablice {
    public void wypiszOdKoncaNaPaorzystychIndeksach(int[] tab) {

        for (int i = tab.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + "| ");
            }

        }
    }

    public int sumujTablice(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma;
    }

    public int sumujXElementow(int[] tab, int x) {
       try {
           int suma = 0;
           for (int i = 0; i < x; i++) {
               suma = suma + tab[i];
           }
           return suma;
       }
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Tablica jest za mała lub wartość x jest za duża");
       }
       catch (IndexOutOfBoundsException e) {
           System.out.println("IndexOutOfBoundsException");
       }
       return 0;
    }
    public int sumaLiczbPodzielnychPrzezTrzy(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0) {
//                System.out.print(tab[i] + "| ");
                suma = suma + tab[i];
            }
        }
        return suma;
    }
    public int sumaPieciuPierwszychPodzielonychPrzezOstatnia(int[] tab) {
        try {
            int x = sumujXElementow(tab, 5);
            int l = tab[tab.length-1];
            int result = x / l;
            return result;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
        return 0;
    }
}
