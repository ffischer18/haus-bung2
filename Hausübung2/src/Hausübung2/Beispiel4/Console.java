/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung2.Beispiel4;

import java.util.Scanner;

/**
 *
 * @author fisch
 */
public class Console {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RationalCalculator rc = new RationalCalculator();
        VectorCalculator vc = new VectorCalculator();
        ComplexCalculator cc = new ComplexCalculator();
        while (true) {
            menu();
            int calculator = Integer.parseInt(sc.nextLine());
            
            if(calculator == 4){
                System.exit(0);
            }

            System.out.print("Enter number x a> ");
            double numberXa = Integer.parseInt(sc.nextLine());
            System.out.print("Enter number x b> ");
            double numberXb = Integer.parseInt(sc.nextLine());
            System.out.print("Enter number y a> ");
            double numberYa = Integer.parseInt(sc.nextLine());
            System.out.print("Enter number y b> ");
            double numberYb = Integer.parseInt(sc.nextLine());

            Number a = new Number();
            a.setA(numberXa);
            a.setB(numberXb);
            Number b = new Number();
            b.setA(numberYa);
            b.setB(numberYb);

            calcOp();
            int operation = Integer.parseInt(sc.nextLine());

            switch (calculator) {
                case 1:
                    switch (operation) {
                        case 1:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + rc.add(a, b).getA());
                            System.out.println("b = " + rc.add(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 2:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + rc.substract(a, b).getA());
                            System.out.println("b = " + rc.substract(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 3:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + rc.multiply(a, b).getA());
                            System.out.println("b = " + rc.multiply(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 4:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + rc.divide(a, b).getA());
                            System.out.println("b = " + rc.divide(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        default:
                            System.out.println("Falsche Eingabe!");
                            break;
                    }
                    break;

                case 2:
                    switch (operation) {
                        case 1:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + vc.add(a, b).getA());
                            System.out.println("b = " + vc.add(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 2:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + vc.substract(a, b).getA());
                            System.out.println("b = " + vc.substract(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 3:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + vc.multiply(a, b).getA());
                            System.out.println("b = " + vc.multiply(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 4:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + vc.divide(a, b).getA());
                            System.out.println("b = " + vc.divide(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        default:
                            System.out.println("Falsche Eingabe!");
                            break;
                    }
                    break;

                case 3:
                    switch (operation) {
                        case 1:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + cc.add(a, b).getA());
                            System.out.println("b = " + cc.add(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 2:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + cc.substract(a, b).getA());
                            System.out.println("b = " + cc.substract(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 3:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + cc.multiply(a, b).getA());
                            System.out.println("b = " + cc.multiply(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        case 4:
                            System.out.println("----------------------------");
                            System.out.println("Solution:");
                            System.out.println("a = " + cc.divide(a, b).getA());
                            System.out.println("b = " + cc.divide(a, b).getB());
                            System.out.println("----------------------------");
                            break;

                        default:
                            System.out.println("Falsche Eingabe!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Falsche Eingabe!");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("Choose calculator:");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
        System.out.print("> ");
    }

    private static void calcOp() {
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - devide");
        System.out.println("5 - enter numbers again");
        System.out.print("> ");
    }
}
