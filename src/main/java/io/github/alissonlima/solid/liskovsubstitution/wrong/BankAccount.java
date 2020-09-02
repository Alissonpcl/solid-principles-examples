package io.github.alissonlima.solid.liskovsubstitution.wrong;

public class BankAccount {

    public double getBalance(){
        return 100d;
    }

    public double getOverdraftLimit(){
        return 1000d;
    }
}
