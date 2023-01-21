import java.util.*;

public class Reverse {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int reverse = 0;
         int num;
         while(number > 0) {
            num = number%10;
            reverse = reverse*10 + num;
            number = number/10;
         }
         System.out.println(reverse);
    }
}