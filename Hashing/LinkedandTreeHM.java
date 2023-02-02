package Hashing;
import java.util.*;

public class LinkedandTreeHM {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",10);
        lhm.put("Nepal",50);
        System.out.println("LinkedHashMap");
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",10);
        hm.put("Nepal",50);
        System.out.println("HashMap");
        System.out.println(hm);

        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India",100);
        thm.put("China",10);
        thm.put("Nepal",50);
        System.out.println("TreeHashMap");
        System.out.println(thm);
    }
}
