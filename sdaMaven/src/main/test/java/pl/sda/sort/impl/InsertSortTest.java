package pl.sda.sort.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Miki on 23.02.2017.
 */
public class InsertSortTest {

    @Test
    public void InsertSortTest() {

        //given
        int[] input = {5, 4, 3, 2, 1};
        Sort sorter = new InsertSort();



        //when
        int[] result = sorter.sort(input);


        //then
        Assert.assertEquals(1, result[0]);
    }

}
