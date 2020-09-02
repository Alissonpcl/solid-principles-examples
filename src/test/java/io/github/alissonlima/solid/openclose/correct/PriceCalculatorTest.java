package io.github.alissonlima.solid.openclose.correct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceCalculatorTest {

    @Test
    void calculateFinalPriceCashTest() {
        PriceRuler priceRuler = new CashPriceRuler();
        assertEquals(18d, new PriceCalculator(priceRuler).calculateFinalPrice(20d));;
    }

    @Test
    void calculateFinalPriceInstallmentsTest() {
        PriceRuler priceRuler = new InstallmentsPriceRuler();
        assertEquals(50d, new PriceCalculator(priceRuler).calculateFinalPrice(20d));
    }
}
