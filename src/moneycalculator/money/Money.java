package moneycalculator.money;

import moneycalculator.currency.Currency;

public class Money {

    private double amount;
    private Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

}
