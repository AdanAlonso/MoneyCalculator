package moneycalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyDialog {

    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void execute() throws IOException {
        do {
            System.out.println("Introduce una divisa: ");

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            currency = findCurrency(input.readLine());
            if (currency != null) {
                break;
            }
            System.out.println("No se ha encontrado ninguna divisa coindicente");
        } while (currency != null);

    }

    private Currency findCurrency(String readLine) {
        return CurrencySet.getInstance().search(readLine);
    }
}
