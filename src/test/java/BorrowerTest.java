import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void collectionStartsAtZero(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void countCollection(){
        borrower.borrowBook(library);
        borrower.borrowBook(library);
        borrower.borrowBook(library);
        assertEquals(3, borrower.countCollection());
    }

    @Test
    public void borrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.countCollection());
    }
}
