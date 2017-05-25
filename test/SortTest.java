import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */

public class SortTest {

    private Sort bubbleSort;
    private Sort selectionSort;
    private Sort innsertionSort;

    private List<Integer> values;

    @Before
    public void init () {
        this.values = Arrays.asList(5,4,3,2,1);
    }

    @Test
    public void 버블_정렬_테스트 () {
        bubbleSort = new BubbleSort();
        bubbleSort.sort(values);

        assertEquals(Arrays.asList(1,2,3,4,5), values);
    }

    @Test
    public void 선택_정렬_테스트 () {
        selectionSort = new SelectionSort();
        selectionSort.sort(values);

        assertEquals(Arrays.asList(1,2,3,4,5), values);
    }

    @Test
    public void 삽입_정렬_테스트 () {
        innsertionSort = new InsertionSort();
        innsertionSort.sort(values);

        assertEquals(Arrays.asList(1,2,3,4,5), values);
    }

    @Test
    public void 스왑_테스트 () {

        Sort sort = new Sort() {
            @Override
            public void sort(List values) {

            }

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        sort.swap(0,1, values);

        assertEquals(Arrays.asList(4,5,3,2,1), values);
    }

}
