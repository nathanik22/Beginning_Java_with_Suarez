import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class names58 {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/names");
        Scanner sc = new Scanner(fileinput);
        double value = 58;
        String finalname = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner lineinput = new Scanner(line);
            String name = lineinput.next();
            double count = 1900;
            double total = 0;
            double babynumber = 0;
            while (lineinput.hasNextDouble()) {
                babynumber = lineinput.nextDouble();
                while(count == 1900)
                {
                    if(babynumber == value)
                    {
                        finalname = name;
                        System.out.println("The name that was used "+value+" times in 1900 was "+finalname);
                        break;
                    }
                    break;
                }
                count = count + 10;
            }
        }
    }
}
