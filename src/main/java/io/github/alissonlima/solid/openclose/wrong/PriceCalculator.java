package io.github.alissonlima.solid.openclose.wrong;

import io.github.alissonlima.solid.openclose.PaymentMethod;

public class PriceCalculator {

    //ERRADO
    //O problema aqui é que este método torna a classe aberta para modificação, pois
    //qualquer alteração nas regras de calculo ou métodos de pagamento exigirá que
    //façamos uma alteração neste método.
    //O lancamento de uma exceção no default de um switch é um ótimo aviso de que
    //a quebra do princípio Open/Close está ocorrendo.
    public double calculateFinalPrice(double actualPrice, PaymentMethod paymentMethod) {
        double txInstallments = 20d;
        double txGateway = 10d;

        switch (paymentMethod) {
            case CASH:
                return actualPrice - calculate10PercentDiscount(actualPrice);
            case INSTALLMENTS:
                return actualPrice + txGateway + txInstallments;
            default:
                throw new RuntimeException("Payment method no implemented");
        }
    }

    private double calculate10PercentDiscount(double actualPrice) {
        return actualPrice * (10d / 100d);
    }
}
