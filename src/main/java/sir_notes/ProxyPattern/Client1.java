package sir_notes.ProxyPattern;

public class Client1 {
    private ITextParser parser;
    public Client1(ITextParser parser){
        this.parser = parser;
    }
    public int getWordCount(){
        return parser.getWordCount();
    }
    // other client methods
}
