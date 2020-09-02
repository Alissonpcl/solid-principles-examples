package io.github.alissonlima.solid.openclose.wrong;

import io.github.alissonlima.solid.openclose.PaymentMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void calculateFinalPriceCashTest() {
        assertEquals(18d, new PriceCalculator().calculateFinalPrice(20d, PaymentMethod.CASH));
    }

    @Test
    void calculateFinalPriceInstallmentsTest() {
        assertEquals(50d, new PriceCalculator().calculateFinalPrice(20d, PaymentMethod.INSTALLMENTS));
    }
}
