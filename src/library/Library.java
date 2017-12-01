/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.math.BigDecimal;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kernelpanic
 */
public class Library {

    static long currentINumber = 0;

    final Map<ISBNCode, Book> books = new HashMap<>();

    static long newInventoryNumber() {
        return currentINumber++;
    }

    public void addBook(ISBNCode ID, String name, String author, String publicationPlace, String publisher, Year pubYear, int pageCount, BigDecimal price, int copiesNumber) {
        books.put(ID, new Book(ID, name, author, publicationPlace, publisher, pubYear, pageCount, price, copiesNumber));
    }

    public void deleteBook(ISBNCode code) {
        if (books.containsKey(code)) {
            books.remove(code);
        } else {
            throw new RuntimeException("There is no book with this ISBN" + code);
        }
    }

}
