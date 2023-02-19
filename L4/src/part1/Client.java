package part1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Elon Musk"));
        personList.add(new Person("Tim Cook"));

        List<Customer> customerList = new ArrayList<>();
        for (Person person : personList) {
            Customer customer = new PersonAdapter(person);
            customerList.add(customer);
        }

        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}



