package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Library library = new Library("Library");
        library.getBooks().add(new Book("Przeminęło z Lemurem", "Grzegorz Grz",
                LocalDate.of(1410, 10, 10)));
        library.getBooks().add(new Book("Przeminęło z Arturem", "Hadrian Grz",
                LocalDate.of(1420, 10, 10)));
        //when
        Library shallowCopyLibrary = null;
        Library deepCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        library.getBooks().remove(1);
        //then
        Assert.assertEquals(library.getBooks().size(), shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(2, deepCopyLibrary.getBooks().size());
    }
}
