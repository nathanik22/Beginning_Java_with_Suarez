import java.util.*;
public class CashierTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me price \nWhen you are done type 'no'");
        double price = 0;
        double total = 0;
        String ifno = "";
        int count = 0;
        do{
            ifno = sc.next();
            if (!(ifno.equalsIgnoreCase("no"))) {
                try
                {
                    price = Double.valueOf(ifno);

                }
                catch(NumberFormatException nfe){
                    System.out.println("Unrecognizable input");
                    count--;
                }
                total = total + price;
                count++;
            }
        }
        while(!(ifno.equalsIgnoreCase("no")));
        System.out.print("You purchased "+count+" items and the total is $"+total);
    }
}
