package struktury_danych.kolejka_lista;

public class KolejkaPustaException extends RuntimeException { //spodziewam się tego wyjątku więc muszę dodawać throws

    public KolejkaPustaException() {
        super("Kolejka jest pusta!");
    }
}
