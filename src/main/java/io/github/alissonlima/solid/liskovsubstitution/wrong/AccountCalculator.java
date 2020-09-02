package io.github.alissonlima.solid.liskovsubstitution.wrong;

public class AccountCalculator {

    public double getValueAvailable(BankAccount bankAccount){
        return bankAccount.getBalance() + bankAccount.getOverdraftLimit();
    }
}
