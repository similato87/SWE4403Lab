
import java.util.Date;

public interface Calendar {
     default void addEvent(Event event, Date date) {
        System.out.println(String.format("Adding an %s on the given %s.",event,date));
    }
}
