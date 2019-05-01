
import java.util.Scanner;
import java.lang.String;
public class Date {
    public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter a date (month dd, yyyy)");
            String fulldate = scan.nextLine();
            int firstcomma = fulldate.indexOf(",");
            System.out.println("Date in lower case letters: "+fulldate.toLowerCase());
            System.out.println("First letter of month is: "+fulldate.substring(0,1));
            System.out.println("Year is: "+fulldate.substring(firstcomma+2));
    }
}

