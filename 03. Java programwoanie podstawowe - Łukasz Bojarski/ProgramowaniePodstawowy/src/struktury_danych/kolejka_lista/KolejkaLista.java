package struktury_danych.kolejka_lista;

public class KolejkaLista {
    private KolejkaElem first;
    private KolejkaElem last;

    public KolejkaLista() {
        first = last = null;  //tworzymy kolejkę-listę bez elementów
    }

    public void add(int value) {
        KolejkaElem elem = new KolejkaElem(value, null);//w liście tworzymy nowy element
        if (isEmpty()) {     //kolejka jest pusta. zamiast first można wrzucić last.
            first = last = elem; //jesli w kolejce nie ma wcześniejszych elementów to pierwszy element jest pierwszy i
        }                            // ostatni jednocześnie.
        else {              //pierwszy elementdalej będzie pierwszy ale ostatnie elementy będą sie zmieniać
            last.setNext(elem);   //istnieje już następny obiekt więc powiedz ostatniemu obiektowi, że już go coś nastepuje
            last = elem;    // jak już mu to powiedziałeś, to wskaż na nowy, sotatni obiekt.
        }
    }

    public int poll() throws KolejkaPustaException {
        if (isEmpty()) {
            throw new KolejkaPustaException();
        } else {
            int valueTmp = first.getValue();
            if (first == last) {
                first = last = null;
                return valueTmp;
            } else {
                first = first.getNext();
                return valueTmp;
            }

        }
    }

    public int peek()  { // spodziewałem sie tego wyjątku więc odałem "throws"
        if (isEmpty()) {
            throw new KolejkaPustaException();
        } else {
            return first.getValue();
        }
    }

    public void print() {
        KolejkaElem tmpFirst = first;
        while(tmpFirst!=null){
            System.out.print(tmpFirst.getValue() + "| ");
            tmpFirst = tmpFirst.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return first == null;
    }
}
