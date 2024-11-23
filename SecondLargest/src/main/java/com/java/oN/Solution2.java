package com.java.oN;

public class Solution2 {
    public int getSecondLargest(int[] arr) {

        int secondLargest = -1;
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


}