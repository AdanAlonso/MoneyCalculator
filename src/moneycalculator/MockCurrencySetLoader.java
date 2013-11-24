package moneycalculator;

public class MockCurrencySetLoader implements CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = CurrencySet.getInstance();
        currencySet.add(new Currency("USD", "US Dollar", "$"));
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("GBP", "Pound Sterling", "£"));
        currencySet.add(new Currency("JPY", "Yen", "円"));
        return currencySet;
    }
}
