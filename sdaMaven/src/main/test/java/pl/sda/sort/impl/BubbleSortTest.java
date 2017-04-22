package pl.sda.sort.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Miki on 23.02.2017.
 */
public class BubbleSortTest {

    @Test
    public void testSort() {

        //given
        int[] input = {55, 61, 7, -6, 4, -15};
        int[] inputExpected = {-15, -6, 4, 7, 55, 61,};
        Sort sorter = new BubbleSort();


        //when
        int[] result = sorter.sort(input);


        //then
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-6, result[1]);
        Assert.assertEquals(-15, result[0]);
        Assert.assertArrayEquals(result,inputExpected);


    }
}
