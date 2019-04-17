public class n59_pg160
        // Kaden Nathani 4/16/19
        // create 5 integers that are random between 60-100 and then find the minimum
{
    public static void main(String[] args)
    {
        int x = (int) (Math.random() * 40 + 60);
        int y = (int) (Math.random() * 40 + 60);
        int z = (int) (Math.random() * 40 + 60);
        int a = (int) (Math.random() * 40 + 60);
        int b = (int) (Math.random() * 40 + 60);
        int Minimum = Math.min(x, y);
        Minimum = Math.min(Minimum, z);
        Minimum = Math.min(Minimum, a);
        Minimum = Math.min(Minimum, b);
        System.out.println("The smallest number is " +Minimum);
    }
}
