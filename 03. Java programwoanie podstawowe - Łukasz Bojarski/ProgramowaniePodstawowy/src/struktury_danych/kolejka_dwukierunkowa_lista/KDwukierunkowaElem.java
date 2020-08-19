package struktury_danych.kolejka_dwukierunkowa_lista;

public class KDwukierunkowaElem {
    private int value;
    private KDwukierunkowaElem prev;
    private KDwukierunkowaElem next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KDwukierunkowaElem getPrev() {
        return prev;
    }

    public void setPrev(KDwukierunkowaElem prev) {
        this.prev = prev;
    }

    public KDwukierunkowaElem getNext() {
        return next;
    }

    public void setNext(KDwukierunkowaElem next) {
        this.next = next;
    }

    public KDwukierunkowaElem(int value, KDwukierunkowaElem prev, KDwukierunkowaElem next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
