/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kernelpanic
 */
public class Book {

    final ISBNCode ID;
    final String name;
    final String Author;
    final String publicationPlace;
    final String publisher;
    final Year pubYear;
    final int pageCount;
    final BigDecimal price;
    int copiesNumber;
    List<BookCopy> copies;

    public Book(ISBNCode ID, String name, String Author, String publicationPlace, String publisher, Year pubYear, int pageCount, BigDecimal price) {
        this.ID = ID;
        this.name = name;
        this.Author = Author;
        this.publicationPlace = publicationPlace;
        this.publisher = publisher;
        this.pubYear = pubYear;
        this.pageCount = pageCount;
        this.price = price;
        this.copiesNumber = 0;
    }
    
    public void addCopy(int rack, byte shelf){
        copies.add(new BookCopy(ID, new LibraryPlace(rack, shelf)));
    }

    public ISBNCode getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public String getPublisher() {
        return publisher;
    }

    public Year getPubYear() {
        return pubYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getCopiesNumber() {
        return copiesNumber;
    }

}
