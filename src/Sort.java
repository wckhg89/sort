import java.util.Comparator;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public interface Sort <T> extends Comparator<T> {
    void sort(List<T> values);
    void swap(int idx1, int idx2, List<T> values);
}
