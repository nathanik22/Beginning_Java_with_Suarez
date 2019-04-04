import java.util.Random;

public class TestingMath
{
    public static void main(String [] args)
    {
        double randomNumber = Math.random(); // ranges from 0 to 1
        double Num1 = Math.random();
        double Num2 = Math.random();
        double Num3 = Math.random();
        double Addition = Num1+Num2+Num3;
        double Multiply = Num1*Num2*Num3;
        Multiply = Math.round(Multiply);
        double Maximum = Math.max(Num1, Num2);
        Maximum = Math.max(Maximum, Num3);
        double Minimum = Math.min(Num1, Num2);
        Minimum = Math.min(Minimum, Num3);
        System.out.println("Here are the values \n    " +Num1+ " \n    " +Num2+ "\n    " +Num3);
        System.out.println(" - The sum of the values" +Addition+ "\n - The product of the values is " +Multiply);
        System.out.println(" - The Max Number is " +Maximum+ "\n - The Min Number is " +Minimum);
        double squareroot= Math.sqrt(Math.abs(Multiply));
        System.out.println(" - The square root of the product of the values is " +squareroot);
        System.out.println(" - Here is a random number - " +Math.random());
        Random random= new Random();


    }
}
