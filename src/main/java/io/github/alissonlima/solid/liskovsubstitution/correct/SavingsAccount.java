package io.github.alissonlima.solid.liskovsubstitution.correct;

public class SavingsAccount extends BankAccount{

    @Override
    public double getBalance() {
        return 10000d + getActualProfitRate(10000d);
    }

    public double getActualProfitRate(double actualPrice){
        return calculate8Percent(actualPrice);
    }

    private double calculate8Percent(double actualPrice) {
        return actualPrice * (8d / 100d);
    }
}
