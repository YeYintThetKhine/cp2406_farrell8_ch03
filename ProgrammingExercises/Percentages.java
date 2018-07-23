public class Percentages
{
    public static void main(String[] args)
    {
        double num1 = 4.2, num2 =2.2;
        ComputePercent(num1, num2);
        ComputePercent(num2, num1);
    }
    private static void ComputePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
