public class n53_pg160
    // Kaden Nathani 4/16/19
        // create 2 integers that are random between 0-100 and then find the minimum
{
    public static void main(String[] args)
    {
        int x = (int)(Math.random()*100);
        int y = (int)(Math.random()*100);
        int Minimum = Math.min(x, y);
        System.out.println("The smallest number is " +Minimum);
    }
}