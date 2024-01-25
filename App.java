import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the Second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter an Operator (+, -, *, /)");
        char ch = input.next().charAt(0);

        double result = 0;

        switch (ch) {
            case '+': result = num1 + num2;
            break;

            case '-': result = num1 - num2;
            break;

            case '*': result = num1 * num2;
            break;

            case '/': result = num1 / num2;
            break;
        
            default: System.out.println("Invalid Operator!");
            break;
        }
        System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
    }
}
