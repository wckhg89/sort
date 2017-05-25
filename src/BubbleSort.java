import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public class BubbleSort implements Sort<Integer> {


    @Override
    public void sort (List<Integer> values) {
        for (int i = 0 ; i  < values.size() - 1 ; i++) {
            for (int j = 0 ; j < values.size() - 1 - i ; j++) {

                int val1 = values.get(j);
                int val2 = values.get(j+1);

                if (this.compare(val1, val2) > 0) {
                    this.swap(j, j+1, values);
                }
            }
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
