package com.java.o2N;

public class Solution1 {
    public int getSecondLargest(int[] arr) {

        int biggest = Integer.MIN_VALUE;
        int secondLargest = -1;
        for (int n : arr) {
            if (n > biggest) {
                biggest = n;
            }
        }
        for(int n: arr){
            if(n != biggest && secondLargest < n ){
                secondLargest = n;
            }
        }

        return secondLargest;
    }


}