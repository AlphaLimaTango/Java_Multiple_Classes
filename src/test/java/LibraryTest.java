import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Gone Girl", "Gillian Flynn", "Thriller");
        library.addBook(book);
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        library.addBook(new Book("Harry Potter", "JK Rowling", "Fiction"));
        assertEquals(5, library.countBooks());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void canRemoveBook(){
        library.removeBook(book);
        assertEquals(0, library.getCapacity());
    }
}
