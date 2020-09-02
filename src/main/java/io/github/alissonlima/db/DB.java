package io.github.alissonlima.db;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<WalletEntity> walletEntityList =  new ArrayList<WalletEntity>(){
        {
            add(new WalletEntity(1, 5d));
            add(new WalletEntity(2, 10d));
            add(new WalletEntity(3, 15d));
        }
    };
}
