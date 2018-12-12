package homeworkLesson7Tasck1;

import java.util.Comparator;
import java.util.List;

public class Max {
    static <T> T max(List<T> list, Comparator<T> comparable) {

        list.sort(comparable);

        return list.get(list.size() - 1);
    }
}
