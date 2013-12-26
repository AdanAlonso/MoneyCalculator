package moneycalculator.exchangerateloader;

import java.util.Date;
import moneycalculator.Currency;
import moneycalculator.ExchangeRate;

public interface ExchangeRateLoader {

    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency);

    public ExchangeRate load(Currency fromCurrency, Currency toCurrency);
}
