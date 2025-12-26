import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        System.out.println("Enter a withdrawal amount");
        int amount= sc.nextInt();
        if (amount<=balance) {
            System.out.println("Withdrawal Successfully");
            balance = balance - amount;
            System.out.println("Remaining Balance "+balance);
        }
        else {
            System.out.println("Insufficient Balance");

        }
    }
}
