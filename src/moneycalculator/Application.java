package moneycalculator;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new MockCurrencySetLoader().load();
        MoneyDialog moneyDialog = new MoneyDialog();
        moneyDialog.execute();
        System.out.println(moneyDialog.getMoney());
    }
}
