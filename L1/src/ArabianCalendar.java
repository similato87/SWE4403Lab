import java.util.Date;

public class ArabianCalendar implements Calendar{
    public ArabianCalendar() {

    }

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("ArabianCalendar is using now!");
        System.out.println(String.format("Adding an %s on the given %s.",event,date));
    }
}
