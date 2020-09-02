package io.github.alissonlima.solid.liskovsubstitution.wrong;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountCalculatorTest {

    @Test
    void getValueAvailableTest() {
        assertEquals(1100d, new AccountCalculator().getValueAvailable(new BankAccount()));
    }

    @Test
    void getValueAvailableSavingsAccountTest() {
        //A necessidade de validar a Exception nos da um sinal de alerta
        //de que algo pode estar errado em nossa arquitetura
        assertThrows(RuntimeException.class, () -> {
            assertEquals(1100d, new AccountCalculator().getValueAvailable(new SavingsAccount()));
        });
    }
}
