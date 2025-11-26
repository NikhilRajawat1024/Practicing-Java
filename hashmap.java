import java.util.*;
public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer , String> hashmap = new HashMap<>();

        hashmap.put(1, "Nikhil");
        hashmap.put(2 , "Abhimanyu");

        hashmap.putIfAbsent(3, "kanishk");


        for(Map.Entry<Integer , String> entrymap : hashmap.entrySet()){

            int key = entrymap.getKey();
            String name = entrymap.getValue();

            System.out.println("Key :"+key+" Value :"+name);
        }
    }
}
