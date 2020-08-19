package pl.sda.zamowienia.exceptions;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
    public void getMessage(String message){
        System.out.println(message);
    }
}
