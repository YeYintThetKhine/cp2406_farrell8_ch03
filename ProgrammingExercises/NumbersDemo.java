public class NumbersDemo
{
    public static void main(String args[])
    {
        int num1 = 4, num2 = 55;
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquard(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquard(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquard(int n)
    {
        System.out.println(n + " square is " + (n * n));
    }

}
