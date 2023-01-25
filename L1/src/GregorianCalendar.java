import java.util.Date;

public class GregorianCalendar implements Calendar{
    public GregorianCalendar() {

    }

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("GregorianCalendar is using now!");
        System.out.println(String.format("Adding an %s on the given %s.",event,date));
    }
}
