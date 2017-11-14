package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype{
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy()throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy()throws CloneNotSupportedException{
        Library clonedLibrary = shallowCopy();
        clonedLibrary.name = name + " cloned";
        clonedLibrary.books = new HashSet<>();
        for(Book book : books){
            clonedLibrary.books.add(book);
        }
        return clonedLibrary;
    }
}