/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author kernelpanic
 */
public class BookCopy {

    ISBNCode id;
    LibraryPlace place;
    private boolean onHands;

    public BookCopy(ISBNCode id, long inventoryNumber) {
        this.id = id;
        this.onHands = false;
    }

    public void setOnHands(boolean onHands) {
        this.onHands = onHands;
    }

    public ISBNCode getId() {
        return id;
    }

    public LibraryPlace getPlace() {
        return place;
    }

    boolean isOnHands() {
        return onHands;
    }

}
