package moneycalculator;

public abstract class Number {
    
    public abstract double getValue();
    
    public abstract Number add(Number sumand);

    public abstract Number substract(Number sustraend);

    public abstract Number multiply(Number multiplier);

    public abstract Number divide(Number divisor);
}
