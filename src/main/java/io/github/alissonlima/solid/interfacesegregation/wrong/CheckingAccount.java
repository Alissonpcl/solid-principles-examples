package io.github.alissonlima.solid.interfacesegregation.wrong;

public class CheckingAccount implements BankAccount {
    @Override
    public double getBalance() {
        return 100d;
    }

    //ERRADO
    //Aqui está a indicação que a interface BankAccount está quebrando
    //o princípio de Interface Segregation ao exigir que todas as suas
    //implementações implementem um método com uma regra de negócio
    //que não existe em todos os tipos de conta.
    @Override
    public double getProfitRate() {
        return 0;
    }

    @Override
    public double getOverdraftLimit() {
        return 1000d;
    }
}
