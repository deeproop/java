package Hashing;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,5,2,1,3,1,1,2,2,2};
        int MajorityElement = arr.length/3;
        HashMap<Integer, Integer> hm = new HashMap<>();

        //TC - O(n)
        
        for(int i=0; i<arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) +1);
        }

        for(Integer k: hm.keySet()) {
            if(hm.get(k) > MajorityElement)
                System.out.println(k);
        }
        
    }
}
