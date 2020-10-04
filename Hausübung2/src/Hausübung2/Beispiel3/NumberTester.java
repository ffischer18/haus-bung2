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
        // Testet ob die Zahl gerade oder ungerade ist
        oddTester = (n)
                -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        // Testet ob die Zahl eine Primzahl ist
        primeTester = (n)
                -> {
            // Wenn n kleiner/gleich 2 wird es auf 2 gesetzt (2 kleinste Primzahl)
            if (n <= 2) {
                return (n == 2);
            }
            // Es wird geprüft ob n ein Vielfaches von i ist und ob die zahl durch 2 teilbar ist
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));) {
            // liest die erste Zeile und speichert sie ab
            String line1 = br.readLine();
            int testCases = 0;
            while (line1 != null) {
                testCases = Integer.parseInt(line1);
            }

            // liest n Zeilen und speichert die Werte ab
            String[] lines = br.readLine().split(" ");
            while (lines != null) {
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
