import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public class SelectionSort implements Sort<Integer> {
    @Override
    public void sort(List<Integer> values) {
        int minIdx;
        // todo : 최소값 찾기
        for (int i = 0 ;  i < values.size() - 1 ; i++) {
            minIdx = i;
            for (int j = i+1 ; j < values.size() ; j++) {
                if (values.get(j) < values.get(minIdx)) {
                    minIdx = j;
                }
            }
            // todo : 첫번째 자리랑 바꾸기
            this.swap(i, minIdx, values);
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}
