package moneycalculator.money;

import moneycalculator.exchangerate.MockExchangeRateLoader;
import moneycalculator.exchangerate.ExchangeRate;
import moneycalculator.currency.ConsoleCurrencyDialog;
import moneycalculator.currency.Currency;

public class ConsoleMoneyExchanger implements MoneyExchanger {

    @Override
    public void execute() {
            System.out.println("Insert money to be converted:");
            Money moneyFrom = new ConsoleMoneyDialog().getMoney();

            System.out.println("Insert new currency:");
            Currency currencyTo = new ConsoleCurrencyDialog().getCurrency();

            ExchangeRate rate = new MockExchangeRateLoader().load(moneyFrom.getCurrency(), currencyTo);
            Money moneyTo = new MoneyCalculator(moneyFrom, rate).exchange();
            
            new ConsoleMoneyViewer(moneyTo).show();
    }
}
