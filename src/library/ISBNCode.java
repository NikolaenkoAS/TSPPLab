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
class ISBNCode {
    final String value;
    static final  Pattern  ISBNPattern = Pattern.compile("[\\d]{1,4}[-|\\s]");

    public ISBNCode(String value) {
        if(isValidISBN(value)){
            this.value = value;
        }else{
            throw new IllegalArgumentException("Invalid ISBN code.");
        }
    }

    private boolean isValidISBN(String value) {
        String[] t = value.split("-");
        
        for (String it : t){
            
        }
    }
}
