package io.github.alissonlima.solid.interfacesegregation.correct;

public interface BankAccount {
    //CORRETO
    //Aplicando o principio e Liskov Substitution em nossa interface fazemos
    //com que ela exija a implementação apenas dos comportamentos que são
    //comuns a todos os tipos de conta bancária e delegamos para suas filhas
    //OverdraftableBankAccount e ProfitableBankAccount a responsabilidade de
    //exigir seus comportamentos específicos.
    double getBalance();
}
