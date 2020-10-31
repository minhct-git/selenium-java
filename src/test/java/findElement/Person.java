package findElement;

public class Person {
    private  String firstName;
    private  String lastName;

    public Person(String firstName, String lastName, String email, String website, Float due) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.website = website;
        this.due = due;
    }

    private  String email;
    private String website;
    private Float due;
}
