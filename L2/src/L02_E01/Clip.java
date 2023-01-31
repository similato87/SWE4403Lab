package L02_E01;

import java.time.LocalDateTime;

public class Clip implements Component{
    private String content;

    public Clip(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    @Override
    public String toString() {
        return "Clip{" +
                "content='" + content + '\'' +
                '}';
    }

    @Override
    public Clip copyComponent(Component component) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("%s(%s) become clip at %s",content,component,now));
        return (Clip) component;
    }
}
