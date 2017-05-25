import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public class InsertionSort implements Sort<Integer> {
    @Override
    public void sort(List<Integer> values) {
        int size = values.size();
        int tmp;
        int pivot;

        for(int i = 1; i < size ; i++){
            tmp = values.get(i);
            pivot = i-1;

            while (pivot >= 0 && tmp < values.get(pivot)) {
                values.set(pivot+1, values.get(pivot));
                pivot--;
            }

            values.set(pivot+1, tmp);
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}
