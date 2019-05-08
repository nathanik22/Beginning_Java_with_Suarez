import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NamesUser {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
//        System.out.println(" ");
//        String space = input.next();
//        System.out.println("");
//        String nothing = input.next();
        System.out.println("What name do you want to find?");
        String theirname = input.next();
        File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/names");
        Scanner sc = new Scanner(fileinput);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineinput = new Scanner(line);
                String name = lineinput.next();
                while(name.equalsIgnoreCase(theirname))
                {
                    System.out.println(line);
                    break;
                }

            }


    }
}
