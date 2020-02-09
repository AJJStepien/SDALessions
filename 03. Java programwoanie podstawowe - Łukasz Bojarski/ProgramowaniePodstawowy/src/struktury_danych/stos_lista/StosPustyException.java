package struktury_danych.stos_lista;

public class StosPustyException extends RuntimeException {

    public StosPustyException() {  //przykładowy unchecked exception
        super("Stos pusty!");
    }
}
