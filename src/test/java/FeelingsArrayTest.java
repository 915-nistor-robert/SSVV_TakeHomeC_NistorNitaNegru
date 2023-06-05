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
}