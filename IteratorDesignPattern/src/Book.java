public class Book {


    private int price;
    private String bookName;

    Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getBookName(){
        return bookName;
    }
}
