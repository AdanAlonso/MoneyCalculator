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
            if (currency.getCode().equalsIgnoreCase(token))
                return currency;
            if (currency.getSymbol().equalsIgnoreCase(token))
                return currency;
            if (currency.getName().contains(token))
                return currency;
        }
        return null;
    }
}
