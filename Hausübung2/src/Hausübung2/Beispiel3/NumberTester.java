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

        // Testet ob die Zahl ein Palindrom ist (vorwärt/rückwärts gelesen die gleiche zahl ergibt)
        palindromeTester = (n) -> {
            int originalInteger = n;
            int reversedInteger = 0;

            // Solange n ungleich 0 ist wird im remainder der letzte Wert einer Zahl berechnet
            // Der remainder wird zu reversedInteger addiert sodass der er Wert zum nächsten Stellenwert addiert werden kann
            // *10 (Zehnerstelle, Hunderterstelle, ..)
            // Danach wird der letzte Stellenwert gelöscht (/10)
            while (n != 0) {
                int remainder = n % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                n = n / 10;
            }

            // vergleicht beide Integer
            if (originalInteger == reversedInteger) {
                return true;
            } else {
                return false;
            }
        };

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));) {
            // liest die erste Zeile und speichert sie ab
            String line1 = br.readLine();
            int testCases = 0;
            while (line1 != null) {
                testCases = Integer.parseInt(line1);
            }

            // liest n Zeilen und speichert die Werte ab
            String lines = br.readLine();
            while (!lines.isEmpty()) {
                
                String[] split = lines.split(" ");
                int proofes = 0;
                int solutions = 0;
                while (split != null) {
                    proofes = Integer.parseInt(split[0]);
                    solutions = Integer.parseInt(split[1]);
                }
                // Testet die jeweiligen Fälle
                switch(proofes){
                    case 1:
                        oddTester.testNumber(solutions);
                        setOddEvenTester(oddTester);
                        if(oddTester.equals(true)){
                            System.out.println("Die Zahl ist gerade");
                        } else {
                            System.out.println("Die Zahl ist ungerade");
                        }
                        break;
                        
                    case 2:
                        primeTester.testNumber(solutions);
                        setPrimeTester(primeTester);
                        if(primeTester.equals(true)){
                            System.out.println("Die Zahl ist eine Primzahl");
                        } else {
                            System.out.println("Die Zahl ist keine Primzahl");
                        }
                        break;
                        
                    case 3:
                        palindromeTester.testNumber(solutions);
                        setPalindromeTester(palindromeTester);
                        if(palindromeTester.equals(true)){
                            System.out.println("Die Zahl ist eine Palindromzahl");
                        } else {
                            System.out.println("Die Zahl ist keine Palindromzahl");
                        }
                        break;
                    
                    default:
                        System.out.println("Falsche überpüfung!");
                        break;
                }
                
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}
