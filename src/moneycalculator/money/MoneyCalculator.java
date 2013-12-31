package moneycalculator.money;

import moneycalculator.exchangerate.ExchangeRate;

public class MoneyCalculator {

    private Money money;
    private ExchangeRate rate;

    public MoneyCalculator(Money money, ExchangeRate rate) {
        this.money = money;
        this.rate = rate;
    }

    public Money exchange() {
        return new Money(money.getAmount() * rate.getRate(), rate.getToCurrency());
    }
}
