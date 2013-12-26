package moneycalculator;

import moneycalculator.number.Number;

public class Money {

    private Number amount;
    private Currency currency;

    public Money(Number amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Number getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount.toString() + currency;
    }
}
