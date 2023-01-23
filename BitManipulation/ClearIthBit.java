// this means setting the ith bit to 0
package BitManipulation;

public class ClearIthBit {
    public static int clearIthBit(int digit, int n) {
        int bitMask = ~(1<<n);

        return digit & bitMask;
    }
    public static void main(String[] args) {
        int digit = 10;
        int n = 1;
        System.out.print(clearIthBit(digit,n));
    }
}
