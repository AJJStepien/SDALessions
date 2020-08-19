package pl.sda.zamowienia.exceptions;

public class InvalidCharException extends Exception {
    public InvalidCharException() {
    }

    public InvalidCharException(String message) {
        super(message);
    }
    public void getMessage(String message){
        System.out.println(message);
    }
}
