package moneycalculator.currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleCurrencyDialog implements CurrencyDialog {

    private Currency currency;

    public ConsoleCurrencyDialog() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (currency == null) {
            System.out.println("Insert currency:");
            String readCurrency = " ";
            try {
                readCurrency = reader.readLine();
            }
            catch (IOException ex) {
                Logger.getLogger(ConsoleCurrencyDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.currency = CurrencySet.getInstance().search(readCurrency);
        }

    }

    @Override
    public Currency getCurrency() {
        return currency;
    }
}
