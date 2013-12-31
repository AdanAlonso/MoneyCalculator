package moneycalculator.exchangerate;

import java.util.Date;
import moneycalculator.currency.Currency;

public class ExchangeRate {

    private Date date;
    private Currency fromCurrency;
    private Currency toCurrency;
    private double rate;

    public ExchangeRate(Date date, Currency fromCurrency, Currency toCurrency, double rate) {
        this.date = date;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public double getRate() {
        return rate;
    }
}
