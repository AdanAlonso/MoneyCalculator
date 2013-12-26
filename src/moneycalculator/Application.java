package moneycalculator;

import moneycalculator.exchanger.ConsoleExchanger;
import moneycalculator.currencysetloader.MockCurrencySetLoader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new MockCurrencySetLoader().load();
        new ConsoleExchanger().execute();
    }
}
