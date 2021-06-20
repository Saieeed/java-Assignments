/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.function.BiPredicate;
import java.util.List;

/**
 *
 * @author saiee
 */
public class JavaApplication2 {


    public static void main(String[] args) {
        String string1 = "sayed abd el men3em mostafa ebrahem sayed";
        String string2 = "......";
        Sad d = new Sad();
      String betterString = d.betterString(string1,string2, (s1,s2)->s1.length()>s2.length());
    System.out.println(betterString);
    
    }
    
}
