package moneycalculator.money;

import moneycalculator.currency.ConsoleCurrencyViewer;

public class ConsoleMoneyViewer implements MoneyViewer {

    private Money money;

    public ConsoleMoneyViewer(Money money) {
        this.money = money;
    }
    
    @Override
    public void show() {
        System.out.print(money.getAmount() + " ");
        new ConsoleCurrencyViewer(money.getCurrency()).show();
    }

    
}
