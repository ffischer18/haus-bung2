/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung2.Beispiel2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author fisch
 */
public class HalloJavamitForEach {
    
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        // Liste erzeugen und ausgeben
        for (String string : list) {
            System.out.println(string);
        }
        
        list.forEach((String s) -> System.out.println(s));
        
        Consumer<String> consumer = (String s) -> System.out.println(s);
        list.forEach(consumer);
        
        list.forEach(System.out :: print);
    }
    
}
