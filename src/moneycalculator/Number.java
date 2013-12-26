package moneycalculator;

public interface Number {
    
    public double getValue();
    
    public Number add(Number sumand);

    public Number substract(Number sustraend);

    public Number multiply(Number multiplier);

    public Number divide(Number divisor);
}
