package com.ololo;

public class Mass1 {

    private int[] mass1 = {4, 5, 2, 456, 5, 56, 74, 45, 5, 34};

    public void findInt() {
        int total = 0;
        int max = mass1[0];
        int min = mass1[0];
        double avg;

        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] > max) {
                max = mass1[i];
            }
            if (mass1[i] < min) {
                min = mass1[i];
            }
            total += mass1[i];
        }
        avg = total / mass1.length;

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Сумма массива: " + total);
        System.out.println("Среднее: " + avg);

    }
}

