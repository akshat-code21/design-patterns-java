package sir_notes.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Client1 client1 = new Client1(new LazyBookProxy("ok"));
        client1.getWordCount();
    }
}
