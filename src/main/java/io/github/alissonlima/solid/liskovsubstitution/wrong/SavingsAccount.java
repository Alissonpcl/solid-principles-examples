package io.github.alissonlima.solid.liskovsubstitution.wrong;

public class SavingsAccount extends BankAccount{

    //EERADO
    //Ao lançarmos uma exceção aqui estamos quebrando o princípio de
    //Liskov Substitution pois a classe pai BankAccount sempre retorna um
    //valor e neste caso suas filhas devem retornar também, garantindo assim
    //que toda a implementação que use este método irá funcionando recebendo
    //tanto a classe pai quando esta classe filha.
    //Veja que apesar de a indicação de problema estar na classe filha, talvez
    //o problema mesmo esteja na arquitetura da classe pai, que pode estar com
    //mais responsabilidades do que de fato deveria.
    @Override
    public double getOverdraftLimit() {
        throw new RuntimeException("This account doesn't have overdraft limit");
    }

    public double getProfitRateByYear(){
        return 8d;
    }
}
