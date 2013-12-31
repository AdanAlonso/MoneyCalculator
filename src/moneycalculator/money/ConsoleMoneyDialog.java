package moneycalculator.money;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.currency.ConsoleCurrencyDialog;

public class ConsoleMoneyDialog implements MoneyDialog {

    private Money money;
    
    public ConsoleMoneyDialog() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (money == null) {
            String amount = " ";
            while (!(isDouble(amount))) {
                try {
                    System.out.println("Insert amount:");
                    amount = reader.readLine();
                }
                catch (IOException ex) {
                    Logger.getLogger(ConsoleMoneyDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                      
            money = new Money(Double.valueOf(amount), new ConsoleCurrencyDialog().getCurrency());
        }
    }

    @Override
    public Money getMoney() {
        return money;
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
