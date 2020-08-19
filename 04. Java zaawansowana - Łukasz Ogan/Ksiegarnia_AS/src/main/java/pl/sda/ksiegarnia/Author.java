package pl.sda.ksiegarnia;

public class Author {

    private String name, lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
