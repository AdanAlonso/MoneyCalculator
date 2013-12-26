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
        for (Currency currency : CurrencySet.getInstance()) {
            if (currency.getCode().toLowerCase().equals(token.toLowerCase()))
                return currency;
            if (currency.getSymbol().toLowerCase().equals(token.toLowerCase()))
                return currency;
            if (currency.getName().toLowerCase().equals(token.toLowerCase()))
                return currency;
        }
        return null;
    }
}
