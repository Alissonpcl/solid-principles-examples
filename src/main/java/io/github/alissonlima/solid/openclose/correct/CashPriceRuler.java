package io.github.alissonlima.solid.openclose.correct;

public class CashPriceRuler implements PriceRuler {
    @Override
    public double calculateRuleValue(double actualPrice) {
        return calculate10PercentDiscount(actualPrice) * -1;
    }

    private double calculate10PercentDiscount(double actualPrice) {
        return actualPrice * (10d / 100d);
    }
}
