package io.github.alissonlima.solid.singleresponsability.correct;

import io.github.alissonlima.db.WalletEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyFormatterTest {

    @Test
    void getWalletValueInBRTextTest() {
        WalletEntity walletEntity = new WalletEntity(1, 10d);
        assertEquals("R$ 10,00", MoneyFormatter.getWalletValueInBRText(walletEntity));
    }
}
