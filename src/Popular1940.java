import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Popular1940 {
        public static void main(String[] args) throws IOException {
            File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/names");
            Scanner sc = new Scanner(fileinput);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineinput = new Scanner(line);
                String name = lineinput.next();
                double count = 1900;
                double total = 0;
                while (lineinput.hasNextDouble()) {
                    double babynumber = lineinput.nextDouble();
                    count = count + 10;
                }
                while(count == 1940)
                {

                }

            }
        }
    }


