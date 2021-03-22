package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book theSelfishGene = new Book("The Selfish Gene", "Richard Dawkins",
                LocalDate.of(1976, 1, 1));
        Book theExtendedPhenotype = new Book("The Extended Phenotype", "Richard Dawkins",
                LocalDate.of(1982, 1, 1));
        Library library = new Library("Biologist library");
        library.books.add(theSelfishGene);
        library.books.add(theExtendedPhenotype);
        Library deepClone = null, shallowClone = null;

        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Biologist library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Biologist library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(theExtendedPhenotype);

        //Then
        assertEquals(1, library.books.size());
        assertEquals(1, shallowClone.books.size());
        assertEquals(2, deepClone.books.size());
    }
}
