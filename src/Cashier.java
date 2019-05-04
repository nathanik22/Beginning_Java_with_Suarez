import java.util.*;
public class Cashier
{
    public static void main(String[] args)
    {
        System.out.println("-------------------");
        System.out.println("|Beans     = $1.79|");
        System.out.println("|Chips     = $3.79|");
        System.out.println("|Soda      = $3.89|");
        System.out.println("|Steak     = $8.76|");
        System.out.println("|Chicken   = $6.73|");
        System.out.println("|Ice Cream = $4.59|");
        System.out.println("|Popsicles = $3.65|");
        System.out.println("-------------------");
        double beans = 1.79;
        double chips = 3.79;
        double soda = 3.89;
        double steak = 8.76;
        double chicken = 6.73;
        double icecream = 4.59;
        double popsicles = 3.65;
        double total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have any items to scan? (Yes or No)");
        String answer = input.next();
        // check if the input is yes
        String list = "";
        while (answer.equalsIgnoreCase("yes") && ! list.equalsIgnoreCase("no") && ! list.equalsIgnoreCase("Finish and Pay") && ! list.equalsIgnoreCase("cancel"))
        {
            System.out.println("List what items you want to scan. When you are done type Finish and Pay. If you want to cancel type cancel");
            while (answer.equalsIgnoreCase("yes") && !list.equalsIgnoreCase("Finish and Pay") && !list.equalsIgnoreCase("cancel")) {
                list = input.nextLine().toLowerCase();
                switch (list) {
                    case "beans":
                        total = total + beans;
                        break;
                    case "chips":
                        total = total + chips;
                        break;
                    case "soda":
                        total = total + soda;
                        break;
                    case "steak":
                        total = total + steak;
                        break;
                    case "chicken":
                        total = total + chicken;
                        break;
                    case "ice cream":
                        total = total + icecream;
                        break;
                    case "popsicles":
                        total = total + popsicles;
                        break;
                    case "finish and pay":
                        System.out.printf("Total is $%.2f", total);
                        break;
                    case "":
                        break;
                    case "cancel":
                        System.out.println("Canceled");
                        break;
                    default:
                        System.out.println("Sorry I don't recognize this item, please check for spelling and capitalization errors");
                        break;
                }

            }
        }
    }
}
