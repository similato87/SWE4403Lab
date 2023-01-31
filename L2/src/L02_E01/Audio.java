package L02_E01;

import java.time.LocalDateTime;

public class Audio implements Component{

    private String content;

    public Audio(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    @Override
    public Audio copyComponent(Component component) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("%s(%s) became audio at %s",content,component,now));
        return (Audio) component;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "content='" + content + '\'' +
                '}';
    }
}
