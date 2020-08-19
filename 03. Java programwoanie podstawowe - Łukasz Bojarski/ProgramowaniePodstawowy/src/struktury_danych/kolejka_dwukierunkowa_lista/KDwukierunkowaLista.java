package struktury_danych.kolejka_dwukierunkowa_lista;

public class KDwukierunkowaLista {
    private KDwukierunkowaElem first;
    private KDwukierunkowaElem last;

    public KDwukierunkowaLista() {
        first = last = null;
    }

    public void addFirst(int value) {
        KDwukierunkowaElem elem = new KDwukierunkowaElem(value, null, null);
        if (isEmpty()) {
            first = last = elem;
        } else {
            first.setPrev(elem);
            elem.setNext(first);
            first = elem;
        }

    }

    public void addLast(int value) {
        KDwukierunkowaElem elem = new KDwukierunkowaElem(value, null, null);
        if (isEmpty()) {
            first = last = elem;
        } else {
            last.setNext(elem);
            elem.setPrev(last);
            last = elem;
        }
    }

    public int pollFirst() {
        if (isEmpty()) {
            System.out.println("Zbiór jest pusty!");
            return Integer.MAX_VALUE;
        } else {
            int valueTmp = first.getValue();

            if (first == last) {
                first = last = null;
            } else {
                first = first.getNext();
                first.setPrev(null);
            }

            return valueTmp;
        }
    }

    public int pollLast() {
        if (isEmpty()) {
            System.out.println("Zbiór jest pusty!");
            return Integer.MAX_VALUE;
        } else {
            int valueTmp = last.getValue();;

            if (last == first) {
                last = first = null;
            } else {
                last = last.getPrev();
                last.setNext(null);
            }
            return valueTmp;
        }
    }

    public int peekFirst() throws KolejkaDwukierunkowaPustaException {
        if (isEmpty()){
            throw new KolejkaDwukierunkowaPustaException();
        }else{
            int valueTmp = first.getValue();
            return valueTmp;
        }

    }

    public int peekLast()throws KolejkaDwukierunkowaPustaException {
        if (isEmpty()){
            throw new KolejkaDwukierunkowaPustaException();
        }else {
            int valueTmp = last.getValue();
            return valueTmp;
        }

    }

    public void show() {
        KDwukierunkowaElem firstTmp = first;
        while(firstTmp != null) {
            System.out.print(firstTmp.getValue() + "| ");
            firstTmp = firstTmp.getNext();
        }
        System.out.println();
    }

    public void showReverse() {
        KDwukierunkowaElem lastTmp = last;
        while (lastTmp!= null){
            System.out.print(lastTmp.getValue() + "| ");
            lastTmp = lastTmp.getPrev();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (first == null && last == null);
    }

    public KDwukierunkowaElem search (int value) {
        KDwukierunkowaElem tmp = first;
        while (tmp != null);
            if (tmp.getValue() == value){
                return tmp;
            }
            tmp = tmp.getNext();
            return null;
    }
    public boolean remove(int value){
        KDwukierunkowaElem found = search(value);
        if(found == null){ //nie ma takiego obiektu na liście
            return false;
        }
        else if (first.getValue() == value){
            pollFirst();
            return true;
        }
        else if (last.getValue() == value){
            pollLast();
            return true;
        } else {
            found.getPrev().setNext(found.getNext());   //wchodzę do obiektu poprzedzającego i tam ustawiam wartość next na wartość next obiektu found.
            found.getNext().setPrev(found.getPrev());   //wchodzę do obiektu następującego i tam ustawiam wartość prev na wartiść prev obiektu found.
            return true;
        }
    }
}

