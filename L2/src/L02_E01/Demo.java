package L02_E01;

public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello in text");
        timeline.add(text);

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);

        timeline.showComponents();

        Audio audio = new Audio("Hello in audio");
        timeline.add(audio);
        menu.duplicate(audio);

        timeline.showComponents();

        Clip clip = new Clip("Hello in clip");
        timeline.add(clip);
        menu.duplicate(clip);
        timeline.showComponents();


        // TODO Add more objects to the timeline

    }
}
