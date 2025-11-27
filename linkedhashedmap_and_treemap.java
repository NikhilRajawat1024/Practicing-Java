import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class linkedhashedmap_and_treemap {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>(16, 75F, true);

        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");

        // map.get(23);
        // map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        // IT WORK LIKE AN LINKED LIST

        // CONCEPT OF TREEMAP

        SortedMap<Integer, String> map2 = new TreeMap<>();

        map2.put(21, "SJ");
        map2.put(41, "P");
        map2.put(11, "K");
        map2.put(61, "UJ");

        // so it will sort it like 11,21,41,61


        System.out.println(map2.headMap(21));

        System.out.println(map2.tailMap(11));

        System.out.println(map2.firstKey());

        System.out.println(map2.lastKey());
        
    }
}
