package Hashing.HashSet;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("China");
        hs.add("Delhi");
        hs.add("Nepal");
        
        //using iterator
        // Iterator it = hs.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //using advance loop
        for(String city: hs) {
            System.out.println(city);
        }
    }
}
