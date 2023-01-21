package Array;

public class SubArray {
    public static void printSubArray(int arr[]) {
        int n = arr.length;
        int currentSum =0, maxSum =0;
        int start, end;
        for(int i=0; i<n; i++) {
            start =i;
            for(int j=i; j<n; j++) {
                end = j;
                for(int k =start; k<=end; k++) {
                    currentSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("Sum: " + currentSum);
                
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum =0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("max sum: "+maxSum);

        
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        printSubArray(arr);
    }
}
