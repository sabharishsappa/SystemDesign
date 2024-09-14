import java.util.List;

public class Library {

    private List<Book> booksList;

    public Library(List<Book>booksList) {
        this.booksList = booksList;

    }

    public Iterator getIterator() {
        return new BookIterator(booksList);
    }
}
