package pl.sda.sort.impl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by Miki on 23.02.2017.
 */
public class CountSortTest {

    @Test
    public void CountSortTest() {

        //given
        int[] input = {5, 4, -3, 2, 1};
        Sort sorter = new CountSort();



        //when
        try
        {
            int[] result = sorter.sort(input);
            fail();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("excetion");
        }

        //then
    }

}
