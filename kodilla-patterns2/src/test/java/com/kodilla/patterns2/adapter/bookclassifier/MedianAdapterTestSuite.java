package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("A1", "T1", 2001, "23453254"));
        books.add(new Book("A2", "T2", 1987, "88763767"));
        books.add(new Book("A3", "T3", 1995, "13489348"));
        books.add(new Book("A4", "T4", 2010, "56547984"));
        books.add(new Book("A5", "T5", 2019, "17397457"));

        //When & Then
        assertEquals(2001, adapter.publicationYearMedian(books));
    }
}
