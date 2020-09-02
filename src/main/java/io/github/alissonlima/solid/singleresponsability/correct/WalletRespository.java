package io.github.alissonlima.solid.singleresponsability.correct;

import io.github.alissonlima.db.DB;
import io.github.alissonlima.db.WalletEntity;

public class WalletRespository {

    public WalletEntity getById(long id){
        return DB.walletEntityList.stream()
                .filter(walletEntity -> walletEntity.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addWallet(WalletEntity walletEntity){
        if (walletEntity.getId() == 0){
            throw new RuntimeException("Is must have an ID assinged");
        }
        if (getById(walletEntity.getId()) != null){
            throw new RuntimeException("There is already an wallet with ID " + walletEntity.getId());
        }
        DB.walletEntityList.add(walletEntity);
    }
}
