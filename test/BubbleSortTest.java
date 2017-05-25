import jdk.nashorn.internal.ir.annotations.Immutable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */

import static org.junit.Assert.*;

public class BubbleSortTest {

    private Sort bubbleSort;

    private List<Integer> notSortedValues;

    @Before
    public void init () {
        this.notSortedValues = Arrays.asList(5,4,3,2,1);
    }

    @Test
    public void 정렬_테스트 () {
        bubbleSort = new BubbleSort(notSortedValues);

        List<Integer> expectedList = Arrays.asList(1,2,3,4,5);
        assertEquals(expectedList, bubbleSort.sort());
    }

    @Test
    public void 스왑_테스트 () {
        bubbleSort = new BubbleSort(notSortedValues);

        List<Integer> swapList = bubbleSort.swap(0,1);

        assertEquals(Arrays.asList(4,5,3,2,1), swapList);
    }

}
