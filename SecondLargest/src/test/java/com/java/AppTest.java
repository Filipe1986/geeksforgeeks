package com.java;


import com.java.o2N.Solution1;
import com.java.oLogN.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest  {

    @Test
    public void AppTestSolution() {

        Assertions.assertEquals(5, Solution.getSecondLargest(new int[]{10, 5, 10}));

    }


    @Test
    public void AppTestSolution1() {
        Assertions.assertEquals(5, Solution1.getSecondLargest(new int[]{10, 5, 10}));
    }




}
