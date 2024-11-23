package com.java;

public class Solution3 {
    public static int[] pushZerosToEnd(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 ) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;

    }
}
