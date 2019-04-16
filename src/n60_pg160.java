public class n60_pg160
//Create 3 random from 0-50 and then calculate average of the three to the nearest tenth
{
    public static void main(String[] args)
    {
        double x = (int) (Math.random() * 50);
        double y = (int) (Math.random() * 50);
        double z = (int) (Math.random() * 50);
        double average = (x+y+z)/3;
        System.out.printf("The average of the three random variables is: %.1f%n ", average);
    }
}
