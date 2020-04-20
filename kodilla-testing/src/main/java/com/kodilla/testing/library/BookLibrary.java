package com.kodilla.testing.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> booksBorrowed = libraryDatabase.listBooksInHandsOf(libraryUser);

        return booksBorrowed;


    }
}

