/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung2.Beispiel3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fisch
 */
public class NumberTester {

    private final String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));) {
            // liest die erste Zeile und speichert sie ab
            String line1 = br.readLine();
            int testCases = 0;
            while(line1 != null){
                testCases = Integer.parseInt(line1);
            }
            
            // liest n Zeilen und speichert die Werte ab
            String[] lines = br.readLine().split(" ");
            while(lines != null){
                int proofes = Integer.parseInt(lines[0]);
                int solutions = Integer.parseInt(lines[1]);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}
