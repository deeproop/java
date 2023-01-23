package BitManipulation;

public class IthBit {
    public static void getIthBit(int digit, int n) {
        int bitMask = 1<<n;

        if((digit & bitMask) == 0) {
            System.out.print("Ith bit is: 0");
        }
        else {
            System.out.println("Ith bit is 1");
        }

    }
    public static void main(String args[]) {
        int digit = 4;
        int n = 1;
        getIthBit(digit,n);
    }
}
