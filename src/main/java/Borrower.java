import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countCollection() {
        return this.collection.size();
    }

    public void borrowBook(Library library) {
    }
}
