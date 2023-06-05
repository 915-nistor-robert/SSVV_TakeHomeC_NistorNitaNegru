import org.junit.Test;

import static org.junit.Assert.*;

public class FeelingsArrayTest {

    @Test
    public void findSadFeeling() {
        // black box test
        FeelingsArray feelingsArray = new FeelingsArray(new int[]{-1, -1, 0, 0, 1, 1, -1, 1, 0, -1, 1, 0, 1, 1, -1, 0, 1, 1});
        assertEquals(0, feelingsArray.findSadFeeling(0));
        assertEquals(1, feelingsArray.findSadFeeling(1));
        assertEquals(9, feelingsArray.findSadFeeling(7));
        assertEquals(14, feelingsArray.findSadFeeling(10));
        assertEquals(-1, feelingsArray.findSadFeeling(15));
        assertEquals(-1, feelingsArray.findSadFeeling(16));

    }

    @Test
    public void testBeHappy() {

        // random sad feelings
        FeelingsArray feelingsArray = new FeelingsArray(new int[]{-1, 0, 1, 1, -1, 1, 0, -1,-1});

        feelingsArray.beHappy();

        int[] expectedFeelings =  new int[]{1, -1, 1, 0, 1, 1, -1, 1, 0, 1, -1, 1, 1, -1, 1};
        assertArrayEquals(expectedFeelings, feelingsArray.getFeelings());

        // no sad feelings
        FeelingsArray feelingsArray1 = new FeelingsArray(new int[]{1, 0, 1, 1, 1, 1, 0, 1,1});
        feelingsArray1.beHappy();

        expectedFeelings =  new int[]{1, 0, 1, 1, 1, 1, 0, 1,1};
        assertArrayEquals(expectedFeelings, feelingsArray1.getFeelings());

        // only sad feelings
        FeelingsArray feelingsArray2 = new FeelingsArray(new int[]{-1,-1,-1,-1});
        feelingsArray2.beHappy();

        expectedFeelings =  new int[]{1, -1, 1, -1, 1, -1, 1, 1, -1, 1};
        assertArrayEquals(expectedFeelings, feelingsArray2.getFeelings());


    }
}