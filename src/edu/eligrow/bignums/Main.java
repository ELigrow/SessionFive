package edu.eligrow.bignums;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String wiPop = "5726398";
        String caPop = "38041430";
        String txPop = "26059203";
        BigDecimal WI = new BigDecimal(wiPop);
        BigDecimal CA = new BigDecimal(caPop);
        BigDecimal TX = new BigDecimal(txPop);

        BigDecimal WItoCA = WI.multiply(CA);
        BigDecimal copyCost = new BigDecimal(WItoCA.doubleValue()*(3.23));
        BigDecimal TOTAL = WItoCA.multiply(TX);
        BigDecimal Trees = new BigDecimal(TOTAL.doubleValue()/8333.3);

        System.out.println("If everyone in Wisconsin were to write everyone in California a letter, there would be "
                + WItoCA + " letters!\nIf everyone in Texas were to receive a copy of each letter, there would be "
                + TOTAL + " letters!!!\nThe cost of this at $3.23 a copy would be $" + copyCost + "!!!!!\nAt one page "
                + "per letter his would kill approximately " + Trees + " trees!!!!!!!");

    }
}
