package io.github.alissonlima.solid.singleresponsability.wrong;

import io.github.alissonlima.db.DB;
import io.github.alissonlima.db.WalletEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WalletRespositoryTest {

    static WalletRespository walletRespository;

    @BeforeAll
    static void init(){
        walletRespository = new WalletRespository();
    }

    @Test
    void getByIdTest() {
        WalletEntity walletEntity = walletRespository.getById(1);
        assertNotNull(walletEntity);
        assertEquals(5d, walletEntity.getValue());
    }

    @Test
    void addWalletTest() {
        int actualSize = DB.walletEntityList.size();
        walletRespository.addWallet(new WalletEntity(new Random().nextLong(), 20d));
        assertEquals(++actualSize, DB.walletEntityList.size());
    }

    @Test
    void addWalletWithErrorTest() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            walletRespository.addWallet(new WalletEntity(0, 20d));
        });
    }

    @Test
    void getWalletValueInBRTextTest() {
        WalletEntity walletEntity = walletRespository.getById(2);
        assertEquals("R$ 10,00", walletRespository.getWalletValueInBRText(walletEntity));
    }
}
