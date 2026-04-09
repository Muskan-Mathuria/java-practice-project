import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your character");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' || ch >= 'Z' || ch >= 'a' || ch >= 'z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("enter character is vowel");
            } else {
                System.out.println("enter character is consonants");
            }
        }
    }
}
