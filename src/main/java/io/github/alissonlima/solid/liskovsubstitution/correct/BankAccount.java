package io.github.alissonlima.solid.liskovsubstitution.correct;

public class BankAccount {

    //CORRETO
    //Aplicando o princípio de Liskov Substitution corretamente alteramos
    //a estrutura da nossa classe pai para que ela possui apenas o comportamento
    //que de fato pertence a sua regra de negócio e delegamos para suas filhas
    //ChekingAccount e SavingsAccount suas responsabilidades específicas.
    //Agora toda a implementação que utilizar BankAccount poderá receber qualquer
    //uma de suas filhas sem que o código seja quebrado.
    public double getBalance(){
        return 100d;
    }
}
