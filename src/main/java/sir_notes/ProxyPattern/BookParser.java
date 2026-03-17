package sir_notes.ProxyPattern;

public class BookParser implements ITextParser{
    String book;
    public BookParser(String book){
        this.book = book;
        // does heavy tasks like pos tagging, parsing entire text etc.
    }
    @Override
    public int getWordCount() {
        return 0;
    }

    @Override
    public int getSentenceCount() {
        return 0;
    }

    @Override
    public String searchWord(String word) {
        return "";
    }

    @Override
    public String searchRootWord(String word) {
        return "";
    }
}
