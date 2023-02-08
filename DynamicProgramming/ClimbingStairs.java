package DynamicProgramming;
import java.util.*;
//Count ways to reach the nth stair. The person can climb either 1 stair or 2 stair at a time.
public class ClimbingStairs {
    //memoization - O(n), normal recurrsioin - O(2^n)
    public static int countWays(int n, int ways[]) {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(ways[n] != -1)
            return ways[n];
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);

        return ways[n];
    }
    
    //Tabulation - O(n)
    public static int countWaysTabulation(int n, int ways[]) {
         ways[0] = 1;

         for(int i=1 ; i<=n; i++) {
            if (i == 1) {
                ways[i] = ways[i-1];
            } else {
                ways[i] = ways[i-1] + ways[i-2];
            }
         }

         return ways[n];
    }
    
    //recurrsion - O(2^n)
    public static int ways(int n) {
        if(n==0)
            return 1;
        if(n<0)
            return 0;

        return ways(n-1) + ways(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];

        System.out.println(countWaysTabulation(n, ways));


    }
}
