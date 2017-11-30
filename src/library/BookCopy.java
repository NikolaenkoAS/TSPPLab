/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Objects;

/**
 *
 * @author kernelpanic
 */
class BookCopy {
    ISBNCode id;
    LibraryPlace place;

    public BookCopy(ISBNCode id, LibraryPlace place) {
        this.id = id;
        this.place = place;
    }

    public ISBNCode getId() {
        return id;
    }

    public LibraryPlace getPlace() {
        return place;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.place);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }

        final BookCopy other = (BookCopy) obj;

        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        return Objects.equals(this.place, other.place);
    }

}
