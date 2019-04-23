import java.util.Scanner;

public class Smallest3numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a Number Below");
        double num1 = input.nextDouble();
        System.out.println("Enter another Number Below");
        double num2 = input.nextDouble();
        System.out.println("Enter another Number Below");
        double num3 = input.nextDouble();
        double smallest;
        /*
        if num1 < num2 && num1 < num3
            num1 is smallest
        else if num2 < num3
            num2 is smallest
        else
            num3 is smallest
         */
        if (num1<num2 && num1<num3)
        {
            smallest = num1;
        }
        else if (num2<num3)
        {
            smallest = num2;
        }
        else
        {
            smallest = num3;
        }
        System.out.println("The smallest number entered is "+smallest);
}}
