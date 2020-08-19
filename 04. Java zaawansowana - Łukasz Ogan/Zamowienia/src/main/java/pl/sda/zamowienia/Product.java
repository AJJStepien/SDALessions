package pl.sda.zamowienia;

import pl.sda.zamowienia.exceptions.InvalidCharException;
import pl.sda.zamowienia.exceptions.NegativeNumberException;

public class Product {
    private String name;
    private double price;
    private Category cathegory;
    private int quantity;

    public Product(String name, Category cathegory, double price, int quantity) {
        try {
            if (checkName(name)) {
                this.name = name;
            }
        } catch (InvalidCharException e) {
            e.getMessage("Błędna nazwa produktu! Może zawierać tylko duże litery i spacje");
            name.toUpperCase();
        }
        try {
            if (checkPrice(price)) {
                this.price = price;
            }
        } catch (NegativeNumberException e) {
            e.getMessage("Podana wartość nie może być ujemna!");
        }

        this.cathegory = cathegory;
        if (checkQuantity(quantity)) {
            this.quantity = quantity;
        }
    }

    public boolean checkName(String name) throws InvalidCharException {
        CharSequence[] charSequences = {"a-z","0-9" };
        if (name.contains()) {
            throw new InvalidCharException();
            return false;
        }

        return true;
    }

    public boolean checkPrice(double price) {
        if (price < 0) {
            throw new NegativeNumberException();
        }
        return true;

    }

    public boolean checkQuantity(int quantity) {
        if (quantity < 0) {
            throw new NegativeNumberException();
        }
        return true;

    }
}
