package io.github.alissonlima.solid.openclose.correct;

public class PriceCalculator {

    private final PriceRuler priceRuler;

    public PriceCalculator(PriceRuler priceRuler) {
        this.priceRuler = priceRuler;
    }

    //CORRETO
    //Aqui o calculo esta vinculado a uma abstração da regra de negócio. Com isso
    //é possível adicionar novas formas de pagamentos ou os valores das formas já
    //existentes sem precisar alterar este método.
    //Assim a classe torna-se aberta para extensão, mas fechada para modificação.
    public double calculateFinalPrice(double actualPrice) {
        return actualPrice + priceRuler.calculateRuleValue(actualPrice);
    }

}
