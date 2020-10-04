/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung2.Beispiel4;

/**
 *
 * @author fisch
 */
public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation substract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }
    
    public abstract Number add(Number a, Number b);
    public abstract Number substract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}
