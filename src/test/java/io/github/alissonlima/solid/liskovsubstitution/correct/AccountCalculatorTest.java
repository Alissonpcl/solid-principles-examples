package io.github.alissonlima.solid.liskovsubstitution.correct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountCalculatorTest {

    @Test
    void getValueAvailableTest() {
        assertEquals(100d, new AccountCalculator().getValueAvailable(new BankAccount()));
    }

    @Test
    void getValueAvailableChekingAccountTest() {
        assertEquals(1100d, new AccountCalculator().getValueAvailable(new ChekingAccount()));
    }

    @Test
    void getValueAvailableSavingsCountTest() {
        assertEquals(10800, new AccountCalculator().getValueAvailable(new SavingsAccount()));
    }
}
