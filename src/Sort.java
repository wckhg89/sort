import java.util.Comparator;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public interface Sort <T> extends Comparator<T> {
    void sort(List<T> values);

    default void swap(int idx1, int idx2, List<T> values) {
        T tmp = values.get(idx1);
        values.set(idx1, values.get(idx2));
        values.set(idx2, tmp);
    }
}
