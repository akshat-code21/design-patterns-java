package sir_notes.ProxyPattern;

public class LazyBookProxy implements ITextParser{
    private final String book;
    private BookParser bookParser;
    public LazyBookProxy(String book){
        this.book = book;
        this.bookParser = null;
    }

    private BookParser getInstance(){
        if(bookParser == null){
            bookParser = new BookParser(book);
        }
        return bookParser;
    }

    @Override
    public int getWordCount() {
        return getInstance().getWordCount();
    }

    @Override
    public int getSentenceCount() {
        return getInstance().getSentenceCount();
    }

    @Override
    public String searchWord(String word) {
        return getInstance().searchWord(word);
    }

    @Override
    public String searchRootWord(String word) {
        return getInstance().searchRootWord(word);
    }
}
