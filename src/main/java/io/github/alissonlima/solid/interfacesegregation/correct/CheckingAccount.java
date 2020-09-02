package io.github.alissonlima.solid.interfacesegregation.correct;

public class CheckingAccount implements OverdraftableBankAccount{

    @Override
    public double getBalance() {
        return 100d;
    }

    @Override
    public double getOverdraftLimit() {
        return 1000d;
    }
}
