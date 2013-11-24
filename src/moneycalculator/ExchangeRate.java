package moneycalculator;

import java.util.Date;

public class ExchangeRate {

    private Date date;
    private Currency fromCurrency;
    private Currency toCurrency;
    private Number rate;

    public ExchangeRate(Date date, Currency fromCurrency, Currency toCurrency, Number rate) {
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

    public Number getRate() {
        return rate;
    }
}
