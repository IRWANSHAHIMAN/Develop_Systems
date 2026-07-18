import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        char choice;

        System.out.print("First Number : ");
        num1 = input.nextDouble();

        System.out.print("Second Number : ");
        num2 = input.nextDouble();

        System.out.print("Operation (+,-,*,/) : ");
        choice = input.next().charAt(0);

        switch(choice)
        {
            case '+':
                System.out.println("Answer = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Answer = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Answer = " + (num1 * num2));
                break;

            case '/':
                System.out.println("Answer = " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operation");
        }
    }
}