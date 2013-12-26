package moneycalculator;

import moneycalculator.currencysetloader.MockCurrencySetLoader;
import java.io.IOException;
import moneycalculator.exchanger.swing.SwingExchanger;

public class Application {

    public static void main(String[] args) throws IOException {
        new MockCurrencySetLoader().load();
        new SwingExchanger().execute();
    }
}
