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
            first.setNext(elem);
            elem.setPrev(first);
            first = elem;
        }

    }

    public void addLast(int value) {
        KDwukierunkowaElem elem = new KDwukierunkowaElem(value, null, null);
        if (isEmpty()) {
            first = last = elem;
        } else {
            last.setPrev(elem);
            elem.setNext(last);
            last = elem;
        }
    }

    public int pollFirst() throws KolejkaDwukierunkowaPustaException {
        if (isEmpty()) {
            throw new KolejkaDwukierunkowaPustaException();
        } else {
            int valueTmp;
            if (first == last) {
                valueTmp = first.getValue();
                first = last = null;
            } else {
                valueTmp = first.getValue();
                first = first.getPrev();
            }
            return valueTmp;
        }
    }

    public int pollLast() throws KolejkaDwukierunkowaPustaException {
        if (isEmpty()) {
            throw new KolejkaDwukierunkowaPustaException();
        } else {
            int valueTmp;
            if (last == first) {
                valueTmp = last.getValue();
                last = first = null;
            } else {
                valueTmp = last.getValue();
                last = last.getNext();
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

    public void print() {
        KDwukierunkowaElem firstTmp = first;
        while(firstTmp != null) {
            System.out.print(firstTmp.getValue() + "| ");
            firstTmp = firstTmp.getPrev();
        }
        System.out.println();
    }

    public void printReverse() {
        KDwukierunkowaElem lastTmp = last;
        while (lastTmp!= null){
            System.out.print(lastTmp.getValue() + "| ");
            lastTmp = lastTmp.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (first == null && last == null);
    }
}

