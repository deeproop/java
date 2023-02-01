package Hashing;
import java.util.*;

public class Iteration {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("Nepal", 10);

        //Iterate
        //keySet()
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k: keys) {
        //     System.out.println("key: "+k+" value: "+hm.get(k));
        // }

        //Iterate
        //entrySet()
        Set<Map.Entry<String, Integer>> keys = hm.entrySet();
        System.out.println(keys);

        // for (String k: keys) {
        //     System.out.println("key: "+k+" value: "+hm.get(k));
        // }
    }
}
