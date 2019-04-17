import java.util.Random;
public class n60_pg160
// Kaden Nathani 4/16/19
// Create 3 random from 0-50 and then calculate average of the three to the nearest tenth
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        double x = (int) rand.nextInt(51);
        double y = (int) rand.nextInt(51);
        double z = (int) rand.nextInt(51);
        double average = (x+y+z)/3;
        System.out.println("The three random numbers are: " +x+ " " +y+ " " +z);
        System.out.printf("The average of the three random variables is: %.1f%n ", average);
    }
}
