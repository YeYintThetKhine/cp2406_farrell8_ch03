import java.util.Scanner;
public class Percentage2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter an integer" + ">>>");
        num1 = keyboard.nextInt();
        System.out.println("Enter an integer" + ">>>");
        num2 = keyboard.nextInt();
        ComputePercent(num1, num2);
        ComputePercent(num2, num1);
    }
    private static void ComputePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}