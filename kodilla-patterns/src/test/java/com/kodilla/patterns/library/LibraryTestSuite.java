package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("cool books");
        library.getBooks().add(new Book("Medicus", "Noah Gordon", LocalDate.of(1990, 1, 19)));
        library.getBooks().add(new Book("Operator 594", "Puval", LocalDate.of(2020, 9, 10)));
        library.getBooks().add(new Book("Chłopaki z marsa", "Naval", LocalDate.of(2018, 1, 5)));
        library.getBooks().add(new Book("Słowik", "Kristin Hannah", LocalDate.of(2020, 8, 14)));
        library.getBooks().add(new Book("Labirynt von Brauna", "Rafał Dębski", LocalDate.of(2015, 5, 29)));
        library.getBooks().add(new Book("Żelazne kamienie ", "Rafał Dębski", LocalDate.of(2017, 3, 7)));

        //checking the number of the library's collection
        Assert.assertEquals(6, library.getBooks().size());

        //When
        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setLibraryName("Library copy 1 - shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setLibraryName("Library copy 2 - deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());


    }

}
