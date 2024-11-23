package com.java;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution4 {
    public static int[] pushZerosToEnd(int[] arr) {

        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> nonZeroElements = list.stream()
                .filter(i -> i != 0)
                .collect(Collectors.toList());

        int zeroCount = (int) list.stream()
                .filter(i -> i == 0)
                .count();

        nonZeroElements.addAll(Collections.nCopies(zeroCount, 0));
        list.clear();
        list.addAll(nonZeroElements);


        return list.stream().mapToInt(i -> i).toArray();

    }
}
