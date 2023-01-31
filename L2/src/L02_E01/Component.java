package L02_E01;
import java.time.LocalDateTime;

public interface Component{

    /* TODO Implement an appropriate interface method */
    default Component copyComponent(Component component) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("%s edited at %s",component,now));
        return component;
    }

}
