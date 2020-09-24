package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger setLogger = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (setLogger == null) {
            synchronized (Logger.class) {
                if (setLogger == null) {
                    setLogger = new Logger();
                }
            }
        }
        return setLogger;
    }


    public void log(String log) {
        this.lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
