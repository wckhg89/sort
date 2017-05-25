import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */

public class BubbleSortTest {

    private Sort bubbleSort;

    private List<Integer> values;

    @Before
    public void init () {
        this.values = Arrays.asList(5,4,3,2,1);
    }

    @Test
    public void 정렬_테스트 () {
        bubbleSort = new BubbleSort();
        bubbleSort.sort(values);

        assertEquals(Arrays.asList(1,2,3,4,5), values);
    }

    @Test
    public void 스왑_테스트 () {
        bubbleSort = new BubbleSort();
        bubbleSort.swap(0,1, values);

        assertEquals(Arrays.asList(4,5,3,2,1), values);
    }

}
