package moneycalculator.exchanger.console;

import moneycalculator.exchangerateloader.MockExchangeRateLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.exchanger.console.CurrencyDialog;
import moneycalculator.ExchangeRate;
import moneycalculator.exchanger.console.MoneyDialog;
import moneycalculator.MoneyCalculator;
import moneycalculator.exchanger.Exchanger;

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