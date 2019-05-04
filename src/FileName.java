import java.util.*;
import java.io.*;
public class FileName {
        public static void main(String[] args) throws IOException{
            File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/input");
            Scanner sc = new Scanner(fileinput);
            int count = 0;
            while (sc.hasNextLine()){
                String lines = sc.nextLine();
                Scanner line = new Scanner(lines);
                System.out.println(lines);
                while(line.hasNextInt())
                {
                    int word = line.nextInt();
                    System.out.println(word);
                    count++;

                }


            }
            System.out.println("There are "+count+" numbers");
        }
    }