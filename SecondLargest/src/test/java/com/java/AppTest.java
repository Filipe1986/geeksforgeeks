package com.java;


import com.java.oLogN.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest  {

    @Test
    public void AppTestSolution() {

        Assertions.assertEquals(5, Solution.getSecondLargest(new int[]{10, 5, 10}));

    }




}
