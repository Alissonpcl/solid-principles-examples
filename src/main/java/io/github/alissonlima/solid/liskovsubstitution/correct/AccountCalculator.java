package io.github.alissonlima.solid.liskovsubstitution.correct;

public class AccountCalculator {

    public double getValueAvailable(BankAccount bankAccount){
        return bankAccount.getBalance();
    }
}
