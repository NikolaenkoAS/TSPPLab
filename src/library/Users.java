/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kernelpanic
 */
public class Users {

    private static final Map<String, User> users = new HashMap<>();

    public static boolean contains(String login) {
        return users.containsKey(login);
    }
    
    
}
