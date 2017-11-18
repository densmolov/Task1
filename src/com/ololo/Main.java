package com.ololo;

import com.tratata.Second;

public class Main {

    private static First first = new First();
    private static Second second = new Second();
    private static Mass1 mass1 = new Mass1();

    public static void main(String[] args) {
        second.print(first.getArr());
        System.out.println("=============================");

        first.printSort((second.getSortedArray(first.getArr())));
        System.out.println("=============================");

        mass1.findInt();
    }

}
