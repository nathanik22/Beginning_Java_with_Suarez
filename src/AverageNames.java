import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AverageNames {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/names");
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner lineinput = new Scanner(line);
            String name = lineinput.next();
            double count = 0;
            double total = 0;
            double average = 0;
            while (lineinput.hasNextDouble()) {
                total = total + lineinput.nextDouble();
                count = count + 10;
            }
            average = Math.round(total/count);
            System.out.printf("%s   %s babies/year \n", name, average );
        }
    }
}
