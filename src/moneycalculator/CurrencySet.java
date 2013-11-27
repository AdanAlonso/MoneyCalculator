package moneycalculator;

import java.util.HashSet;

public class CurrencySet extends HashSet<Currency> {

    private static CurrencySet instance;

    private CurrencySet() {
    }

    public static CurrencySet getInstance() {
        if (instance == null)
            instance = new CurrencySet();
        return instance;
    }
    
    public Currency search(String token) {
        for (Currency currency : this) {
            if (currency.getCode().equals(token)) {
                return currency;
            }
            if (currency.getName().equals(token)) {
                return currency;
            }
            if (currency.getSymbol().equals(token)) {
                return currency;
            }
        }
        return null;
    }
}
