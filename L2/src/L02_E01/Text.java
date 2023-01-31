package L02_E01;

import java.time.LocalDateTime;

public class Text implements Component{
    private String content;

    public Text(String content) {
        this.content = content;

    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Text{" +
                "content='" + content + '\'' +
                '}';
    }

    @Override
    public Text copyComponent(Component component) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(String.format("%s(%s) became text at %s",content,component,now));
        return (Text) component;
    }
}
