package sir_notes.ProxyPattern;

public interface ITextParser {
    int getWordCount();
    int getSentenceCount();
    String searchWord(String word);
    String searchRootWord(String word);
}
