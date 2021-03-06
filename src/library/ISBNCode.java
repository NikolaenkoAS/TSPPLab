/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.regex.Pattern;

/**
 *
 * @author kernelpanic
 */
public class ISBNCode {

    final String value;
    static final Pattern ISBNPattern = Pattern.compile("[\\d]+");

    @Override
    public String toString() {
        return value;
    }

    
    public ISBNCode(String value) {
        if (isValidISBN(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid ISBN code.");
        }
    }

    private boolean isValidISBN(String value) {
        if (value.length() != 10) {
            return false;
        }

        return ISBNPattern.matcher(value).matches();
    }
}
