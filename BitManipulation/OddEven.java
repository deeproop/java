package BitManipulation;
import java.util.*;
public class OddEven {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.print("even number");
        }
        else {
            System.out.print("odd number");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        OddOrEven(n);
    }
}
