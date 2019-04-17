import java.util.Random;
public class n53_pg160
    // Kaden Nathani 4/16/19
        // create 2 integers that are random between 0-100 and then find the minimum
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println("x = "+x);
        int y = rand.nextInt(100);
        System.out.println("y = "+y);
        int Minimum = Math.min(x, y);
        System.out.println("The smallest number is " +Minimum);
    }
}
