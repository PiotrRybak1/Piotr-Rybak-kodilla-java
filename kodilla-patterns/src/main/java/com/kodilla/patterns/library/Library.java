package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setLibraryName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }


    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();

    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book : books) {
            Book clonedBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());

            cloneLibrary.getBooks().add(clonedBook);
        }

        return cloneLibrary;
    }
}

