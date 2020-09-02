package io.github.alissonlima.solid.singleresponsability.correct;

import io.github.alissonlima.db.WalletEntity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    //CORRETO
    //Aqui a responsabilidade de realizar a conversão de double para String formatada
    //está em um objeto específico.
    public static String getWalletValueInBRText (WalletEntity walletEntity){
        NumberFormat nf = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        return nf.format(walletEntity.getValue());
    }
}
