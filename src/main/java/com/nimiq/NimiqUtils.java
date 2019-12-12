package com.nimiq;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Basic conversion utils.
 */
public class NimiqUtils {

    public static final long LUNAS_PER_COIN = 100_000;

    private static final BigDecimal lunasPerCoin = BigDecimal.valueOf(LUNAS_PER_COIN);

    /**
     * Convert Nimiq decimal to number of Lunas (Satoshis).
     * 
     * @param coins Nimiq count in decimal
     * @return Number of Lunas
     */
    public static long coinsToLunas(BigDecimal coins) {
        return coins.multiply(lunasPerCoin).setScale(0, RoundingMode.HALF_UP).longValue();
    }

    /**
     * Convert number of Lunas (Satoshis) to Nimiq decimal.
     * 
     * @param lunas Number of Lunas
     * @return Nimiq count in decimal
     */
    public static BigDecimal lunasToCoins(long lunas) {
        return BigDecimal.valueOf(lunas).divide(lunasPerCoin);
    }
}
