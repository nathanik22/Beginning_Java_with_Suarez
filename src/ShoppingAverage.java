import java.util.*;
import java.io.*;
public class ShoppingAverage {
    public static void main(String[] args) throws IOException{
        File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/Shopping.txt");
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner lineinput = new Scanner(line);
            String name = lineinput.next();
            double count = 0;
            double total = 0;
            while(lineinput.hasNextDouble())
            {
                   total= total + lineinput.nextDouble();
                   count++;
            }
            double average = total/count;
            System.out.printf("The average of the %s prices is $%.2f \n",name, average);

        }
    }
}