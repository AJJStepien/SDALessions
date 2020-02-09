package struktury_danych.stos_lista;

import struktury_danych.StosPelenException;

public class StosLista {
    private StosElem top;

    public StosLista() {
        top = null;
    }

    public void push(int value) {
//        StosElem elem = new StosElem(value, top);
//        top = elem;
        top = new StosElem(value, top);           // to jest to samo co powyżej. Zapisujemy obiekt ze starym topem,
        // póżniej tworzymy nowy StosElem i przypisujemy go do topa.
    }
    public int peek() {
        if(isEmpty()) {
            throw new StosPustyException();
        }
        return top.getValue();
    }
    public int pop() {
        if(isEmpty()) {
            throw new StosPustyException();
        }

        int value = top.getValue();
        top = top.getPrev();
        return value;
    }
    public boolean isEmpty() {
        return top == null;

        // inaczej
        //return top == null ? true : false;
    }
    public void print() {
        StosElem tmp = top;
        while (tmp != null){
            System.out.print(tmp.getValue() + "| ");
            tmp = tmp.getPrev();
        }
        System.out.println();
    }
}
