package DynamicProgramming.Knapsack;
import java.util.*;

//given val and weight of n items and W capacity of knapsack find the max value obtained by putting items in knapsack.

public class FractionalKnapsackGreedy {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col -> idx , 1st col -> ratio
        for(int i=0; i<val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int finalVal =0;

        for(int i=ratio.length -1; i>=0; i--) {
            int indx = (int)ratio[i][0];
            if(capacity >= weight[indx]) { //include full item
                finalVal += val[indx];
                capacity -= weight[indx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break; 
            }
        }

        System.out.println("final value: " + finalVal);
    }
}
