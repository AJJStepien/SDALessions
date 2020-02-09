package struktury_danych.kolejka_dwukierunkowa_lista;

public class KolejkaDwukierunkowaPustaException extends RuntimeException {

    public KolejkaDwukierunkowaPustaException(){
        super("Kolejka Dwukierunkowa jest pusta");
    }
}
