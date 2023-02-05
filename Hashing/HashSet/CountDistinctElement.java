package Hashing.HashSet;
import java.util.*;

public class CountDistinctElement {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,1,2,6,7,4};
        HashSet<Integer> hs = new HashSet<>();  
        //O(n)
        for(int i=0; i<num.length; i++) {
            hs.add(num[i]);
        }

        System.out.println(hs.size());
    }
    

}
