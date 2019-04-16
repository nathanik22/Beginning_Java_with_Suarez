public class n53_pg160
    // create 2 integers that are random and then find the minimum
{
    public static void main(String[] args)
    {
        int x = (int)(Math.random()*100);
        int y = (int)(Math.random()*100);
        int Minimum = Math.min(x, y);
        System.out.println("The smallest number is " +Minimum);
    }
}
