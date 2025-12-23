import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter operation:+,-,*,/,%,>,<,=");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            case '>':
                System.out.println(num1 > num2);
                break;
            case '<':
                System.out.println(num1 < num2);
                break;
            case '=':
                System.out.println(num1 == num2);
                break;
                default:
                    System.out.println("Invalid operators");
        }
    }
}
