package Java.pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.decorator.SortDecoratorWithRevers;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;

/**
 * Created by Miki on 27.02.2017.
 */
public class DecoratorTest  {
    @Test
    public void testDecorator(){

        //given
        int[] arrayToSort = new int[] {1,99,2};
        int[] expectedResult = new int[] {99,2,1};
        Sort sortWithRevers = new SortDecoratorWithRevers(new BubbleSort());

        //when
        int[] result = sortWithRevers.sort(arrayToSort);

        //then
        Assert.assertArrayEquals(expectedResult,result);


    }
}
