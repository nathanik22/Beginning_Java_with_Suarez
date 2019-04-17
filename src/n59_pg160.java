import java.util.Random;
public class n59_pg160
        // Kaden Nathani 4/16/19
        // create 5 integers that are random between 60-100 and then find the minimum
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int x = rand.nextInt(41)+60;
        System.out.println("x = "+x);
        int y = rand.nextInt(41)+60;
        System.out.println("y = " +y);
        int z = rand.nextInt(41)+60;
        System.out.println("z = " +z);
        int a = rand.nextInt(41)+60;
        System.out.println("a = " +a);
        int b = rand.nextInt(41)+60;
        System.out.println("b = "+b);
        int Minimum = Math.min(x, y);
        Minimum = Math.min(Minimum, z);
        Minimum = Math.min(Minimum, a);
        Minimum = Math.min(Minimum, b);
        System.out.println("The smallest number is " +Minimum);
    }
}
