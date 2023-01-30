package L02_E01;

public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        timeline.add(text);

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);

        System.out.println(timeline);
        // TODO Add more objects to the timeline

    }
}
