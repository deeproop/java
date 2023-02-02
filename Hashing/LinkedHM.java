package Hashing;
import java.util.*;

public class LinkedHM {
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
    }
}
