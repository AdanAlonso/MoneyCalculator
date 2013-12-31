package moneycalculator;

import moneycalculator.currency.MockCurrencySetLoader;
import moneycalculator.currency.CurrencySetLoader;
import moneycalculator.command.Command;
import moneycalculator.command.CommandMap;
import java.io.IOException;
import moneycalculator.command.ActionListenerFactory;
import moneycalculator.currency.CurrencySet;
import moneycalculator.exchangerate.ExchangeRate;
import moneycalculator.exchangerate.MockExchangeRateLoader;
import moneycalculator.money.ConsoleMoneyExchanger;
import moneycalculator.money.Money;

public class Application {

    private CurrencySetLoader currencySetLoader;
    private CommandMap map;
    private ApplicationFrame frame;

    public static void main(String[] args) throws IOException {
        new Application().execute();
    }

    private void execute() {
        loadCurrencySet();
        createCommandMap();
        createApplicationFrame();
    }

    private void loadCurrencySet() {
        currencySetLoader = new MockCurrencySetLoader();
        currencySetLoader.load();
    }

    private void createCommandMap() {
        map = new CommandMap();

        map.add("exit", new Command() {
            @Override
            public void execute() {
                frame.dispose();
            }
        });

        map.add("exchange", new Command() {
            @Override
            public void execute() {
                double amount = (isDoubleAndNotEmpty(frame.getAmount().getText()) ? Double.valueOf(frame.getAmount().getText()) : 0);
                Money moneyFrom = new Money(amount, CurrencySet.getInstance().search(frame.getCurrencyFrom().toString()));
                ExchangeRate rate = new MockExchangeRateLoader().load(moneyFrom.getCurrency(), CurrencySet.getInstance().search(frame.getCurrencyTo().toString()));
                moneycalculator.money.MoneyCalculator calculator = new moneycalculator.money.MoneyCalculator(moneyFrom, rate);
                Money result = calculator.exchange();
                frame.getResult().setText(Double.toString(moneyFrom.getAmount()) + " " + result.getCurrency().getCode());
            }

            private boolean isDoubleAndNotEmpty(String text) {
                try {
                    Double.parseDouble(text);
                }
                catch (NumberFormatException e) {
                    return false;
                }
                return (text.length() > 0);
            }
        });
    }

    private void createApplicationFrame() {
        frame = new ApplicationFrame(new ActionListenerFactory(map));
    }
}
