package moneycalculator;

public class DoubleNumber implements Number {


    private double value;

    public DoubleNumber(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public Number add(Number addend) {
        return new DoubleNumber(this.getValue() + addend.getValue());
    }

    @Override
    public Number substract(Number subtrahend) {
        return new DoubleNumber(this.getValue() - subtrahend.getValue());
    }

    @Override
    public Number multiply(Number multiplier) {
        return new DoubleNumber(this.getValue() * multiplier.getValue());
    }

    @Override
    public Number divide(Number divisor) {
        return new DoubleNumber(this.getValue() / divisor.getValue());
    }
    
    @Override
    public String toString() {
        return Double.toString(value);
    }
}
