//it means setting the Ith bit = 1

package BitManipulation;

public class SetIthBit {
    public static int setIthBit(int digit, int n) {
        int bitMask =1<<n;

        return digit | bitMask;

    }
    public static void main(String args[]) {
        int digit = 4;
        int n = 1;
        System.out.print(setIthBit(digit,n));
    }
}
