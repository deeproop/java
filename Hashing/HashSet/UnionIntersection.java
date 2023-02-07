package Hashing.HashSet;
import java.util.*;

public class UnionIntersection {
    public static int Intersection(int arr1[], int arr2[]) {
        int count = 0;

        HashSet<Integer> hs = new HashSet<>();
        //O(n+m)
        for(int i=0; i<arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            if(hs.contains(arr2[i])) {
                count ++;
                hs.remove(arr2[i]);
            }
        }

        return count;
    }

    public static HashSet<Integer> Union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++)
            hs.add(arr1[i]);
        
        for(int i=0; i<arr2.length; i++)
            hs.add(arr2[i]);
        return hs;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        //Intersection
        System.out.println(Intersection(arr1, arr2));

        //Union
        System.out.println("Union" + Union(arr1, arr2));
    }
}
