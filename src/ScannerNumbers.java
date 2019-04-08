import java.util.Scanner;
public class ScannerNumbers
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Low Value Below");
        double lownumber = input.nextDouble();
        System.out.println("Enter High Value Below");
        double highnumber = input.nextDouble();
        double total = 0;
        for (double h = lownumber; h<= highnumber; h++)
        {
            total+=h;
        }
        System.out.println("The low is " +lownumber);
        System.out.println("The high is " +highnumber);
        System.out.println("The total is " +total);
    }
}
