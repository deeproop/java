package Hashing;
import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String r) {
        if(s.length() != r.length())
            return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0; i<r.length(); i++) {
            if(hm.get(r.charAt(i)) != null){
                if(hm.get(r.charAt(i)) == 1)
                    hm.remove(r.charAt(i));
                else 
                    hm.put(r.charAt(i), hm.get(r.charAt(i))-1 );
            }
            else
                return false;
        }  

        return hm.isEmpty();
        
    }
    public static void main(String[] args) {
        String s = "racm"; //O(n)
        String r = "care";
        System.out.println(isAnagram(s, r));
        
    }
}
