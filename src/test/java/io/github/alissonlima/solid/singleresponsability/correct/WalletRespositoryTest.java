package io.github.alissonlima.solid.singleresponsability.correct;

import io.github.alissonlima.db.DB;
import io.github.alissonlima.db.WalletEntity;
import io.github.alissonlima.solid.singleresponsability.wrong.WalletRespository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WalletRespositoryTest {

    static io.github.alissonlima.solid.singleresponsability.wrong.WalletRespository walletRespository;

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
}
