import java.util.*;
public class set{
    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<>();

        myset.add(24);
        myset.add(35);
        myset.add(35);
        myset.add(67);
        myset.add(35);
        System.out.println(myset);
    }
}