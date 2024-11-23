package com.java.oN;

public class Solution1 {
    public int getSecondLargest(int[] arr) {

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }


}