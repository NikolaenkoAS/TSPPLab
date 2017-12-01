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
public class LibraryPlace {
    final int rack;
    final byte shelf;

    public LibraryPlace(int rack, byte shelf) {
        if(rack < 0 || shelf < 0){
            throw new IllegalArgumentException("Rack or shelf number can't be negative.");
        }
        
        this.rack = rack;
        this.shelf = shelf;
    }
    
    
}
