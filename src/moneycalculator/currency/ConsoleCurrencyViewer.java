package moneycalculator.currency;

public class ConsoleCurrencyViewer implements CurrencyViewer{

    private Currency currency;

    public ConsoleCurrencyViewer(Currency currency) {
        this.currency = currency;
    }
    
    @Override
    public void show() {
        System.out.println(currency.getSymbol() + " (" + currency.getCode() + ", " + currency.getName() + ")");
    }

}
