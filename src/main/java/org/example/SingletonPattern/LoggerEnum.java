package org.example.SingletonPattern;

public enum LoggerEnum {
    INSTANCE;
    public void log(String msg){
        System.out.println(msg);
    }
}
