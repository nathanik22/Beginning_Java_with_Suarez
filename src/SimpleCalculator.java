import java.util.*;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        double inp1, inp2;
        Scanner input1 = new Scanner(System.in);
        String operand;
        System.out.println("Welcom to the calculator");
        System.out.println();
        System.out.println("Enter First Value Below");
        inp1 = input1.nextDouble();
        System.out.println("Enter operator (+  -  *  /)");
        Scanner input2 = new Scanner(System.in);
        operand = input2.nextLine();
        System.out.println("Enter Second Value Below");
        Scanner input3 = new Scanner(System.in);
        inp2 = input2.nextDouble();
        switch(operand)
        {
            case"+":
                System.out.printf("Your first value plus your second value is %.2f",inp1+inp2);
                break;
            case"-":
                System.out.printf("Your first value minus your second value is %.2f",inp1-inp2);
                break;
            case"*":
                System.out.printf("Your first value multiplied by your second value is %.2f",inp1*inp2);
                break;
            case"/":
                System.out.printf("Your first value divided by your second value is %.2f",inp1/inp2);
                break;
        }
    }
}
