package io.github.alissonlima.solid.singleresponsability.wrong;

import io.github.alissonlima.db.DB;
import io.github.alissonlima.db.WalletEntity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

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

    //ERRADO
    //Este objeto é um repository e sua responsabilidade única deve ser
    //permitir trafegar dados do tipo Wallet entre a aplicação e o Storage
    //A conversão de valores para uma String formatada deve ser realizado
    //por um objeto que tenha esta responsabilidade em específico
    public String getWalletValueInBRText (WalletEntity walletEntity){
        NumberFormat nf = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        return nf.format(walletEntity.getValue());
    }
}
