import java.util.Comparator;
import java.util.List;

/**
 * Created by kanghonggu on 2017. 5. 25..
 */
public interface Sort <T> extends Comparator<T> {
    List<T> sort();
    List<T> swap(int idx1, int idx2);
}
