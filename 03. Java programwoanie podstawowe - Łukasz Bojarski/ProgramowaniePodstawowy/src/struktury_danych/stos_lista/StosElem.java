package struktury_danych.stos_lista;

public class StosElem {
    private  int value;
    private StosElem prev;
    private StosElem top;

    public StosElem(int value, StosElem prev) {
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public StosElem getPrev() {
        return prev;
    }

    
}
