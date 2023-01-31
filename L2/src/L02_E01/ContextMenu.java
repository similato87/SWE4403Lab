package L02_E01;

public class ContextMenu{
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        // TODO Improve
//        if (component instanceof Text) {
//            Text source = (Text)component;
//            Text target = new Text(source.getContent());
//            timeline.add(target);
//            System.out.println("Duplicating Text");
//        }
//        else if (component instanceof Audio) {
//            // TODO Logic for duplicating an Audio object
//            Audio source = (Audio) component;
//            Audio target = new Audio(source.getContent());
//            timeline.add(target);
//            System.out.println("Duplicating Audio");
//        }
//        else if (component instanceof Clip) {
//            // TODO Logic for duplicating a Clip object
//            Clip source = (Clip) component;
//            Clip target = new Clip(source.getContent());
//            timeline.add(target);
//            System.out.println("Duplicating Clip");
//        }
        System.out.print("Duplicating ");
        component=component.copyComponent(component);
        timeline.add(component);

    }

}
