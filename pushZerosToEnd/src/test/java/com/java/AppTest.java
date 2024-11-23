package com.java;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest  {

    @Test
    public void AppTestSolition1() {

        assertArrayEquals(new int[]{3, 5, 4, 0, 0}, Solution1.pushZerosToEnd(new int[]{3, 0, 5, 4, 0}));
        assertArrayEquals(new int[]{10, 5, 8, 9, 7, 6, 0,  0,  0, 0, 0 , 0}, Solution1.pushZerosToEnd(new int[]{10, 5, 0, 0, 8, 0, 9, 0, 7, 0, 6, 0}));

    }

    @Test
    public void AppTestSolition2() {

        assertArrayEquals(new int[]{3, 5, 4, 0, 0}, Solution2.pushZerosToEnd(new int[]{3, 0, 5, 4, 0}));
        assertArrayEquals(new int[]{10, 5, 8, 9, 7, 6, 0,  0,  0, 0, 0 , 0}, Solution2.pushZerosToEnd(new int[]{10, 5, 0, 0, 8, 0, 9, 0, 7, 0, 6, 0}));

    }

    @Test
    public void AppTestSolution3() {
        assertArrayEquals(new int[]{3, 5, 4, 0, 0}, Solution3.pushZerosToEnd(new int[]{3, 0, 5, 4, 0}));
        assertArrayEquals(new int[]{10, 5, 8, 9, 7, 6, 0,  0,  0, 0, 0 , 0}, Solution3.pushZerosToEnd(new int[]{10, 5, 0, 0, 8, 0, 9, 0, 7, 0, 6, 0}));


    }

    @Test
    public void AppTestSolution4() {
        assertArrayEquals(new int[]{3, 5, 4, 0, 0}, Solution4.pushZerosToEnd(new int[]{3, 0, 5, 4, 0}));
        assertArrayEquals(new int[]{10, 5, 8, 9, 7, 6, 0,  0,  0, 0, 0 , 0}, Solution4.pushZerosToEnd(new int[]{10, 5, 0, 0, 8, 0, 9, 0, 7, 0, 6, 0}));


    }



}
