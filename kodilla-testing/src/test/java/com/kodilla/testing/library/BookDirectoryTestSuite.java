package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    @Test
    public void testlistBooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = generateListOfNBooks(0);
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Henryk", "Javalski", "67120456789")))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Zofia", "Pajton", "81120456889")))
                .thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Janusz", "Siszarp", "89120456710")))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(new LibraryUser("Henryk", "Javalski", "67120456789"));
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(new LibraryUser("Zofia", "Pajton", "81120456889"));
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(new LibraryUser("Janusz", "Siszarp", "89120456710"));
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book();
            resultList.add(theBook);
        }
        return resultList;
    }
}
