package Patterns;

public class CharacterPattern {
    public static void main (String args[]) {
        char ch = 'A';
        for(int line = 0; line<4; line++) {
            for(int character = 0; character <=line; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
