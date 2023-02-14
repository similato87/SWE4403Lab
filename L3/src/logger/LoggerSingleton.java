package logger;

import java.util.HashSet;

public class LoggerSingleton {
    private static HashSet<LoggerSingleton> loggerSingletonList;
    private String filename;
    public static String content;

    public LoggerSingleton(String filename) {
        this.filename=filename;
    }
    public static LoggerSingleton getInstance(String filename) {
        if (loggerSingletonList ==null)
        loggerSingletonList = new HashSet<LoggerSingleton>();
        for (LoggerSingleton file:loggerSingletonList) {
            if (file.filename==filename) {
                return file;
            }
        }
        LoggerSingleton loggerSingleton = new LoggerSingleton(filename);

        loggerSingletonList.add(loggerSingleton);

        return loggerSingleton;
    }

    public static HashSet<LoggerSingleton> getLoggerSingletonList() {
        return loggerSingletonList;
    }

    public void write(String message) {
        content+=message;
        System.out.println(String.format("Writing '%s' to the log.",message));
    }

    @Override
    public String toString() {
        return "LoggerSingleton{" +
                "filename='" + filename + '\'' +
                '}';
    }
}