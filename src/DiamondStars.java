/*
Kaden Nathani
Make a Diamond using two methods
March 27, 2019
Ver3
 */
public class DiamondStars {
    public static final int Size = 4;
    public static void main( String[] args){
        diamondMethod("/","**","\\");
        System.exit(0);

    }
    public static void diamondMethod(String beg, String inside, String end)   // Defining the Diamond with the other two methods
    {
        Top(beg, inside, end);Bot(end, inside, beg);
    }
    public static void diamondMethodReverse(String end, String inside, String beg)
    {
        Bot(end, inside, beg);Top(beg, inside, end);
    }
    public static void Top(String beg, String inside, String end) // Defining the Top of Diamond with println statements
    {
        for (int counter = 1; counter <= Size; counter++) {
        for(int space = 1; space <= -counter+Size; space++)
        {
            System.out.print(" ");
        }
        System.out.print(beg);
        for(int space = 1; space < counter; space++)
        {
            System.out.print(inside);
        }
        System.out.println(end);

    }


    }
    public static void Bot(String beg, String inside, String end) //Defining the Bottom of Diamond with println statements
    {

        for (int counter = Size; counter > 0; counter--) {
            for(int space = 1; space <= -counter+Size; space++)
            {
                System.out.print(" ");
            }
            System.out.print(beg);
            for(int space = 1; space < counter; space++)
            {
                System.out.print(inside);
            }
            System.out.println(end);


    }

}}
