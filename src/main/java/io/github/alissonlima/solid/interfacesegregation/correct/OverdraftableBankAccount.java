package io.github.alissonlima.solid.interfacesegregation.correct;

public interface OverdraftableBankAccount extends BankAccount{
    double getOverdraftLimit();
}
