package logger;

public class Logger {
    private String fileName;
    private String text;

    public Logger(String fileName) {
        this.fileName = fileName;
        text = new String();
    }

    public void write(String message) {
        text+=message;
        System.out.println(String.format("Writing a message to the %s, now the text is %s.",fileName,text));
    }
}