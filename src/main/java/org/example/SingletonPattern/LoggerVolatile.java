package org.example.SingletonPattern;

public class LoggerVolatile {
//    public static final Logger INSTANCE = new Logger();
    public static volatile LoggerVolatile instance;
    private LoggerVolatile(){

    }
//    public Logger getInstance(){
//        if(instance == null)
//            instance = new Logger();
//        return instance;
//    }
//    public synchronized Logger getInstance(){
//        if(instance == null)
//            instance = new Logger();
//        return instance;
//    }
    public static LoggerVolatile getInstance(){
        if(instance == null)
            synchronized (LoggerVolatile.class){
                if(instance == null)
                    instance = new LoggerVolatile();
            }
        return instance;
    }
}
