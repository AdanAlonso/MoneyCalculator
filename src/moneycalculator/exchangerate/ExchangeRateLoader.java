package moneycalculator.exchangerate;

import java.util.Date;
import moneycalculator.currency.Currency;

public interface ExchangeRateLoader {

    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency);

    public ExchangeRate load(Currency fromCurrency, Currency toCurrency);
}
