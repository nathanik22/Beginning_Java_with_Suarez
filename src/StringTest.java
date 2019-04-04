import java.util.*;
public class StringTest
{
    public static void main(String[] args) {
        String fullname;
        String firstname;
        int space;
        int length;
        String lastname;
        String capitalname;
        char initial;
        int zero = 0;
        System.out.println("What is your first and last name?");
        String diddy = "Diddy";
        String izzle = "-izzle";
        Scanner sc = new Scanner(System.in);
        fullname = sc.nextLine();
        space = fullname.indexOf (" ");
        firstname = fullname.substring(0, space);
        lastname = fullname.substring(space+1);
        initial = firstname.charAt(0);
        //"M. Diddy SIMPSON Marge-izzle"
        lastname = lastname.toUpperCase();
        System.out.println("Your 'gangsta name' is " +initial+". " + diddy +" " + lastname + " " +firstname + izzle);

    }

}
