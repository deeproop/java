package String;

import java.util.*;

public class Practice {
    public static boolean checkAnagram(String str, String str1) {
        char tempA[] = str.toCharArray();
        Arrays.sort(tempA);
        char tempB[] = str1.toCharArray();
        Arrays.sort(tempB);
        return Arrays.equals(tempA, tempB);


    }
    public static void main(String args[]) {
        String str = "abcd";
        String str1 = "dcabe";
        System.out.print(checkAnagram(str,str1));
    }
}
