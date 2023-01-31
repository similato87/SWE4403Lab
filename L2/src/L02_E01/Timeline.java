package L02_E01;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
    public void showComponents(){
        System.out.println("Timeline has:");
        for (Component comp:components){
            System.out.println(comp);
        }
    }

}
