package moneycalculator;

import java.util.Date;

public interface ExchangeRateLoader {

    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency);

    public ExchangeRate load(Currency fromCurrency, Currency toCurrency);
}
