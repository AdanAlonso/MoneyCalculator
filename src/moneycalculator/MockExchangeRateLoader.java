package moneycalculator;

import java.util.Date;

public class MockExchangeRateLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency) {
        return new ExchangeRate(date, fromCurrency, toCurrency, new DoubleNumber(1.9));
    }

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        return load(new Date(), fromCurrency, toCurrency);
    }

}
