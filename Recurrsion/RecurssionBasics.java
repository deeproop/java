package Recurrsion;

public class RecurssionBasics {
    // public static void printDec(int n ) {
    //     if(n==1) {
    //         System.out.println(n);
    //         return;
    //     }
        
    //     System.out.print(n + " ");
    //     printDec(n-1);
    // }

    // public static void printInc(int n) {
    //     if(n==1) {
    //         System.out.print(n+ " ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n + " ");
    // }

    public static int fact( int n ) {
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int fibo(int n ) {
        if(n ==0 )
        return 0;
        if(n == 1)
        return 1;
        
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String args[]) {
        int n =10;
        System.out.print(fibo(6));
    }
}
