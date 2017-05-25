import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public class BubbleSort implements Sort<Integer> {

    private List<Integer> values;


    public BubbleSort() {
        this.values = new ArrayList<>();
    }

    public BubbleSort(List<Integer> notSortedValues) {
        this.values = notSortedValues;
    }


    @Override
    public List<Integer> sort () {
        for (int i = 0 ; i  < values.size() - 1 ; i++) {
            for (int j = 0 ; j < values.size() - 1 - i ; j++) {

                int val1 = values.get(j);
                int val2 = values.get(j+1);
                int compareValue = this.compare(val1, val2);

                if (compareValue > 0) {
                    this.swap(j, j+1);
                }
            }
        }

        return values;
    }

    @Override
    public List<Integer> swap(int idx1, int idx2) {
        int tmp = values.get(idx1);
        values.set(idx1, values.get(idx2));
        values.set(idx2, tmp);

        return values;
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
