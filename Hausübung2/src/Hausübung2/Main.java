/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung2;

import Hausübung2.Beispiel3.NumberTester;

/**
 *
 * @author fisch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("file.txt");
        nt.testFile();
    }
    
}
