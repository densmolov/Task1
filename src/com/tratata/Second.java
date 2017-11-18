package com.tratata;

import java.util.Arrays;

public class Second {

    public void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public String[] getSortedArray(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
