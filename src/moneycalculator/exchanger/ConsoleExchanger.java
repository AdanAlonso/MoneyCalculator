package moneycalculator.exchanger;

import moneycalculator.exchangerateloader.MockExchangeRateLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.CurrencyDialog;
import moneycalculator.ExchangeRate;
import moneycalculator.MoneyDialog;
import moneycalculator.MoneyCalculator;

public class ConsoleExchanger implements Exchanger {

    @Override
    public void execute() {
        try {
            System.out.println("Insert money to be converted:");
            MoneyDialog moneyDialog = new MoneyDialog();
            moneyDialog.execute();

            System.out.println("Insert new currency:");
            CurrencyDialog currencyDialog = new CurrencyDialog();
            currencyDialog.execute();

            ExchangeRate rate = new MockExchangeRateLoader().load(moneyDialog.getMoney().getCurrency(), currencyDialog.getCurrency());
            MoneyCalculator exchanger = new MoneyCalculator();
            exchanger.exchange(moneyDialog.getMoney(), rate);

            System.out.println(exchanger.getMoney());
        }
        catch (IOException ex) {
            Logger.getLogger(ConsoleExchanger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
