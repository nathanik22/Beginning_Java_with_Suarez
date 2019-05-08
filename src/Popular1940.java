import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Popular1940 {
        public static void main(String[] args) throws IOException {
            File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/names");
            Scanner sc = new Scanner(fileinput);
            double value = 0;
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
                    while(count == 1940)
                    {
                        if(babynumber>value)
                        {
                            value = babynumber;
                            finalname = name;
                            break;
                        }
                        break;
                    }
                    count = count + 10;
                }


            }
            System.out.println("The most popular baby name in 1940 was "+finalname+"\nThis name was used "+value+" times in 1940");
        }
    }


