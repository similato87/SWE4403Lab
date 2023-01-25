
import java.util.Date;

public abstract class Scheduler{
    private Calendar calendar = createCalendar();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
    public abstract Calendar createCalendar();


}
