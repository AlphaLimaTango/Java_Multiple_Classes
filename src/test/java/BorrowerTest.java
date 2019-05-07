import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        library.addBook(new Book("Gone Girl", "Gillian Flynn", "Thriller"));
    }

    @Test
    public void countCollection(){
        assertEquals(2, borrower.countCollection());
    }

    @Test
    public void borrowBook(){
        borrower.borrowBook(library);
        assertEquals(3, borrower.countCollection());
    }
}
