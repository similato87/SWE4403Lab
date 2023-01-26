
public class Demo {
    public static void show(String type) {
        if(type=="GregorianScheduler"){
        var scheduler = new GregorianScheduler();
        scheduler.schedule(new Event());
        }
        else if(type == "ArabianScheduler") {
            var scheduler = new ArabianScheduler();
            scheduler.schedule(new Event());
        }
    }

    public static void main(String[] args) {
        show("GregorianScheduler");
        show("ArabianScheduler");
    }
}
