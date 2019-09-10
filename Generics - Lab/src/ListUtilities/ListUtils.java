package ListUtilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils <T> {

    public static <T extends Comparable<T>> T getMin (List<T> elements){
        checkForEmpty(elements);
        return Collections.min(elements);
    }
    public static <T extends Comparable<T>> T getMax (List<T> elements){
        checkForEmpty(elements);
        return Collections.max(elements);
    }
    private static <T> T checkForEmpty(List<T> elements){
        if (elements.isEmpty()){
            throw new IllegalArgumentException();
        }
        return null;
    }
}
