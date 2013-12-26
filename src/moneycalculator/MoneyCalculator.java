package moneycalculator;

public class MoneyCalculator {

    private Money money;

    public MoneyCalculator() {
    }

    public void exchange(Money money, ExchangeRate rate) {
        this.money = new Money(money.getAmount().multiply(rate.getRate()), rate.getToCurrency());
    }

    public Money getMoney() {
        return money;
    }
}
