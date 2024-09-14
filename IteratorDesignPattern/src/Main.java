import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Science",1000));
        books.add(new Book("Maths",2000));
        books.add(new Book("Social",3000));
        books.add(new Book("GK",4000));

        Library lb = new Library(books);

        Iterator it = lb.getIterator();

        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getBookName());
            System.out.println(book.getPrice());
        }

    }
}