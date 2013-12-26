package moneycalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyDialog {

    private Currency currency;

    public CurrencyDialog() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public void execute() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (currency == null) {
            System.out.println("Insert currency:");
            String readCurrency = reader.readLine();
            this.currency = CurrencySet.getInstance().search(readCurrency);
        }

    }
}
