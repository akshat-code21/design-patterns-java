package org.example.SingletonPattern;

public class LoggerHolder {
    private LoggerHolder() {}
    private static class Holder{
        private static final LoggerHolder INSTANCE = new LoggerHolder();
    }
    public static LoggerHolder getInstance(){
        return Holder.INSTANCE;
    }
}
