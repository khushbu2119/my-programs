import java.util.HashMap;
import java.util.Map;

public class DuplicateWithFrequency {

    public static void main(String[] args) {
        int array[] = {3,6,5,4,6,5,3,4,6,5,8,3,5,4,8};
        Map<Integer, Integer> map = findDuplicateWithFrequency(array);
        for(int value: map.keySet()) {
            System.out.println("Element: " + value + " Frequency: " + map.get(value) );
        }
    }

    public static Map<Integer, Integer> findDuplicateWithFrequency(int a[]) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int value:a) {
            m.put(value, m.getOrDefault(value,0) + 1);
        }
        return m;
    }
}
