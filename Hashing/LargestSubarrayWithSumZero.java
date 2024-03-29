package Hashing;
import java.util.*;

public class LargestSubarrayWithSumZero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        //(summ, indx)
        int sum=0, len=0;
        
        //O(n)
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(hm.containsKey(sum)){
                len = Math.max(len, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }

        System.out.println("largest sub array with sum 0: " + len);
    }
}
