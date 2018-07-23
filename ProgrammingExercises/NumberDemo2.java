import java.util.Scanner;
public class NumberDemo2
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
            System.out.println("Enter an integer" + ">>>");
            num1 = keyboard.nextInt();
            System.out.println("Enter an integer" + ">>>");
            num2 = keyboard.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquard(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquard(num2);
    }
    private static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    private static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    private static void displayNumberSquard(int n)
    {
        System.out.println(n + " square is " + (n * n));
    }

}
