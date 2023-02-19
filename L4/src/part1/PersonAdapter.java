package part1;

public class PersonAdapter extends Customer {
    private Person person;

    public PersonAdapter(Person person) {
        super(null, null);
        this.person = person;
        String[] names = person.getFullName().split(" ");
        setFirstName(names[0]);
        setLastName(names[names.length - 1]);
    }
}

