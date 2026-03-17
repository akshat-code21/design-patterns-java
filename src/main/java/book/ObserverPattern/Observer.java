package book.ObserverPattern;

public interface Observer {
    void update(float temp, float humidity, float pressure);

    void update();
}
