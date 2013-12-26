package moneycalculator.exchanger.console;

import moneycalculator.exchanger.console.CurrencyDialog;
import moneycalculator.number.DoubleNumber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import moneycalculator.Money;

public class MoneyDialog {

    private Money money;

    public MoneyDialog() {
    }

    public Money getMoney() {
        return money;
    }

    public void execute() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (money == null) {
            String amount = " ";
            while (!(isDouble(amount))) {
                System.out.println("Insert amount:");
                amount = reader.readLine();
            }
            CurrencyDialog currencyDialog = new CurrencyDialog();
            currencyDialog.execute();
            money = new Money(new DoubleNumber(Double.valueOf(amount)), currencyDialog.getCurrency());
        }
    }

    private boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
