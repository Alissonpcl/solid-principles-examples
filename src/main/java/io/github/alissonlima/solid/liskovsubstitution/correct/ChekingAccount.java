package io.github.alissonlima.solid.liskovsubstitution.correct;

public class ChekingAccount extends BankAccount{

    @Override
    public double getBalance() {
        return super.getBalance() + getOverdraftLimit();
    }

    public double getOverdraftLimit(){
        return 1000d;
    }
}
