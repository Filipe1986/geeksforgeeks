package com.java;

public class Solution1 {
    static int[] pushZerosToEnd(int[] arr) {

        int numZeros = 0;
        int [] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numZeros++;
            }else {
                result[i - numZeros] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];

        }
        // System.arraycopy(result, 0, arr, 0, arr.length);

        return arr;

    }
}
