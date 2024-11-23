package com.java.oLogN;

import java.util.Arrays;

public class Solution {
    public static int getSecondLargest(int[] arr) {

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] != largest){
                return arr[i];

            }
        }
        return -1;
    }


}