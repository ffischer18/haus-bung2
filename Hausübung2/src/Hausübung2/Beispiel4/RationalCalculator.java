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
public class RationalCalculator extends AbstractCalculator{

    public RationalCalculator() {
        super( (Number a, Number b) -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() + b.getA() * a.getB());
            n.setB(a.getB() * b.getB());
            return n;
        },  (Number a, Number b) -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() - b.getA() * a.getB());
            n.setB(a.getB() * b.getB());
            return n;
        }, (Number a, Number b) -> {
            Number n = new Number();
            if(n.getB() == a.getB()){
                n.setA(a.getA() * b.getA());
                n.setB(a.getB() * b.getB());
            }
            else if(n.getB() == a.getB() * b.getB()){
                n.setA(a.getA() * b.getA());
                n.setB(a.getB());
            }
            return n;
        }, (Number a, Number b) -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB());
            n.setB(a.getB() * b.getA());
            return n;
        });
    }

    @Override
    public Number add(Number a, Number b) {
        return this.add.calc(a, b);
    }

    @Override
    public Number substract(Number a, Number b) {
        return this.substract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return this.divide.calc(a, b);
    }
    
}
