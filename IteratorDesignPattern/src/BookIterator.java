import java.util.List;

public class BookIterator implements Iterator {

    private List<Book> books;
    private int index=0;


    public BookIterator(List<Book> books) {
        this.books=books;
    }

    @Override
    public boolean hasNext() {

        if(index<books.size()){
            return true;
        }

        return false;
    }

    @Override
    public Object next() {
        if(hasNext())
            return books.get(index++);

        return null;
    }
}
