package Hashing;
import java.util.*;

public class Operations {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Bhutan", 120);

        // System.out.println(hm);
    
        //Get - O(1)
        int population = hm.get("India");
        // System.out.println(population);

        //ContainsKey - O(1) return true or false check where key exist or not
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Us"));

        //Remove - O(1) remvoes the key-value pair
        // System.out.println(hm.remove("India"));
        // System.out.println(hm.remove("pakistan"));

        //Size
        // System.out.println(hm.size());

        //Is Empty
        // System.out.println(hm.isEmpty());

        //clear
        System.out.println(hm);
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
